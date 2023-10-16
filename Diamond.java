import java.util.Scanner;
public class Diamond {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();

        if (n % 2 == 0) {
            n++;
        }

        int spaces = n / 2;
        int asterisks = 1;


        for (int i = 1; i <= n; i += 2) {
            for (int x = 0; x < spaces; x++) {
                System.out.print(" ");
            }
            for (int x = 0; x < asterisks; x++) {
                System.out.print("*");
            }
            System.out.println();
            spaces--;
            asterisks += 2;
        }

        spaces = 1;
        asterisks = n - 2;

        for (int i = n - 2; i > 0; i -= 2) {
            for (int x = 0; x < spaces; x++) {
                System.out.print(" ");
            }
            for (int x = 0; x < asterisks; x++) {
                System.out.print("*");
            }
            System.out.println();
            spaces++;
            asterisks -= 2;
        }


        scanner.close();
    }
}
