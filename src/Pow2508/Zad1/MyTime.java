package Pow2508.Zad1;

/**
 * Created by RENT on 2017-08-25.
 */
public class MyTime {
    private int _hour = 0;
    private int _minute = 0;
    private int _second = 0;

    public MyTime() {
    }

    public MyTime(int hour, int minute, int second) {
        this._hour = hour;
        this._minute = minute;
        this._second = second;
    }

    // w tej metodzie ustwiam logike
    public void setTime(int hour, int minute, int second) {
        if (hour < 24 && hour > 0) {
            this._hour = hour;
        }
        if (minute < 60 && minute > 0) {
            this._minute = minute;
        }
        if (second < 60 && second > 0) {
            this._second = second;
        }
    }

    public int getHour() {
        return _hour;
    }

    public void setHour(int hour) {

        // to jest nasza walidacja 1

        if (hour < 24 && hour > 0) {
            this._hour = hour;
        } else {
            this._hour = -1000;
            System.out.println("Przekroczyłeś zakres ! ");
        }

    }

    public int getMinute() {
        return _minute;
    }

    public void setMinute(int minute) {
        if (minute < 60 && minute >= 0) {
            this._minute = minute;
        } else {
            this._minute = -1000;
        }
    }

    public int getSecond() {
        return _second;
    }

    public void setSecond(int second) {
        if (second < 60 && second >= 0) {
            this._second = second;
        } else {
            this._second = -1000;
        }
    }

    public String toString() {
        return String.format("%02d:%02d:%02d", _hour, _minute, _second);
    }

    public MyTime nextSecond() {
        if (_second != 59) {
            _second = _second + 1;
        } else {
            nextMinute();
            _second = 0; // zerujemy sekundy
        }
        return this;
    }

    public MyTime nextMinute() {
        if (_minute != 59) {
            _minute = _minute + 1;
        } else {
            nextHour();
            _minute = 0;
        }
        return this;
    }

    public MyTime nextHour() {
        _hour = (_hour + 1) % 24; // jesli dochodzimy do 24 zerujemy godzine.
        return this;
    }

//    public MyTime previousSecond() {
//
//    }


}
