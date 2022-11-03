package org.araujo;

public class FiveWireResistiveScreen implements TouchScreen {
    @Override
    public String touch() {
        return "5-Wire Resistive touch";
    }
}
