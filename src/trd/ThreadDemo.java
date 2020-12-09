package trd;
class Hi implements Runnable{
    public void run(){
    for(int i=0; i<5; i++){
        System.out.println("hi");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}}
class Hello implements Runnable{
    public void run(){
        for(int i=0; i<5; i++){
            System.out.println("hello");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }}

public class ThreadDemo {
    public static void main(String[] args) {
// Hi obj1 = new Hi();//working
// Hello obj2 = new Hello();//working

 Runnable obj1 = new Hi();
 Runnable obj2 = new Hello();

Thread t1 = new Thread(obj1);
Thread t2 = new Thread(obj2);


 t1.start();
        try {
            Thread.sleep(101);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
    }
}
