package Lab2;

public class ThreadPriorityDemo extends Thread{
    public void run(){
        System.out.println("Running Thread : "+ Thread.currentThread().getName()+" Priority : "+Thread.currentThread().getPriority());
    }
    public static void main(String[] args){
        ThreadPriorityDemo obj1 = new ThreadPriorityDemo();
        obj1.setPriority(MIN_PRIORITY);
        obj1.start();
        ThreadPriorityDemo obj2 = new ThreadPriorityDemo();
        obj2.setPriority(NORM_PRIORITY);
        obj2.start();
        ThreadPriorityDemo obj3 = new ThreadPriorityDemo();
        obj3.setPriority(MAX_PRIORITY);
        obj3.start();
    }
}
