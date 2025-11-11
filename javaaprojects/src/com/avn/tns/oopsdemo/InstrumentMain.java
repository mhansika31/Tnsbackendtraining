package com.avn.tns.oopsdemo;

public class InstrumentMain {
    public static void main(String[] args) {
        Instruments i1 = new Instruments();
        Instruments i2 = new Drum();
        Instruments i3 = new Guitar();
        Instruments i4 = new Piano();

        i1.play();  // An instrument is being played
        i2.play();  // Drum is playing rhythmic beats
        i3.play();  // Guitar is playing melodious tunes
        i4.play();  // Piano is playing soft harmonic music
    }
}
