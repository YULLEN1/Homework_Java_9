package ru.netology;

public class Radio {
    private int minRadioStation = 0; // минимальная станция по умолчанию
    private int maxRadioStation = 9; // максимальная станция по умолчанию

    private int stationSize = 10;
    private int currentVolume;          // текущая громкость
    private int currentRadioStation = minRadioStation;        // текущая радиостанция

public Radio(int minRadioStation, int maxRadioStation) {
this.minRadioStation = minRadioStation;
this.maxRadioStation = maxRadioStation;
this.currentRadioStation = minRadioStation;
}

    public Radio(int stationSize) {
        maxRadioStation = minRadioStation + stationSize;
    }

    public int getMinRadioStation() {
        return minRadioStation;
    }

    public int getMaxRadioStation() {
        return maxRadioStation;
    }

    public void setMinRadioStation(int newMinRadioStation) {
        if (newMinRadioStation < 0)
            return;
    }
    minRadioStation = newMinRadioStation;
}

//    public int setMaxRadioStation(int newMaxRadioStation) {
//        if (newMinRadioStation > 9)
//            return;
//        }
//        maxRadioStation = newMaxRadioStation;
//    }


public int getCurrentVolume() {
    return currentVolume;
}

public int getCurrentRadioStation() {
    return currentRadioStation;
}

public void setCurrentRadioStation(int newCurrentRadioStation) {  // установка радиостанции
    if (newCurrentRadioStation > maxRadioStation) {
        return;
    }
    if (newCurrentRadioStation < minRadioStation) {
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
    if (currentRadioStation < maxRadioStation) {
        currentRadioStation = currentRadioStation + 1;
    } else {
        currentRadioStation = minRadioStation;
    }
}

public void prev() {                // предыдущая радиостанция
    if (currentRadioStation > minRadioStation) {
        currentRadioStation = currentRadioStation - 1;
    } else {
        currentRadioStation = maxRadioStation;
    }
}
}