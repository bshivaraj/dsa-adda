package leetcode;

public class ThreadClass {
    public static void main(String[] args) {
        MyClass myClass=new MyClass();
        Thread t1=new Thread(myClass);
        Thread t2=new Thread(myClass);

        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        }catch (InterruptedException e){

        }
    }
}
class MyClass implements Runnable{


    @Override
     public void run() {
        extractedOdd();
    //    extractedEven();
    }

    synchronized private void extractedEven() {
        for(int i=1;i<=10;i++){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if(i%2==0){
                System.out.println(i);
            }
            notify();
        }
    }

    synchronized private void extractedOdd() {
        for(int i=1;i<=10;i++){
            try{
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if(i%2!=0){
                System.out.println(i);
            }
            notify();
        }
    }
}
