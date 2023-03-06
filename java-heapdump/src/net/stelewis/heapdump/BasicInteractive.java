package net.stelewis.heapdump;

import java.io.IOException;
import java.util.Scanner;

public class BasicInteractive {

    public static void main(String[] args) throws IOException {
        System.out.println("You can retrieve the heap dump now. Press any key to exit this program.");
        System.in.read();
    }
}
