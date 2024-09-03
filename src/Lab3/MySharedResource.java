package Lab3;
class Hello{
    synchronized public void sayHello(String msg){
        System.out.println(msg);
        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            System.out.println("Error in "+ Thread.currentThread().getName());
        }
    }
}
class Thread1 extends Thread{
    Hello h;
    Thread1(Hello h){
        this.h = h;
    }
    public void run(){
        h.sayHello("Hello from thread 1.");
    }
}
class Thread2 extends Thread{
    Hello h;
    Thread2(Hello h){
        this.h = h;
    }
    public void run(){
        h.sayHello("Hello from thread 2.");
    }
}
class Thread3 extends Thread{
    Hello h;
    Thread3(Hello h){
        this.h = h;
    }
    public void run(){
        h.sayHello("Hello from thread 3.");
    }
}
public class MySharedResource {
    public static void main(String[] args) {
        Hello h = new Hello();
        Thread1 th1 = new Thread1(h);
        Thread2 th2 = new Thread2(h);
        Thread3 th3 = new Thread3(h);
        th1.start();
        th2.start();
        th3.start();

    }
}
