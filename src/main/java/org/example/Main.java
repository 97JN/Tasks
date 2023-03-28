package org.example;

import javax.sound.midi.Soundbank;

public class Main {
    public static void main(String[] args) {
        int sumaR = 0;
        int sumaI = 0;
        int sumaF = 0;


        Main r = new Main();
        sumaR = r.silniaRekurencja(5);
        System.out.println("silnia rekurencyjnie: " + sumaR);

        Main i = new Main();
        sumaI = i.silniaIteracja(5);
        System.out.println("silnia iteracyjnie: " + sumaI);

        Main f = new Main();
        sumaF = f.fibonacci(5);
        System.out.println("N-ty wyraz ciagu fibbonacciego: " + sumaF);

        Main FB = new Main();
        FB.FuzzBuzz();
    }

    public int silniaRekurencja(int n) {
        return (n < 2) ? 1 : n * silniaRekurencja(n - 1);
    }

    public int silniaIteracja(int n) {
        int zmienna = 1;
        while (n > 0) {
            zmienna *= n;
            n--;
        }
        return zmienna;
    }

    public int fibonacci(int n) {
        return (n < 2) ? 1 : (n - 1) + (n - 2);
    }

    public void FuzzBuzz() {
        for (int i = 1; i < 101; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FuzzBuzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fuzz");
            } else
                System.out.println(i);        }
    }
}
