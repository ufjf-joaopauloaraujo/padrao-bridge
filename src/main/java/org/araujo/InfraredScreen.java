package org.araujo;

public class InfraredScreen implements TouchScreen {
    @Override
    public String touch() {
        return "Infrared touch";
    }
}
