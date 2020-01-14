package JunitTestingExample;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class TestClassTest {
  //TestClass testClass;

  @Before
  public void init() {
    TestClass testClass = new TestClass();
    System.out.println("Inside before");
  }

  @Test
  public void calculateTest() {
    int expected = 100;
    TestClass testClass = new TestClass();
    TestClass testClassMock = Mockito.mock(TestClass.class);
    Mockito.when(testClassMock.getShape(2)).thenReturn("square");
//    int actual = testClass.calculate();
//    Assert.assertEquals(expected, actual);
  }

}
