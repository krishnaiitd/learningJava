package edu.coursera.distributed;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * A basic and very limited implementation of a file server that responds to GET
 * requests from HTTP clients.
 */
public final class FileServer {
    /**
     * Main entrypoint for the basic file server.
     *
     * @param socket Provided socket to accept connections on.
     * @param fs     A proxy filesystem to serve files from. See the PCDPFilesystem
     *               class for more detailed documentation of its usage.
     * @throws IOException If an I/O error is detected on the server. This
     *                     should be a fatal error, your file server
     *                     implementation is not expected to ever throw
     *                     IOExceptions during normal operation.
     */
    public void run(final ServerSocket socket, final PCDPFilesystem fs)
            throws IOException {
        /*
         * Enter a spin loop for handling client requests to the provided
         * ServerSocket object.
         */
        while (true) {

            // TODO Delete this once you start working on your solution.
//            throw new UnsupportedOperationException();

            // TODO 1) Use socket.accept to get a Socket object

            Socket sc = socket.accept();

            Thread thread = new Thread(() -> {
                try {
                    InputStream stream = s.getInputStream();
                    InputStreamReader reader = new InputStreamReader(stream);
                    BufferedReader bufferedReader = new BufferedReader(reader);

                    String line = bufferedReader.readLine();
                    assert line != null;
                    assert line.startsWith("GET");
                    final String path = line.split(" ")[1];

                    PCDPPath pcdpPath = new PCDPPath(path);
                    String fileContent = fs.readFile(pcdpPath);

                    OutputStream out = s.getOutputStream();
                    PrintWriter printWriter = new PrintWriter(out);

                    if(fileContent != null) {
                        printWriter.write("HTTP/1.0 200 OK\r\n");
                        printWriter.write("Server: FileServer\r\n");
                        printWriter.write("\r\n");
                        printWriter.write(fileContent + "\r\n");
                    } else {
                        printWriter.write("HTTP/1.0 404 Not Found\r\n");
                        printWriter.write("Server: FileServer\r\n");
                        printWriter.write("\r\n");
                    }

                    printWriter.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });

            thread.start();

        }

    }
//    private String parseFileName(InputStream input) {
//        Scanner scanner = new Scanner(input).useDelimiter("\\r\\n");
//        String line = scanner.next();
//
//        Pattern pattern = Pattern.compile("GET (.+) HTTP/\\d.\\d");
//        Matcher matcher = pattern.matcher(line);
//        if (!matcher.find()) {
//            return null;
//        }
//
//        return matcher.group(1);
//    }
}
