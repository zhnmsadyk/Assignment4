package com.astanaitu.facade;

import com.astanaitu.facade.subsystem.*;

public class HomeTheaterFacade {
    private final Amplifier amp;
    private final DvdPlayer dvd;
    private final Projector projector;
    private final Lights lights;
    private final PopcornPopper popper;

    public HomeTheaterFacade(Amplifier amp, DvdPlayer dvd, Projector projector, Lights lights, PopcornPopper popper) {
        this.amp = amp;
        this.dvd = dvd;
        this.projector = projector;
        this.lights = lights;
        this.popper = popper;
    }

    public void watchMovie(String movie) {
        System.out.println("--- Get ready to watch a movie (Watch Movie / Подготовка к просмотру фильма)... ---");
        popper.on();
        popper.pop();
        lights.dim(10);
        projector.on();
        projector.wideScreenMode();
        amp.on();
        amp.setSurroundSound();
        amp.setVolume(5);
        dvd.on();
        dvd.play(movie);
        System.out.println("--- Movie started! Enjoy! ---\n");
    }

    public void endMovie() {
        System.out.println("--- Shutting movie theater down (End Movie / Завершение работы кинотеатра)... ---");
        popper.off();
        lights.on();
        projector.off();
        amp.off();
        dvd.stop();
        dvd.eject();
        dvd.off();
        System.out.println("--- Movie theater shut down. ---\n");
    }
}