import java.util.Scanner;

public class CounterCLI {


    public static void main(String[] args) throws InterruptedException {
        Scanner userInput = new Scanner(System.in);
        System.out.print("What number do you want to count to? >>>");
        Long countingNumber = Long.valueOf(userInput.nextLine());

        for (int i = 1; i <= countingNumber; i++) {
            if (String.valueOf(i).contains("8")) {
                System.out.println(i + " Here's a cat for the 8: /ᐠ｡ꞈ｡ᐟ❁ ∫ ");
            } else {
                System.out.println(i + " ");
            }
            Thread.sleep(500);
        }

    }
}
