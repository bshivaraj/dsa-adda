package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Random;

public class MapAndHashTable {
    public static void main(String[] args) {
       Map<Student1,Integer> map=new HashMap<>();
       String s="jkjnkjnk";
       String t=s.substring(1,5);
       map.put(new Student1(1,"a",100),1);
       map.put(new Student1(1,"a",1001),10);
       map.put(new Student1(2,"a",100),100);
       map.put(new Student1(2,"b",100),1000);

       System.out.print(map.size());
    }
}
class Student1{
    private int id;
    private String name;
    private int sallary;

        Student1(int id, String name, int sallary){
        this.id=id;
        this.sallary=sallary;
        this.name=name;
    }
    @Override
    public int hashCode() {
        return new Random().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
            Student1 s=(Student1) obj;
        return this.id==((Student1) obj).id && Objects.equals(this.name, ((Student1) obj).name) ;
    }
}
