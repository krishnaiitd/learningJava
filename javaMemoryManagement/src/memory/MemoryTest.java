package memory;

public class MemoryTest {

  public static void main(String[] args) {
    MemoryTest main = new MemoryTest();
    main.start();
  }

  public void start() {
    String last = "z";
    Container container = new Container();
    container.setInitial("C");
    another(container, last);
    System.out.println(container.getInitial());
  }

  public void another(Container initialHolder, String newInitial) {
    newInitial.toLowerCase();
    initialHolder.setInitial("B");
    Container initial2 = new Container();
    initialHolder = initial2;
    System.out.println(initialHolder.getInitial());
    System.out.println(newInitial);
  }

  public class Container {

    private String initial = "A";

    public String getInitial() {
      return initial;
    }

    public void setInitial(String initial) {
      this.initial = initial;
    }
  }

}
