class test1 {
  int a;

  test1(int a) {
    this.a = a;
  }

  void printa() {
    System.out.println(this.a);
  }

  static void printHello() {
    System.out.println("Hello");
  }
}

public class static_demo {
  public static void main(String args[]) {
    System.out.println("Hello World!");
    test1 item = new test1(1220);

    item.printa();

    test1.printHello();
  }
}
