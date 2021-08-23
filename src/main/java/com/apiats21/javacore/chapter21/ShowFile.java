package main.java.com.apiats21.javacore.chapter21;
/*  Display a text file, using stream-based, NIO code.
    To use this program, specify the name
    of the file that you want to see.
    For example, to see a file called TEST.TXT.
    use the following command line

    Java ShowFile TEST.TXT
 */

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class ShowFile {
    public static void main(String[] args) throws Exception{
        int i;

        // First confirm, that a filename has been specified.
        if(args.length != 1) {
            System.out.println("Usage: ShowFile filename");
            return;
        }

        // Open the file and obtain stream linked to it.
        try (BufferedInputStream fin = new BufferedInputStream(Files.newInputStream(Path.of(args[0]))))
        {
            do {
                i = fin.read();
                if( i != -1) System.out.println((char) i);
            } while (i != -1);
        }
    }
}
