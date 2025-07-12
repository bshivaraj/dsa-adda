/*
package leetcode;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.util.*;

public class IPLPlayoffProbability {

    static class Team {
        String name;
        int currentPoints;
        int matchesLeft;
        int qualifyCount;

        Team(String name, int points,int matchesLeft) {
            this.name = name;
            this.currentPoints = points;
            this.matchesLeft = 0;
            this.qualifyCount = matchesLeft;
        }
    }

    static class Match {
        String teamA, teamB;

        Match(String teamA, String teamB) {
            this.teamA = teamA;
            this.teamB = teamB;
        }
    }

    public static void main(String[] args) throws IOException {
       // getResponse();

        // Initialize teams and current points table
        Map<String, Team> teams = new HashMap<>();
        teams.put("RCB", new Team("RCB", 14,4));
        teams.put("GT", new Team("GT", 12,5));
        teams.put("MI", new Team("MI", 14,3));
        teams.put("DC", new Team("DC", 12,4));
        teams.put("PBKS", new Team("PBKS", 13,4));
        teams.put("LSG", new Team("LSG", 10,4));
        teams.put("KKR", new Team("KKR", 9,4));
        teams.put("RR", new Team("RR", 6,4));
        teams.put("SRH", new Team("SRH", 6,4));
        teams.put("CSK", new Team("CSK", 4,4));

        // List of remaining fixtures (example - update as needed)
        List<Match> fixtures = Arrays.asList(
                new Match("DC", "SRH"),
                new Match("DC", "PBKS"),
                new Match("DC", "GT"),
                new Match("DC", "MI"),
                new Match("LSG", "KKR"),
                new Match("RCB", "CSK"),
                new Match("RCB", "LSG"),
                new Match("RCB", "SRH"),
                new Match("GT", "MI"),
                new Match("LSG", "MI")
        );

        // Count how many matches are left per team
        for (Match match : fixtures) {
            if (teams.containsKey(match.teamA)) {
                teams.get(match.teamA).matchesLeft++;
            }
            if (teams.containsKey(match.teamB)) {
                teams.get(match.teamB).matchesLeft++;
            }
        }

        // Optional: Show matches left per team
        System.out.println("Matches left per team:");
        for (Team team : teams.values()) {
            System.out.printf("%s: %d matches left\n", team.name, team.matchesLeft);
        }

        // Monte Carlo Simulation
        int simulations = 10000;
        Random rand = new Random();

        for (int sim = 0; sim < simulations; sim++) {
            // Copy points for this simulation
            Map<String, Integer> simPoints = new HashMap<>();
            for (Team team : teams.values()) {
                simPoints.put(team.name, team.currentPoints);
            }

            // Simulate each match randomly
            for (Match match : fixtures) {
                String winner = rand.nextBoolean() ? match.teamA : match.teamB;
                simPoints.put(winner, simPoints.get(winner) + 2);
            }

            // Sort by points (desc), using alphabetical order for consistent tiebreaks
            List<Map.Entry<String, Integer>> sorted = new ArrayList<>(simPoints.entrySet());
            sorted.sort((a, b) -> {
                int cmp = b.getValue().compareTo(a.getValue());
                return cmp != 0 ? cmp : a.getKey().compareTo(b.getKey());
            });

            // Handle ties properly: take top 4 distinct teams
            Set<String> qualified = new HashSet<>();
            for (int i = 0; i < sorted.size() && qualified.size() < 4; i++) {
                qualified.add(sorted.get(i).getKey());
            }

            // Increment qualify count for each team that qualified
            for (String team : qualified) {
                teams.get(team).qualifyCount++;
            }
        }

        // Final Output
        System.out.println("\n🏆 Playoff Qualification Probabilities:");
        for (Team team : teams.values()) {
            double probability = (double) team.qualifyCount / simulations * 100;
            System.out.printf("%-4s: %.2f%% chance to qualify (Matches left: %d)\n",
                    team.name, probability, team.matchesLeft);
        }
    }

    private static String getResponse() throws IOException {
        // Example using OkHttp in Java
        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url("https://cricapi.com/api/matches?apikey=abcd1234")
                .build();

        try (Response response = client.newCall(request).execute()) {
            if (response.isSuccessful()) {
                String responseData = response.body().string();
                JSONObject json = new JSONObject(responseData);
                JSONArray matches = json.getJSONArray("matches");

                for (int i = 0; i < matches.length(); i++) {
                    JSONObject match = matches.getJSONObject(i);
                    String team1 = match.getString("team-1");
                    String team2 = match.getString("team-2");
                    String date = match.getString("date");
                    boolean matchStarted = match.getBoolean("matchStarted");

                    System.out.printf("%s vs %s on %s (Started: %s)\n",
                            team1, team2, date, matchStarted);
                }
            }
        }

        return "";
    }


}
*/
