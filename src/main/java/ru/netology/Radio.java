package ru.netology;

public class Radio {
    String name;
    public int maxStation = 9;
    public int minStation = 0;
    public int currentStation;
    public int maxVolume = 10;
    public int minVolume = 0;
    public int currentVolume;
    public boolean on;

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getMaxStation() {
//        return maxStation;
//    }
//
//    public void setMaxStation(int maxStation) {
//        this.maxStation = maxStation;
//    }
//
//    public int getMinStation() {
//        return minStation;
//    }
//
//    public void setMinStation(int minStation) {
//        this.minStation = minStation;
//    }
//
//    public int getCurrentStation() {
//        return currentStation;
//    }

    public int setCurrentStation(int currentStation) {
        if (currentStation >= maxStation) {
            return maxStation;
        }
        if (currentStation <= minStation) {
            return minStation;
        }

        this.currentStation = currentStation;

        return currentStation;
    }

    public int increaseStation(int currentStation) {
        currentStation = setCurrentStation(currentStation);
        int position = currentStation;
        if (currentStation == maxStation) {
            position = minStation;
        } else {
            position++;
        }
        return position;
    }

    public int decreaseStation(int currentStation) {
        currentStation = setCurrentStation(currentStation);
        int position = currentStation;
        if (currentStation == minStation) {
            position = maxStation;
        } else {
            position--;
        }
        return position;
    }

//    public int getMaxVolume() {
//        return maxVolume;
//    }
//
//    public void setMaxVolume(int maxVolume) {
//        this.maxVolume = maxVolume;
//    }
//
//    public int getMinVolume() {
//        return minVolume;
//    }
//
//    public void setMinVolume(int minVolume) {
//        this.minVolume = minVolume;
//    }
//
//    public int getCurrentVolume() {
//        return currentVolume;
//    }

    public int setCurrentVolume(int currentVolume) {

        if (currentVolume >= maxVolume) {
            return maxVolume;
        }
        if (currentVolume <= minVolume) {
            return minVolume;
        }

        this.currentVolume = currentVolume;

        return currentVolume;
    }

    public int increaseVolume(int currentVolume) {
        currentVolume = setCurrentVolume(currentVolume);
        int level = currentVolume;
        if (currentVolume < maxVolume) {
            level++;
        }
        return level;
    }

    public int decreaseVolume(int currentVolume) {
        currentVolume = setCurrentVolume(currentVolume);
        int level = currentVolume;
        if (currentVolume > minVolume) {
            level--;
        }else {
            level = minVolume;
        }
        return level;
    }
// if (currentStation == minStation) {
//            position = maxStation;
//        } else {
//            position--;
//    public boolean isOn() {
//        return on;
//    }
//
//    public void setOn(boolean on) {
//        this.on = on;
//    }
}