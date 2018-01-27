import java.util.Scanner;

public class Ecker_Zeichenketten {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String choice = "";

        String input = "";
        int count = 0;
        char iLetter = 0;

        System.out.println("a : Zählt den Buchstaben a in einer Zeichenkette.");
        System.out.println("b : Zählt alle Vokale in einer Zeichenkette.");
        System.out.println("c : blendet alle Vokale aus.");

        System.out.print("Welche Applikation wollen sie starten: ");
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

        } else if (choice.equals("b")) {
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
        } else if (choice.equals("c")) {
            System.out.println("Aufgabenstellung 3");
            System.out.print("Eingabe einer Zeichenkette: ");
            input = scanner.next();

            for (int i = 0; i < input.length(); i++){
                iLetter = input.charAt(i);

                if (iLetter == 'a' | iLetter == 'e' | iLetter == 'i' | iLetter == 'o' | iLetter == 'u') {
                    System.out.print(".");
                } else {
                    System.out.print(iLetter);
                }
            }
        }
    }
}
