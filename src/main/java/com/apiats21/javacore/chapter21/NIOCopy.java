package main.java.com.apiats21.javacore.chapter21;
// Copy a file using NIO

import java.io.IOException;
import java.nio.file.*;

public class NIOCopy {
    public static void main(String[] args) {
        if(args.length !=2) {
            System.out.println("Usage: copy from to");
            return;
        }

        try
        {
            Path source = Path.of(args[0]);
            Path target = Path.of(args[1]);

            // Copy a file
            Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);

        } catch (InvalidPathException e) {
            System.out.println("Path error" +e);
        } catch (IOException e) {
            System.out.println("I/O error" + e);
        }

    }
}
