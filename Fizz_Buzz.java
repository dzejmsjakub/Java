import java.util.Scanner;
public class Zadanie2 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Podaj liczbe całkowita: ");
        int x = myObj.nextInt();

        if (x % 3 == 0 && x % 5 == 0) {
            System.out.println("fizzbuzz");
        } else if (x % 3 == 0) {
            System.out.println("fizz");
        } else if (x % 5 ==0) {
            System.out.println("buzz");
        }
    }
}
