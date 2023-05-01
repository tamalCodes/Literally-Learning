import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) throws IOException {
        // create a BufferedReader object
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Implement Scanner class

        Scanner sc = new Scanner(System.in);

        // ask the user for input
        System.out.print("Enter your name: ");
        // read the input from the user
        String name = br.readLine();

        System.out.print("Enter bra size : ");
        String bra = sc.nextLine();

        // display the input to the user
        System.out.println("Your name is: " + name);
        System.out.println("Your bra size is: " + bra);

    }
}
