package com.avajlauncher.domain;

import com.avajlauncher.contracts.Flyable;

import main.java.com.avajlauncher.utils.FileHandler;

import java.util.List;

public class Tower {
  private List<Flyable> observers;

  public void register(Flyable p_flyable) {
    FileHandler.writeLog("Tower says: " + p_flyable.getName() + " registered to weather tower.");
  }

  public void unregister(Flyable p_flyable) {
    FileHandler.writeLog("Tower says: " + p_flyable.getName() + " unregistered from weather tower.");
  }

  protected void conditionChanged() {

  }
}
