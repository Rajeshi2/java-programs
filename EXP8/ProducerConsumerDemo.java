import java.io.*;
class Producer extends Thread {
StringBuffer sb;
Producer() {
sb = new StringBuffer();
}
public void run() {
synchronized (sb) {
for (int i = 0; i < 10; i++) {
try {
sb.append(i + ":");
Thread.sleep(100);

System.out.println("appending");
} catch (Exception e) {
}
}
sb.notify();
}
}
}
class Consumer extends Thread {
Producer prob;
Consumer(Producer prob) {
this.prob = prob;
}
public void run() {
synchronized (prob.sb) {
try {
prob.sb.wait();
} catch (Exception e) {
}
}
System.out.println(prob.sb);
}
}
public class ProducerConsumerDemo {
public static void main(String[] args) {
Producer obj1 = new Producer();
Consumer obj2 = new Consumer(obj1);
Thread t1 = new Thread(obj1);
Thread t2 = new Thread(obj2);
t2.start();
t1.start();
}
}