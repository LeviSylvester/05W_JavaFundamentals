package w7_CSV;

import java.util.Scanner;

/* 7. Avand la dispozitie un CSV (comma separated value – o inlantuire de valori separate
intre ele prin virgula) reprezentat ca tip de data de un String (ex:
1,Ana,V,1994,ana@mail.com,Java) si un contract in care se specifica pe fiecare pozitie
din CSV ce reprezinta valoarea respectiva (in cazul de fata, pe pozitia 1 se afla id-ul,
pozitia a 2-a numele, 3- initiala tataului, 4- anul de nastere, 5- mail-ul, 6- limbajul de
programare), scrieti o metoda care afiseaza pentru o pozitie introdusa de catre utilizator,
valoarea corespunzatoare din contract insotita de valoarea din CSV. Ex: pentru pozitia
2, afiseaza -> Numele : Ana. Construiti o alta metoda care, pentru o valoare din contract,
sa afiseze valoarea din CSV. Ex: pentru mail, afiseaza -> ana@mail.com */
public class CSV {

    /** contract csv: pe pozitia 1 se afla id-ul,
                       pozitia a 2-a numele,
                                 3- initiala tataului,
                                 4- anul de nastere,
                                 5- mail-ul,
                                 6- limbajul de programare */

    private static Scanner scanner;
    private static boolean exit = false;

    public static void printCSValueFromInput(String csv){
        scanner = new Scanner(System.in);
        while (!exit) {
            System.out.println("__________________________________");
            System.out.println("w7_CSV.CSV\\printCSValueFromInput");
            System.out.println("__________________________________");
            System.out.println("How would you like CSValues to be displayed? Enter an option from a to c,");
            System.out.println("a) by position's no. b) by value's name c) cancel program:");
            System.out.println("▼");
            switch (scanner.next().charAt(0)) {
                case 'a':
                    printCSValueFromInputNr(csv);
                    break;
                case 'b':
                    printCSValueFromInputValue(csv);
                    break;
                case 'c':
                    exit = true;
                    break;
                default:
                    System.out.println("Not a valid input, try again:");
            }
        }
        System.out.println("exited");
    }

    public static void printCSValueFromInputNr(String csv) {
        String[] csvElements = csv.split(",");
        System.out.println("__________________________________");
        System.out.println("w7_CSV.CSV\\printCSValueFromInput\\Nr");
        System.out.println("__________________________________");
        System.out.println("Enter 1 for csv-id");
        System.out.println("2 for name");
        System.out.println("3 father's initial");
        System.out.println("4 year of birth");
        System.out.println("5 email");
        System.out.println("6 for programming language");
        System.out.println("r return to previous menu");
        System.out.println("q quit:");
        System.out.println("▼");
        scanner = new Scanner(System.in);
        boolean returnToPreviousMenu = false;
        while (!returnToPreviousMenu) {
            switch (scanner.next().charAt(0)) {
                case '1':
                    System.out.println("id: " + csvElements[0]);
                    break;
                case '2':
                    System.out.println("name: " + csvElements[1]);
                    break;
                case '3':
                    System.out.println("father's initial: " + csvElements[2]);
                    break;
                case '4':
                    System.out.println("year of birth: " + csvElements[3]);
                    break;
                case '5':
                    System.out.println("email: " + csvElements[4]);
                    break;
                case '6':
                    System.out.println("programming language: " + csvElements[5]);
                    break;
                case 'r':
                    returnToPreviousMenu = true;
                    break;
                case 'q':
                    returnToPreviousMenu = true;
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid input, try again:");
            }
        }
    }

    public static void printCSValueFromInputValue(String csv) {
        String[] csvElements = csv.split(",");
        System.out.println("__________________________________");
        System.out.println("w7_CSV.CSV\\printCSValueFromInput\\Value");
        System.out.println("__________________________________");
        System.out.println("Enter \"id\" for csv-id");
        System.out.println("\"name\" for name");
        System.out.println("\"init\" for father's initial");
        System.out.println("\"year\" for year of birth");
        System.out.println("\"mail\" for email");
        System.out.println("\"code\" for programming language");
        System.out.println("'r' return to previous menu:");
        System.out.println("'q' to quit:");
        System.out.println("▼");
        scanner = new Scanner(System.in);
        boolean returnToPreviousMenu = false;
        while (!returnToPreviousMenu) {
            switch (scanner.next()) {
                case "id":
                    System.out.println("id: " + csvElements[0]);
                    break;
                case "name":
                    System.out.println("name: " + csvElements[1]);
                    break;
                case "init":
                    System.out.println("father's initial: " + csvElements[2]);
                    break;
                case "year":
                    System.out.println("year of birth: " + csvElements[3]);
                    break;
                case "mail":
                    System.out.println("email: " + csvElements[4]);
                    break;
                case "code":
                    System.out.println("programming language: " + csvElements[5]);
                    break;
                case "r":
                    returnToPreviousMenu = true;
                    break;
                case "q":
                    returnToPreviousMenu = true;
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid input, try again:");
            }
        }
    }

    public static void main(String[] args) {
        String csvAna = "1,Ana,V,1994,ana@mail.com,Java";

        System.out.println("Currently 1 CSV to display (Ana).");

        printCSValueFromInput(csvAna);
    }
}
