package org.araujo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmartphoneTest {

    @Test
    void validateFiveWireResistiveTouch() {
        Smartphone phone = new AndroidPhone(new FiveWireResistiveScreen());
        assertEquals("5-Wire Resistive touch", phone.touch());
    }

    @Test
    void validateInfraredTouch() {
        Smartphone phone = new IPhone(new InfraredScreen());
        assertEquals("Infrared touch", phone.touch());
    }

    @Test
    void validateProjectedCapacitiveTouch() {
        Smartphone phone = new IPhone(new ProjectedCapacitiveScreen());
        assertEquals("Projected Capacitive touch", phone.touch());
    }

    @Test
    void validateSurfaceAcousticWaveTouch() {
        Smartphone phone = new AndroidPhone(new SurfaceAcousticWaveScreen());
        assertEquals("Surface Acoustic Wave touch", phone.touch());
    }

    @Test
    void validateSurfaceCapacitiveTouch() {
        Smartphone phone = new IPhone(new SurfaceCapacitiveScreen());
        assertEquals("Surface Capacitive touch", phone.touch());
    }
}