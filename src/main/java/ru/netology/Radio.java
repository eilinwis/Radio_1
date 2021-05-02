package ru.netology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

public class Radio {
    String name;
    public int maxStation = 10;
    public int minStation = 0;
    public int currentStation;
    public int maxVolume = 100;
    public int minVolume = 0;
    public int currentVolume;
    public boolean on;

    public Radio(int maxStation) {
        this.maxStation = maxStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            currentStation = minStation;
        }
        if (currentStation < minStation) {
            currentStation = maxStation;
        }
        this.currentStation = currentStation;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            currentVolume = maxVolume;
        }
        if (currentVolume < minVolume) {
            currentVolume = minVolume;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume--;
        }
    }

    public void increaseStation() {
        if (currentStation < maxStation) {
            currentStation++;
        } else {
            currentStation = minStation;
        }
    }

    public void decreaseStation() {
        if (currentStation > minStation) {
            currentStation--;
        } else {
            currentStation = maxStation;
        }
    }
}
