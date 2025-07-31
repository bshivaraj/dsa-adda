package systemdesign;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Cache {
    public static void main(String[] args) {

        MyMap myMap=new MyMap();
       /* Long time1= (long) LocalDateTime.now().getMinute();
        myMap.put(1,"a",10L);

        Long time2= (long) LocalDateTime.now().getMinute();
        myMap.put(4,"p",20L);*/

        Long time3= (long) LocalDateTime.now().getMinute();
        myMap.put(3,"c",30L);

      /*  Long time4= (long) LocalDateTime.now().getMinute();
        myMap.put(8,"d",15L);*/
        System.out.println(time3);
        System.out.println( myMap.getValue(3,time3));

    }
}
class MyMap{
    int key;
    String value;
    long time;

    List<MyMap> list=new LinkedList<>();

    long expiryPeriod=20L;

    MyMap(){}

    public MyMap(int key,String value,long time){
        this.key=key;
        this.value=value;
        this.time=time;
    }

    public void put(int key,String value,long time){
         list.add(hasCode(key),new MyMap(key,value,time));
    }

    public int hasCode(int key){
        if(key<10){
            return key;
        }
        return -1;
    }

    public String getValue(int key,long currentTime){
        Iterator<MyMap> it = list.iterator();
        while (it.hasNext()) {
            MyMap entry = it.next();
            if (entry.key == key) {
                if (currentTime - entry.time <= expiryPeriod) {
                    return entry.value;
                } else {
                    it.remove();
                    return null;
                }
            }
        }
        return null;
    }
}