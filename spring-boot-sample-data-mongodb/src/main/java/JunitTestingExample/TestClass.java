package JunitTestingExample;

import org.springframework.stereotype.Service;

@Service
public class TestClass {

  public void methodA() {

    int number = 4;
    String callingMethod = shouldCallTo(number);

    if (callingMethod.equals("evenMethod")) {

    }
  }

  public String shouldCallTo(int number) {
    if (number / 2 == 0 ) {
      return "evenMethod";
    } else {
      return "oddMethod";
    }
  }

  public void evenMethod(int number) {
    System.out.println("Even number");
  }

  public void oddMethod(int number) {

  }

  public String getShape(int index) {
    System.out.println(index);
    if (index == 1) {
      return "circle";
    } else {
      return "square";
    }
  }

  public int findArea(String shape, int radius) {
    if (shape.equals("circle")) {
      return 3 * radius * radius;
    } else {
      return radius * radius;
    }
  }
}
