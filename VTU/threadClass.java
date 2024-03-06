class threadTester extends Thread {

  threadTester(String threadName) {
    super(threadName);
    start();
  }

  @Override
  public void run() {
    try {
      for(int i=0; i<5; i++) {
        System.out.println(Thread.currentThread().getName() + "count -" + i);
        Thread.sleep(1000);
      }
    } catch(Exception e) {
      System.out.println(e);
    }
    System.out.println("Child Thread Exiting");
  }
}

public class threadClass {
  public static void main(String args[]) {
    threadTester t1 = new threadTester("one");
    threadTester t2 = new threadTester("two");

    try {
      for(int i=0; i<5; i++) {
        System.out.println(Thread.currentThread().getName() + "count -" + i);
        Thread.sleep(5000);
      }
    } catch(Exception e) {
      System.out.println(e);
    }
    System.out.println("Main Thread Exit");

  }
}
