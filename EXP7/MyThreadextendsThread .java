class MyThread extends Thread {
public void run() {
try {
for (int i = 1; i <= 5; i++) {
System.out.println(Thread.currentThread().getName() + ": " +

i);

Thread.sleep(500); }
} catch (InterruptedException e) {
System.out.println(e);
}
}
}
public class ThreadAliveJoinExample {
public static void main(String[] args) {
try {
MyThread t1 = new MyThread();
MyThread t2 = new MyThread();
t1.setName("Thread 1");
t2.setName("Thread 2");
t1.start();
t2.start();
System.out.println("Is " + t1.getName() + " alive? " +

t1.isAlive());

t1.join();
System.out.println(t1.getName() + " has finished execution.");

System.out.println("Is " + t1.getName() + " alive? " +

t1.isAlive());


t2.join();
System.out.println(t2.getName() + " has finished execution.");
} catch (InterruptedException e) {
System.out.println(e);
}
System.out.println("Both threads have completed execution.");
}
}