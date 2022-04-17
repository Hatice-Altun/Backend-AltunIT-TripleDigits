package novi.basics;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // Variabele toevoegen
        int firstDigit;
        int secondDigit;
        int thirdDigit;

        // Maak een randomizer aan dit getallen kan genereren
        Random randomizer = new Random();

        int maximum = 9;
        // Maximum als 9 opgegeven, omdat er bij dit spel de ingevoerde waarde tussen de 1 en de 9 moet liggen.
        // Hieronder heb ik +1 eraan gekoppeld, omdat de ingevoerde waarde geen 0 mag zijn.

        firstDigit = randomizer.nextInt(maximum) + 1;
        secondDigit = randomizer.nextInt(maximum) + 1;
        thirdDigit = randomizer.nextInt(maximum) + 1;

        System.out.println("De waarde van het eerste getal is: " + firstDigit);
        System.out.println("De waarde van het tweede getal is: " + secondDigit);
        System.out.println("De waarde van het derde getal is: " + thirdDigit);

        // Bepaal de som en het product van de gegeneerde getallen.
        int sumOfDigits = firstDigit + secondDigit + thirdDigit;
        int productOfDigits = firstDigit * secondDigit * thirdDigit;

        // Toon de getallen op het scherm.
        System.out.println("Som: " + sumOfDigits);
        System.out.println("Product: " + productOfDigits);

        // Voeg for loop toe / speel meerdere rondes
        int maxTimesToPlay = 3;

        for (int i = 0; i < maxTimesToPlay; i++) {

            // Lees de input van de gebruiker
            System.out.println("Voer achter elkaar 3 getallen in: ");

            Scanner input = new Scanner(System.in);
            int userInput1 = input.nextInt();
            int userInput2 = input.nextInt();
            int userInput3 = input.nextInt();

            // Win conditie toevoegen
            boolean hasPlayerWon = userInput1 == firstDigit && userInput2 == secondDigit && userInput3 == thirdDigit;
            if (hasPlayerWon) {
                System.out.println("Gefeliciteerd!!! Je hebt gewonnen!");
            } else {
                System.out.println("Helaas... je hebt verloren!");
                System.out.println("Het spel is afgelopen!");

            }
        }
    }
}
