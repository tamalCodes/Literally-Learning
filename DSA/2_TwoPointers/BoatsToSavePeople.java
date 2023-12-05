import java.util.Arrays;

public class BoatsToSavePeople {
    // public static int numRescueBoats(int[] people, int limit) {
    // Arrays.sort(people);

    // int sum = 0, n = 0, i = 0;
    // int boats = 0;

    // while (i < people.length) {

    // System.out.println("The i: " + people[i]);

    // if (sum + people[i] <= limit && sum <= limit && n < 2) {
    // sum += people[i];
    // n += 1;
    // i++;

    // } else {
    // System.out.println("The sum is: " + sum);
    // boats += 1;
    // System.out.println("The boats are: " + boats);
    // System.out.println(" ");
    // sum = 0;
    // n = 0;
    // }

    // }

    // if (sum > 0)
    // boats += 1;

    // return boats;
    // }

    public static int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);

        int sum = 0, n = 0, i = 0;
        int boats = 0;

        while (i < people.length) {

            System.out.println("The i: " + people[i]);

            if (sum + people[i] <= limit && sum <= limit && n < 2) {
                sum += people[i];
                n += 1;
                i++;

            } else {
                System.out.println("The sum is: " + sum);
                boats += 1;
                System.out.println("The boats are: " + boats);
                System.out.println(" ");
                sum = 0;
                n = 0;
            }

        }

        if (sum > 0)
            boats += 1;

        return boats;
    }

    public static void main(String[] args) {
        int[] people = { 3, 8, 7, 1, 4 };
        System.out.println(numRescueBoats(people, 9));
    }
}
