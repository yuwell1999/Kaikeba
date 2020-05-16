package Demo1;

import java.io.IOException;
import java.util.Scanner;

public class MyShutdown {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int second = sc.nextInt();

        try {
            Runtime.getRuntime().exec("shutdown -s -t " + second);
        } catch (IOException io) {
        }

    }
}
