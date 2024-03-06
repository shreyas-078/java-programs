class testRunnable implements Runnable {
  testRunnable(String threadName) {
    
  }

  public void run() {
    for(int i=0; i<5; i++) {
      System.out.println(Thread.currentThread().getName() + "count -" + i);
      Thread.sleep(500);
    }
  }
}