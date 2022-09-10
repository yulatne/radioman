package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    @Test // возможность выставление 19й станции из 20
    public void test() {
        Radio radio = new Radio(20);
        radio.setCurrentStation(19);
        assertEquals(19, radio.getCurrentStation());
    }

    @Test
        //повышение станции
    void shouldUpStation() {
        Radio radio = new Radio();
        int expected = 1;
        radio.upStation();
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
        //понижение станции
    void shouldDownStation() {
        Radio radio = new Radio(10);
        radio.setCurrentStation(10);
        radio.downStation();
        int expected = 9;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
        //переход вперед от станции = 9
    void shouldAfter9To0Station() {
        Radio radio = new Radio(10);
        radio.setCurrentStation(9);
        radio.upStation();
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
        //переход назад от станции = 0
    void shouldTransitFrom0To9Station() {
        Radio radio = new Radio(10);
        radio.setCurrentStation(0);
        radio.downStation();
        int expected = 9;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
        //переход назад от станции = 1
    void shouldTransitFromMinus1() {
        Radio radio = new Radio(10);
        radio.setCurrentStation(1);
        radio.downStation();
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }


    @Test
        //ввод станции
    void shouldSetCurrentStation() {
        Radio radio = new Radio(10);
        int expected = 4;
        radio.setCurrentStation(expected);
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
        //ввод станции больше максимума
    void shouldSetCurrentStationPlusMax() {
        Radio radio = new Radio(10);
        int expected = 0;
        radio.setCurrentStation(12);
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
        // ввод станции меньше минимума
    void shouldSetCurrentStationMinusMin() {
        Radio radio = new Radio();
        int expected = 0;
        radio.setCurrentStation(-12);
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldUpVolume1() {
        Radio radio = new Radio();
        int expected = 1;
        radio.upVolume();
        int actual = radio.currentVolume; // повышение звука
        assertEquals(expected, actual);
    }

    @Test
    void shouldNotUpVolume100() {
        Radio radio = new Radio();
        int expected = 100;
        radio.currentVolume = expected; // повысить звук при = 100
        radio.upVolume();
        int actual = radio.currentVolume;
        assertEquals(expected, actual);
    }

    @Test
    void shouldDownVolumeFrom1() {
        Radio radio = new Radio();
        int expected = 1;
        radio.currentVolume = 2; // понижение звука
        radio.downVolume();
        int actual = radio.currentVolume;
        assertEquals(expected, actual);
    }

    @Test
    void shouldDownVolumeFrom0() {
        Radio radio = new Radio();
        int expected = 0;
        radio.downVolume();
        int actual = radio.currentVolume; // понижение звука при = 0
        assertEquals(expected, actual);
    }
}

