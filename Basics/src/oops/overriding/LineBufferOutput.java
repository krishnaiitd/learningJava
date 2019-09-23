package oops.overriding;

import java.io.IOException;
import java.io.OutputStream;

public class LineBufferOutput extends BufferOutput {
    LineBufferOutput(OutputStream o) {
        super(o);
    }

    public void putchar(char c) throws IOException {
        super.putchar(c);
        if (c == '\n') flush();
    }
}
