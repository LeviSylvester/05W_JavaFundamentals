package w1_CountPrimes;
/*1. Declarati si initializati 2 numere de tip int – numar1 si numar 2.
Scrieți un program care afișează numerele prime între numar1 și numar2.
Afișati, de asemenea, câte numere prime au fost găsite intre numar1 si numar2.*/

public class CountPrimes {

    public static void printPrimesBetween(int firstNr, int lastNr) {
        boolean seeingPrime;
        int trialNr, halfInt, counted;

        trialNr = firstNr;
        counted = 0;

        while (trialNr <= lastNr) {
            seeingPrime = true;
            if ((trialNr == 0) || (trialNr == 1)) {
                //skip
            } else {
                halfInt = trialNr / 2;
                for (int i = 2; i <= halfInt; i++) {
                    if (trialNr % i == 0) {
                        seeingPrime = false;
                        break;
                    }
                }
                if (seeingPrime) {
                    System.out.print(trialNr + ", ");
                    counted++;
                }
            }
            trialNr++;
        }
        System.out.println("found " + counted + " prime numbers between " + firstNr + " and " + lastNr + ".");
    }

    public static void main(String[] args) {
        int numar1 = 0;
        int numar2 = 23;

        printPrimesBetween(numar1, numar2);
    }
}