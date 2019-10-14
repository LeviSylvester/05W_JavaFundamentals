package w3_GuessNumber;

import java.util.Random;
import java.util.Scanner;

/* 3. Realizati un joc „Ghiciti numarul” în Java, in care se va genera un număr aleatoriu și va
cere utilizatorului să-l ghicească. Dacă utilizatorul ghiceste numarul, programul se va
opri si se va afisa mesajul: “Ai castigat”. Dacă utilizatorul nu ghicește, programul va
afișa: „Răspuns greșit, numărul tău este prea mare” sau „Răspuns greșit, numărul tău
este prea mic”, in functie de comparatia dintre numarul aleatoriu generat si numarul
introdus de utilizator. Programul va permite utilizatorului maxim 3 reluări după care se
va opri cu mesajul „Ai pierdut”, in cazul in care nu reuseste sa ghiceasca numarul. */
public class GuessNumber {
    public static void main(String[] args) {
        int times = 3;
        int bound = 10;

        Random random = new Random();
        int randomInt = random.nextInt(bound);

        Scanner scanner = new Scanner(System.in);
        int inputNumber;

        System.out.println("guess the number i'm thinking of from 0 to " + bound + ",");
        System.out.println("you have " + times + " attempts:");
        System.out.println("▼");
        int count = 1;
        while (count <= times) {
            inputNumber = scanner.nextInt();
            if ((count == times) && (inputNumber != randomInt)) {
                System.out.println("no more chances, goodbye");
                break;
            } else {
                if (inputNumber > randomInt) {
                    System.out.println("too big, try again:");
                    count++;
                } else if (inputNumber < randomInt) {
                    System.out.println("too small, try again:");
                    count++;
                } else {
                    System.out.println("you've guessed it, it's " + randomInt + ", goodbye");
                    break;
                }
            }
        }
    }
}

