package com.astanaitu.facade.subsystem;

public class Lights {
    public void dim(int level) {
        System.out.println("Theater Ceiling Lights dimmed to " + level + "%.");
    }
    public void on() {
        System.out.println("Theater Ceiling Lights are ON.");
    }
}