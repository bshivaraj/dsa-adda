package leetcode;

import java.util.*;

public class HashTable {
    public static void main(String[] args) {

        Set<Student> set=new HashSet<Student>();
        set.add(new Student(1,10,"z"));
        set.add(new Student(2,1020,"b"));
        set.add(new Student(5,100,"e"));
        set.add(new Student(4,190,"d"));
        set.add(new Student(1,100,"n"));

       // System.out.print(set.size());
        List<Student> students=new ArrayList<>(set);
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.id==o2.id){
                    return o1.name.compareTo(o2.name);
                }
                return Integer.compare(o1.id,o2.id);
            }
        });
        students.stream().forEach(x->System.out.println(x));

        Map<Integer,Student> map=new HashMap<>();
        map.put(1,new Student(1,10,"z"));
        map.put(2,new Student(2,1020,"b"));
        map.put(5,new Student(5,100,"e"));
        map.put(4,new Student(4,190,"d"));
        map.put(1,new Student(1,100,"n"));

        System.out.println("------------------------------------");
       // Collections.sort(map.);
        map.entrySet().forEach(x->System.out.println(map.get(x.getKey())));



    }
}
class Student{
    int id;
    String name;
    int salary;

    Student(int id,int salary,String name){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }

    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public boolean equals(Object obj) {
        Student s= (Student) obj;
        return this.id==s.id && this.salary==s.salary && Objects.equals(this.name, s.name);
    }

    @Override
    public String toString() {
        return this.name+" "+this.id+"  "+this.salary;
    }
}
