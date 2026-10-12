package com.astanaitu.facade;

import com.astanaitu.facade.subsystem.*;

public class Main {
    public static void main(String[] args) {
        Amplifier amp = new Amplifier();
        DvdPlayer dvd = new DvdPlayer();
        Projector projector = new Projector();
        Lights lights = new Lights();
        PopcornPopper popper = new PopcornPopper();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, dvd, projector, lights, popper);

        homeTheater.watchMovie("Inception");
        homeTheater.endMovie();
    }
}