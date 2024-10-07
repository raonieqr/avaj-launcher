package main.java.com.avajlauncher.domain;

import main.java.com.avajlauncher.contracts.Flyable;

public class Aircraft implements Flyable {
    protected Long id;
    protected String name;
    protected Coordinates coordinates;

    public Aircraft() {}

    @Override
    public void updateCoditions() {}

    @Override
    public void registerTower() {}
}