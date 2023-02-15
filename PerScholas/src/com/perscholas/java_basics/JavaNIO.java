import java.io.*;
import java.nio.*;
import java.nio.channels.FileChannel;

public class JavaNIO {

  public static void main(String[] args) throws IOException {
    //absolute path of file
    String nioInputAPath = "C:/Users/Uchenna Ofodile/Documents/nioInput.txt";

    //Creates a file object
    File nioInputFile = new File(nioInputAPath);

    //Creates an input stream - the input stream takes our file as input
    //It holds the file so we can use it later to read from it
    FileInputStream inputStream = new FileInputStream(nioInputFile);

    //Creates a channel using the input stream
    //our input stream is now at the start of our channel ready to be read into a buffer
    //getChannel creates a path(pipe) like a water channel for our our input(file)  to flow into the buffer
    FileChannel readChannel = inputStream.getChannel();

    //we get the size of our file - we will use this later
    long filesize = readChannel.size();

    //We create a buffer while at the same time giving it a size equivalent to our file size
    //the buffer is a pool for holding the file we will read from
    ByteBuffer readBufferSize = ByteBuffer.allocate((int) filesize);

    //the channel is read(flows) into the buffer (pool)
    //file ---> channel ---> buffer
    //			<bridge>
    //int bytesRead = readChannel.read(readBufferSize);

    //tells us how many bytes were read into the buffer
    //System.out.println("file read successfully " + bytesRead);

    String outPutAPath = "C:/Users/Uchenna Ofodile/Documents/nioOutput.txt";
    File nioOutput = new File(outPutAPath);
    FileOutputStream nOutputStream = new FileOutputStream(nioOutput);
    FileChannel outputChannel = nOutputStream.getChannel();

    //Use while loope to read the entire file
    while ((readChannel.read(readBufferSize)) > 0) {
      //flip the buffer so we can use to write
      //flip flips the buffer between read and write
      readBufferSize.flip();

      while (readBufferSize.hasRemaining()) {
        //get() reads data from buffer
        //read one bit at a time
        //System.out.print((char) readBufferSize.get());
        outputChannel.write(readBufferSize);
      }
      readBufferSize.flip();
    }
    inputStream.close();
    nOutputStream.close();
    readChannel.close();
    outputChannel.close();
  }
}
