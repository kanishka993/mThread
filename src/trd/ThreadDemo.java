package trd;
class Hi extends Thread{
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
class Hello extends Thread{
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
 Hi obj1 = new Hi();
 Hello obj2 = new Hello();
 obj1.start();
 obj2.start();
    }
}
