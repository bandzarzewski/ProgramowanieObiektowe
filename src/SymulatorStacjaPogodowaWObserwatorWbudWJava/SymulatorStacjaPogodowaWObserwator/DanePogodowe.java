//<<<<<<< HEAD
//package SymulatorStacjaPogodowaWObserwatorWbudWJava.SymulatorStacjaPogodowaWObserwator;
//
//import java.util.Observable;
//
//
//public class DanePogodowe extends Observable {
//
//    // deklaracja zmiennych obiektowych
//
//    private float _temp;
//    private float _wilgotnosc;
//    private float _pressure;
//
//    // konstruktor
//    public DanePogodowe() {
//    }
//
//    public void odczytyZmiana() {
//        // to sa metody wbudowane w Jav
//        setChanged();
//        notifyObservers();
//    }
//
//    public void ustawZmienne(float temp, float wilgotnosc, float pressure) {
//
//        _temp = temp;
//        _wilgotnosc = wilgotnosc;
//        _pressure = pressure;
//        odczytyZmiana();
//    }
//
//    public float getTemp() {
//        return _temp;
//    }
//
//    public float getWilgotnosc() {
//        return _wilgotnosc;
//    }
//
//    public float getPressure() {
//        return _pressure;
//    }
//}
//=======
////package SymulatorStacjaPogodowaWObserwator;
////
////import java.util.ArrayList;
////import java.util.List;
////
/////**
//// * Created by RENT on 2017-08-29.
//// */
////public class DanePogodowe implements IPodmiot {
////    // deklaracja zmiennych obiektowych
////
////
////    List<IObserwator> obserwatorzy;
////    private float _temp;
////    private float _wilgotnosc;
////    private float _pressure;
////
////    // konstruktor
////    public DanePogodowe() {
////        obserwatorzy = new ArrayList<>();
////    }
////
////    public void odczytyZmiana() {
////
////        powiadomObserwatorow();
////    }
////
////    @Override
////    public void zarejstrujObiekt(IObserwator obserwator) {
////        obserwatorzy.add(obserwator);
////    }
////
////    @Override
////    public void usunObserwatora(IObserwator obserwator) {
////        obserwatorzy.remove(obserwator);
////    }
////
////    @Override
////    public void powiadomObserwatorow() {
////
////        for (IObserwator obserwator : obserwatorzy) {
////            obserwator.aktualizacja(_temp, _wilgotnosc, _pressure);
////        }
////    }
////
////    public void ustawZmienne(float temp, float wilgotnosc, float pressure) {
////
////        _temp = temp;
////        _wilgotnosc = wilgotnosc;
////        _pressure = pressure;
////        odczytyZmiana();
////    }
////}
//>>>>>>> 7b8f435cbd653183e9ff2a3ee0386b9766b7a5de
