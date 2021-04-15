package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void shouldCreate() {
        Radio radio = new Radio();
    }

    @Test
    void setCurrentVolume() {
        Radio radio = new Radio();
        int currentVolume = -5;
        int expected = 0;
        int actual = radio.setCurrentVolume(currentVolume);
        assertEquals(expected, actual);
    }

    @Test
    void increaseVolume() {
        Radio radio = new Radio();
        int currentVolume = 46;
        int expected = 10;
        int actual = radio.increaseVolume(currentVolume);
        assertEquals(expected, actual);
    }
    @Test
    void increaseVolume2() {
        Radio radio = new Radio();
        int currentVolume = 5;
        int expected = 6;
        int actual = radio.increaseVolume(currentVolume);
        assertEquals(expected, actual);
    }
    @Test
    void decreaseVolume (){
        Radio radio = new Radio();
        int currentVolume = 7;
        int expected = 6;
        int actual = radio.decreaseVolume(currentVolume);
        assertEquals(expected, actual);
    }
    @Test
    void decreaseVolume2 (){
        Radio radio = new Radio();
        int currentVolume = 0;
        int expected = 0;
        int actual = radio.decreaseVolume(currentVolume);
        assertEquals(expected, actual);
    }
    @Test
    void setCurrentStation(){
        Radio radio = new Radio();
        int currentstation = 12;
        assertEquals(9,radio.setCurrentStation(currentstation));
    }
    @Test
    void increaseStation() {
        Radio radio = new Radio();
        int currentStation = 9;
        int expected = 0;
        int actual = radio.increaseStation(currentStation);
        assertEquals(expected, actual);
    }
    @Test
    void increaseStation2() {
        Radio radio = new Radio();
        int currentStation = 2;
        int expected = 3;
        int actual = radio.increaseStation(currentStation);
        assertEquals(expected, actual);
    }
    @Test
    void decreaseStation (){
        Radio radio = new Radio();
        int currentStation = 0;
        int expected = 9;
        int actual = radio.decreaseStation(currentStation);
        assertEquals(expected, actual);
    }
    @Test
    void decreaseStation2 (){
        Radio radio = new Radio();
        int currentStation = 4;
        int expected = 3;
        int actual = radio.decreaseStation(currentStation);
        assertEquals(expected, actual);
    }
}
