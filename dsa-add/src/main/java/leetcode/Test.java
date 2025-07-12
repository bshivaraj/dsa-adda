package leetcode;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        List<String> cities=Arrays.asList("Bangalore","Hyderabad","Bangalore","Chennai","Chennai","Delhi","Hyderabad");
        HashMap<String,Integer> map=new HashMap<>();
        for(String s:cities){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        for(String key:map.keySet()){
            System.out.println(key+" - "+map.get(key));
        }
        String input = "StreamAPIExample";
        String vowelsOnly = input.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> "aeiouAEIOU".indexOf(c) != -1)
                .map(String::valueOf)
                .collect(Collectors.joining());

        Allian a1=new Allian(1,"a");
        Allian a2=new Allian(2,"x");
        Allian a3=new Allian(4,"b");
        Allian a4=new Allian(3,"a");

        System.out.println(a1.equals(a2));
        List<Allian> list=Arrays.asList(a1,a2,a3,a4);
        list.sort(new Comparator<Allian>() {
            @Override
            public int compare(Allian o1, Allian o2) {
                //return o1.getName().compareTo(o2.getName());
                return Integer.compare(o1.getId(),o2.getId());
            }
        });


        Student2 s1=new Student2(2,"a");
        Student2 s2=new Student2(1,"a");

      System.out.println(list);


    }
}
class Allian{

    private int id;
    private String name;

    Allian(int id,String name){
        this.id=id;
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Allian{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

record Student2(int id,String name){

    Student2(int id,String name){
        this.id=id;
        this.name=name;
    }

}
