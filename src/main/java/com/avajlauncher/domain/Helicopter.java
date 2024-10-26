package com.avajlauncher.domain;

public class Helicopter extends Aircraft {

    public Helicopter(Long p_id, String p_name, Coordinates p_coordinate) {
        super(p_id, p_name, p_coordinate);
    }

    @Override
    public void updateConditions() {

    }

    @Override
    public String toString() {
        return "Helicopter{" + "id=" + id + ", name='" + name + '\'' + ", coordinates=" + coordinates + '}';
    }
}
