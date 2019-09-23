package oops.overriding;

import java.io.IOException;


//The class BufferOutput implements a very simple buffered version of an OutputStream, flushing the output when the
// buffer is full or flush is invoked. The subclass LineBufferOutput declares only a constructor and a single method
// putchar, which overrides the method putchar of BufferOutput. It inherits the methods putstr and flush from class
// BufferOutput.
//
//In the putchar method of a LineBufferOutput object, if the character argument is a newline, then it invokes the flush
// method. The critical point about overriding in this example is that the method putstr, which is declared in class
// BufferOutput, invokes the putchar method defined by the current object this, which is not necessarily the putchar
// method declared in class BufferOutput.
//
//Thus, when putstr is invoked in main using the LineBufferOutput object lbo, the invocation of putchar in the body of
// the putstr method is an invocation of the putchar of the object lbo, the overriding declaration of putchar that
// checks for a newline. This allows a subclass of BufferOutput to change the behavior of the putstr method without
// redefining it.
//
//Documentation for a class such as BufferOutput, which is designed to be extended, should clearly indicate what is the
// contract between the class and its subclasses, and should clearly indicate that subclasses may override the putchar
// method in this way. The implementor of the BufferOutput class would not, therefore, want to change the implementation
// of putstr in a future implementation of BufferOutput not to use the method putchar, because this would break the
// pre-existing contract with subclasses. See the discussion of binary compatibility in §13 (Binary Compatibility),
// especially §13.2.


public class TestBuffer {
    public static void main(String[] args) throws IOException {
        LineBufferOutput lbo = new LineBufferOutput(System.out);
        lbo.putstr("lbo\nlbo");
        System.out.print("print\n");
        lbo.putstr("\n");
    }
}

// Output will be as below
//lbo
//print
//lbo
