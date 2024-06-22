package org.homework.exceptions;

public class WrongAccountException extends Exception
{
    public WrongAccountException() {
        super("Wrong account ID");
    }
}
