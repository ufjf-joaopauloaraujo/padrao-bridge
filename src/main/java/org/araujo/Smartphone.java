package org.araujo;

public abstract class Smartphone {

    private TouchScreen screen;

    public Smartphone(TouchScreen screen) {
        this.screen = screen;
    }

    public String touch() {
        return screen.touch();
    }
}
