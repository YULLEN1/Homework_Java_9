package ru.netology;



public class Radio {
    private int stationSize = 10;
    private int currentVolume;          // текущая громкость
    private int currentRadioStation;        // текущая радиостанция

    public Radio() {
        this.stationSize = 10;
    }

    public Radio(int stationSize) {
        this.stationSize = stationSize;
    }





public int getCurrentVolume() {
        return currentVolume;
}

public int getCurrentRadioStation() {
    return currentRadioStation;
}

public void setCurrentRadioStation(int newCurrentRadioStation) {  // установка радиостанции
    if (newCurrentRadioStation > stationSize - 1) {
        return;
    }
    if (newCurrentRadioStation < 0) {
        return;
    }
    currentRadioStation = newCurrentRadioStation;
}

public void setCurrentVolume(int newCurrentVolume) {
    if (newCurrentVolume > 100) {
        return;
    }
    if (newCurrentVolume < 0) {
        return;
    }
    currentVolume = newCurrentVolume;
}


public void volumeUp() {                // увеличение громкости на 1
    if (currentVolume < 100) {
        currentVolume = currentVolume + 1;
    } else {
        currentVolume = 100;
    }
}

public void volumeDown() {              // уменьшение громкости на 1
    if (currentVolume > 0) {
        currentVolume = currentVolume - 1;
    } else {
        currentVolume = 0;
    }
}


public void next() {                // следующая радиостанция
    if (currentRadioStation < stationSize - 1) {
        currentRadioStation = currentRadioStation + 1;
    } else {
        currentRadioStation = 0;
    }
}

public void prev() {                // предыдущая радиостанция
    if (currentRadioStation > 0) {
        currentRadioStation = currentRadioStation - 1;
    } else {
        currentRadioStation = 9;
    }
}
}