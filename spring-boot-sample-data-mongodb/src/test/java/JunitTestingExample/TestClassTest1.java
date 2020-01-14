package JunitTestingExample;

import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class TestClassTest1 {

  @InjectMocks
  TestClass testClass2;

  @Mock
  TestClass testClass;

  protected boolean mockInitialized = false;

  @Before
  public void setUp() {
    if (!mockInitialized) {
      MockitoAnnotations.initMocks(this);
      mockInitialized = true;
    }
  }

  @Test
  public void calculateTest() {
    int expected = 100;
    TestClass testClass = Mockito.spy(new TestClass());
    Mockito.doReturn("square").when(testClass).getShape(ArgumentMatchers.anyInt());
//    int actual = testClass.calculate();
//    Assert.assertEquals(expected, actual);
  }

}
