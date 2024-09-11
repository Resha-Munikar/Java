package Lab3;
class Table{
    synchronized void print(int num)
    {
        System.out.println("Table of "+ num);
        for(int i=1; i<=10; i++){
            System.out.println(num*i);
            try{
                Thread.sleep(2000);
            }catch(InterruptedException e){
                System.out.println("Error in "+ Thread.currentThread().getName());
            }
        }
    }
}
class Thread4 extends Thread{
    Table t;
    Thread4(Table t){
        this.t = t;
    }
    public void run(){
        t.print(2);
    }
}
class Thread5 extends Thread{
    Table t;
    Thread5(Table t){
        this.t = t;
    }
    public void run(){
        t.print(4);
    }
}
public class ThreadSynchronization {
    public static void main(String[] args) {
        Table t = new Table();
        Thread4 t4 = new Thread4(t);
        t4.start();
        Thread5 t5 = new Thread5(t);
        t5.start();
    }
}
