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
        radio.setCurrentVolume(11);
        assertEquals(10, radio.getCurrentVolume());
    }
    @Test
    public void ShouldSetVolumeBlowMin() {
        radio.setCurrentVolume(-3);
        assertEquals(0, radio.getCurrentVolume());
    }
    @Test
    public void increaseVolumeAboveMax() {
        radio.setCurrentVolume(10);
        radio.increaseVolume();
        assertEquals(10, radio.getCurrentVolume());
    }
    @Test
    public void increaseVolume(){
        radio.setCurrentVolume(7);
        radio.increaseVolume();
        assertEquals(8, radio.getCurrentVolume());
    }
    @Test
    public void decreaseVolume(){
        radio.setCurrentVolume(5);
        radio.decreaseVolume();
        assertEquals(4, radio.getCurrentVolume());
    }
    @Test
    public void decreaseVolumeBelowMin(){
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }
    @Test
    public void shouldSetStation (){
        radio.setCurrentStation(2);
        assertEquals(2, radio.getCurrentStation());
    }
    @Test
    public void shouldSetStationAboveMax(){
        radio.setCurrentStation(13);
        assertEquals(0, radio.getCurrentStation());
    }
    @Test
    public void shouldSetStationBelowMin(){
        radio.setCurrentStation(-1);
        assertEquals(9, radio.getCurrentStation());
    }
    @Test
    public void increaseStation (){
        radio.setCurrentStation(2);
        radio.increaseStation();
        assertEquals(3, radio.getCurrentStation());
    }
    @Test
    public void increaseStationAboveMax (){
        radio.setCurrentStation(9);
        radio.increaseStation();
        assertEquals(0, radio.getCurrentStation());
    }
    @Test
    public void decreaseStation(){
        radio.setCurrentStation(8);
        radio.decreaseStation();
        assertEquals(7, radio.getCurrentStation());
    }
    @Test
    public void decreaseStationBelowMin(){
        radio.setCurrentStation(0);
        radio.decreaseStation();
        assertEquals(9, radio.getCurrentStation());
    }
}

