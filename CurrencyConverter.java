package com.Codsoft.Currency_Converter;

import java.util.Scanner;

public class CurrencyConverter {

	private static double fetchExchangeRate(String baseCurrency, String targetCurrency) {
        
        // For simplicity, we'll use dummy rates
        if (baseCurrency.equals("USD") && targetCurrency.equals("EUR")) {
            return 0.85;  // 1 USD = 0.85 EUR
        } else if (baseCurrency.equals("EUR") && targetCurrency.equals("USD")) {
            return 1.18;  // 1 EUR = 1.18 USD
        } else {
            return 1.0;   // Default: 1:1 exchange rate
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Allow the user to choose the base currency and target currency
        System.out.print("Enter the base currency (e.g., USD): ");
        String baseCurrency = scanner.nextLine().toUpperCase();

        System.out.print("Enter the target currency (e.g., EUR): ");
        String targetCurrency = scanner.nextLine().toUpperCase();

        // Step 2: Fetch real-time exchange rates from a reliable API
        double exchangeRate = fetchExchangeRate(baseCurrency, targetCurrency);

        // Step 3: Take input from the user for the amount they want to convert
        System.out.print("Enter the amount to convert: ");
        double amountToConvert = scanner.nextDouble();

        // Step 4: Convert the input amount from the base currency to the target currency
        double convertedAmount = amountToConvert * exchangeRate;

        // Step 5: Display the result to the user
        System.out.println("Converted amount: " + convertedAmount + " " + targetCurrency);
        
        // Close the scanner to avoid resource leaks
        scanner.close();
    }


}
