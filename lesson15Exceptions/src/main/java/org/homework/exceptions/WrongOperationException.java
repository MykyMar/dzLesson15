package org.homework.exceptions;

public class WrongOperationException extends Exception
{
    public WrongOperationException() {
        super("Insufficient balance");
    }
}
