package kursJavaYT;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean shouldContinue = true;

        Party party = new Party();


        while (shouldContinue) {
            System.out.println("Wybierz opcje: ");
            System.out.println("1. Wyswietl gosci");
            System.out.println("2. Dodaj goscia");
            System.out.println("3. Wyswietl potrawy");
            System.out.println("4. Znajdz po numerze telefonu");
            System.out.println("5. Wyjscie");

            int userChoice = scanner.nextInt();

            switch (userChoice) {
                case 1 -> party.displayGuest();
                case 2 -> party.setGuest();
                case 3 -> party.displayMeals();
                case 4 -> party.displayGuestPhoneByNumber();
                case 5 -> shouldContinue = false;

            }

        }
    }
}
