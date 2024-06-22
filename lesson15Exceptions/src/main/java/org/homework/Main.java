package org.homework;

import org.homework.exceptions.WrongAccountException;
import org.homework.exceptions.WrongCurrencyException;
import org.homework.exceptions.WrongOperationException;

public class Main {
    static BankApplication app = new BankApplication();

    static public void main(String[] args) throws Exception {

        System.out.println("1");
        processWrapper("accountId000", 50, "USD");
        System.out.println("2");
        processWrapper("accountId003", 250, "HRV");
        System.out.println("3");
        processWrapper("accountId001", 50, "EUR");
        System.out.println("4");
        processWrapper("accountId001", 50, "USD");
        System.out.println("5");
        processWrapper("accountId001", 20000, "USD");

    }

    // Метод processWrapper(String, int, String)
    public static void processWrapper(String accountId, int amount, String currency) throws Exception {
        try {
            app.process(accountId, amount, currency);
        } catch (WrongAccountException e1) {
            System.out.println("Such an account does not exist: " + e1.getMessage());
        } catch (WrongCurrencyException e2) {
            System.out.println("The account is in another currency: " + e2.getMessage());
        } catch (WrongOperationException e3) {
            System.out.println("A processing error occurred, please try again: " + e3.getMessage());
        } finally {
            System.out.println("Thank you for using our service!");
        }
    }
}
