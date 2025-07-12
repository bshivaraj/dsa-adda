package leetcode;

import java.util.*;

public class MyMap {
    public static void main(String[] args) {
        String s="aabc";
        Map<Character,Integer> map=new HashMap<>();

        for(int i=0;i<s.length();i++){
          if(map.containsKey(s.charAt(i))){
              map.put(s.charAt(i),map.get(s.charAt(i))+1);
          }else{
              map.put(s.charAt(i),1);
          }
        }
        System.out.println(map.get('c'));


        Set<Integer> set=new HashSet<>();
        set.add(1);
        set.add(1);
        set.add(2);
       // System.out.println(set);




        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
       // System.out.println(list);
       // System.out.println(map.get(2));
    }

}
class Person{
    private String fName;
    private String lName;

    @Override
    public String toString() {
        return "Person{" +
                "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    private String address;
    private String phoneNumber;

    public Person(String fName, String lName, String address, String phoneNumber) {
        this.fName = fName;
        this.lName = lName;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }




}
