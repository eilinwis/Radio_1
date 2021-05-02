package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio();

    @Test
    public void ShouldSetVolume() {
        radio.setCurrentVolume(5);
        assertEquals(5, radio.getCurrentVolume());
    }

    @Test
    public void ShouldSetVolumeAboveMax() {
        radio.setCurrentVolume(102);
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void ShouldSetVolumeBlowMin() {
        radio.setCurrentVolume(-3);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void increaseVolumeAboveMax() {
        radio.setCurrentVolume(99);
        radio.increaseVolume();
        radio.increaseVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void increaseVolume() {
        radio.setCurrentVolume(7);
        radio.increaseVolume();
        assertEquals(8, radio.getCurrentVolume());
    }

    @Test
    public void decreaseVolume() {
        radio.setCurrentVolume(5);
        radio.decreaseVolume();
        assertEquals(4, radio.getCurrentVolume());
    }

    @Test
    public void decreaseVolumeBelowMin() {
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetStation() {
        Radio radio = new Radio(32);
        radio.setCurrentStation(29);
        assertEquals(29, radio.getCurrentStation());
    }

    @Test
    public void shouldSetStationAboveMax() {
        radio.setCurrentStation(13);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldSetStationAboveMaxConstructor() {
        Radio radio = new Radio(32);
        radio.setCurrentStation(35);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldSetStationBelowMin() {
        radio.setCurrentStation(-1);
        assertEquals(10, radio.getCurrentStation());
    }

    @Test
    public void shouldSetStationBelowMinConstructor() {
        Radio radio = new Radio(32);
        radio.setCurrentStation(-1);
        assertEquals(32, radio.getCurrentStation());
    }

    @Test
    public void increaseStation() {
        radio.setCurrentStation(2);
        radio.increaseStation();
        radio.increaseStation();
        radio.increaseStation();
        assertEquals(5, radio.getCurrentStation());
    }

    @Test
    public void increaseStationAboveMax() {
        radio.setCurrentStation(9);
        radio.increaseStation();
        radio.increaseStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void increaseStationAboveMaxConstructor() {
        Radio radio = new Radio(32);
        radio.setCurrentStation(31);
        radio.increaseStation();
        radio.increaseStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void decreaseStation() {
        radio.setCurrentStation(8);
        radio.decreaseStation();
        assertEquals(7, radio.getCurrentStation());
    }

    @Test
    public void decreaseStationBelowMin() {
        radio.setCurrentStation(0);
        radio.decreaseStation();
        assertEquals(10, radio.getCurrentStation());
    }

    @Test
    public void decreaseStationBelowMinConstructor() {
        Radio radio = new Radio(32);
        radio.setCurrentStation(1);
        radio.decreaseStation();
        radio.decreaseStation();
        assertEquals(32, radio.getCurrentStation());
    }
}

