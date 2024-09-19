package br.com.erudio.utils;

import java.io.Serializable;

public class SimpleMath implements Serializable {

    public static Double sum(Double numberOne, Double numberTwo) {
        return numberOne + numberTwo;
    }

    public static Double sub(Double numberOne, Double numberTwo) {
        return numberOne - numberTwo;
    }

    public static Double mult(Double numberOne, Double numberTwo) {
        return numberOne * numberTwo;
    }

    public static Double div(Double numberOne, Double numberTwo) {
        return numberOne / numberTwo;
    }

    public static Double med(Double numberOne, Double numberTwo) {
        return (numberOne + numberTwo) / 2;
    }

    public static Double sqrt(Double number) {
        return Math.sqrt(number);
    }

}
