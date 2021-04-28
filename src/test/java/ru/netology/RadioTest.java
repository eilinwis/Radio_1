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



















//
//    @Test
//    public void ShouldIncreaseVolume() {
//        radio.increaseVolume(); ;
//        int currentVolume = 46;
//        int expected = 10;
//        int actual = radio.increaseVolume(currentVolume);
//        assertEquals(expected, actual);


//    @Test
//    void increaseVolume2() {
//        Radio radio = new Radio();
//        int currentVolume = 5;
//        int expected = 6;
//        int actual = radio.increaseVolume(currentVolume);
//        assertEquals(expected, actual);
//    }

//    @Test
//    void decreaseVolume() {
//        Radio radio = new Radio();
//        int currentVolume = 7;
//        int expected = 6;
//        int actual = radio.decreaseVolume(currentVolume);
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    void decreaseVolume2() {
//        Radio radio = new Radio();
//        int currentVolume = 0;
//        int expected = 0;
//        int actual = radio.decreaseVolume(currentVolume);
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    void setCurrentStation() {
//        Radio radio = new Radio();
//        int currentstation = 12;
//        assertEquals(9, radio.setCurrentStation(currentstation));
//    }
//
//    @Test
//    void increaseStation() {
//        Radio radio = new Radio();
//        int currentStation = 9;
//        int expected = 0;
//        int actual = radio.increaseStation(currentStation);
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    void increaseStation2() {
//        Radio radio = new Radio();
//        int currentStation = 2;
//        int expected = 3;
//        int actual = radio.increaseStation(currentStation);
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    void decreaseStation() {
//        Radio radio = new Radio();
//        int currentStation = 0;
//        int expected = 9;
//        int actual = radio.decreaseStation(currentStation);
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    void decreaseStation2() {
//        Radio radio = new Radio();
//        int currentStation = 4;
//        int expected = 3;
//        int actual = radio.decreaseStation(currentStation);
//        assertEquals(expected, actual);
    }

