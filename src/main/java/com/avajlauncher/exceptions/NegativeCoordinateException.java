package com.avajlauncher.exceptions;

public class NegativeCoordinateException extends IllegalArgumentException {
    public NegativeCoordinateException(String message) {
        super(message);
    }
}
