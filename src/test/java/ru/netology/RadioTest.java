package ru.netology;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio radio = new Radio(10);

    @Test
    public void increaseVolume() {   //прибавить громкость
        Radio radio = new Radio(10);
        radio.setCurrentVolume(99);
        radio.volumeUp();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeMax() {   //прибавить громкость на Max
        radio.setCurrentVolume(100);
        radio.volumeUp();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void decreaseVolume() {      //убавить громкость
        radio.setCurrentVolume(1);
        radio.volumeDown();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeMin() {      //убавить громкость до Min
        radio.setCurrentVolume(0);
        radio.volumeDown();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setStation() {      //выбор станции
        radio.setCurrentRadioStation(9);

        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void nextStation() {     //следующая станция
        radio.setCurrentRadioStation(8);
        radio.next();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStationMax() {     //следующая станция после Max
        radio.setCurrentRadioStation(9);
        radio.next();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStation() {     //предыдущая станция
        radio.setCurrentRadioStation(1);
        radio.prev();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationAfterMin() {     //предыдущая станция после Min
        radio.setCurrentRadioStation(0);
        radio.prev();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentVolumeMoreMax() {     //тестируем сеттер громкости на Max
        radio.setCurrentVolume(101);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentVolumeLessMin() {     //тестируем сеттер громкости на Min
        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentStationMoreMax() {   //тестируем сеттер станции на Max
        radio.setCurrentRadioStation(10);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setStationLessMin() {   //тестируем сеттер станции на Min
        radio.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
}

