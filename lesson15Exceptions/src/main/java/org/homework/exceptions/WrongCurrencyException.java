package org.homework.exceptions;

public class WrongCurrencyException extends Exception
{
    public WrongCurrencyException() {
        super("Wrong currency");
    }
}
