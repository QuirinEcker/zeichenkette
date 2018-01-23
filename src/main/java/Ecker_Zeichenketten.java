import java.util.Scanner;

public class Ecker_Zeichenketten {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String choice = "";

        String input = "";
        int count = 0;
        char iLetter = 0;

        System.out.print("Was wollen Sie zählen (a, vokale): ");
        choice = scanner.next();

        if (choice.equals("a")) {

            System.out.println("Aufgabenstellung 1");

            System.out.print("Eingabe einer Zeichenkette: ");
            input = scanner.next();

            for (int i = 0; i < input.length(); i++) {
                iLetter = input.charAt(i);

                if (iLetter == 'a') {
                    count++;
                }
            }
        System.out.println("'" + input + "'" + " beinhalted " + count + "x a");

        } else if (choice.equals("vokale")) {
            System.out.println("Aufgabenstellung 2");
            System.out.print("Eingabe einer Zeichenkette: ");
            input = scanner.next();

            for (int i = 0; i < input.length(); i++) {
                iLetter = input.charAt(i);

                if (iLetter == 'a' | iLetter == 'e' | iLetter == 'i' | iLetter == 'o' | iLetter == 'u') {
                    count++;
                }
            }
            System.out.println("'" + input + "'" + " beinhalted " + count + " Vokale");
        }
    }
}
