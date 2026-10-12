package com.astanaitu.facade.subsystem;

public class DvdPlayer {
    public void on() {
        System.out.println("DVD Player is ON.");
    }
    public void off() {
        System.out.println("DVD Player is OFF.");
    }
    public void play(String movie) {
        System.out.println("DVD Player playing movie: \"" + movie + "\".");
    }
    public void stop() {
        System.out.println("DVD Player stopped.");
    }
    public void eject() {
        System.out.println("DVD Player ejected disc.");
    }
}