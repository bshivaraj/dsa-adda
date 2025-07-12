package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class CorporateFlightBooking_1109 {
    public static void main(String[] args) {
        //int[][] bookings = {{1,2,10},{2,3,20},{2,5,25}};
        int[][] bookings = {{5,5,30},{5,5,45}};
        int n = 5;
        int[] flightBookings=getFlightBookingDetails(bookings,n);
        Arrays.stream(flightBookings).forEach(x->System.out.print(x+" ,"));
    }

    private static int[] getFlightBookingDetails(int[][] bookings,int n) {
        int[] diff = new int[n + 1];
        for (int i = 0; i < bookings.length; i++) {
            int start = bookings[i][0];
            int end = bookings[i][1];
            int val = bookings[i][2];
            diff[start] += val;
            if (end + 1 <= n) {
                diff[end + 1] -= val;
            }
        }
        int[] res = new int[n];
        res[0] = diff[1];
        for (int i = 1; i < n; i++) {
            res[i] = res[i - 1] + diff[i + 1];
        }
        return res;

    }
}
