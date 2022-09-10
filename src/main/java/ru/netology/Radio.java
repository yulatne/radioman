package ru.netology;

public class Radio {
    private int currentStation;
    protected int currentVolume;
    private int maxStation;
    private int minStation = 0;
    private int maxVolume = 100;
    private int minVolume = 0;

    public Radio() {
        maxStation = 9;
    }

    public Radio(int stationsCount) {
        maxStation = stationsCount - 1;

    }

    public void upVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1; // звук +
        }
    }

    public void downVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1; // звук -
        }
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            return;
        }
        if (currentStation < minStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void upStation() {
        if (currentStation == maxStation) { // станция +
            currentStation = minStation;
        } else {
            currentStation = currentStation + 1;
        }
    }

    public void downStation() {
        if (currentStation == minStation) { //станция -
            currentStation = maxStation;
        } else {
            currentStation = currentStation - 1;
        }
    }
}

