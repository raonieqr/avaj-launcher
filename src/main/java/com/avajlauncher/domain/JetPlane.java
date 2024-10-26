package com.avajlauncher.domain;

public class JetPlane extends Aircraft {

    public JetPlane(Long p_id, String p_name, Coordinates p_coordinate) {
        super(p_id, p_name, p_coordinate);
    }

    @Override
    public void updateConditions() {
    }
}
