package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ConditionerTest {

    @Test
    public void shouldGetAndSet() {
        Conditioner conditioner = new Conditioner();
        String expected = "Кондишн";

        assertNull(conditioner.getName());
        conditioner.setName(expected);
        assertEquals(expected, conditioner.getName());
    }

    @Test
    void increaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.increaseCurrentTemperature(22);
        int expected = 23;
        assertEquals(expected, conditioner.getCurrentTemperature());
    }

    @Test
    void increaseCurrentTemperatureOverMax() {
        Conditioner conditioner = new Conditioner();
        conditioner.increaseCurrentTemperature(30);
        int expected = 0;
        assertEquals(expected, conditioner.getCurrentTemperature());
    }

    @Test
    void decreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.decreaseCurrentTemperature(22);
        int expected = 21;
        assertEquals(expected, conditioner.getCurrentTemperature());;
    }

    @Test
    void decreaseCurrentTemperatureLessMin() {
        Conditioner conditioner = new Conditioner();
        conditioner.decreaseCurrentTemperature(15);
        int expected = 0;
        assertEquals(expected, conditioner.getCurrentTemperature());;
    }
}
