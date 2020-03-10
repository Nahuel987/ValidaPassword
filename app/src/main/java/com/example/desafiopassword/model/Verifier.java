package com.example.desafiopassword.model;

import android.util.Log;

import androidx.annotation.VisibleForTesting;

import java.io.BufferedReader;

public class Verifier {

    public int week;
    public int medium;
    public int strong;
    public int veryStrong;
    public final int MIN_LENTGH = 5;

    public boolean resultadoLargo;
    public boolean mayuscula;
    public boolean evaluaNumero;

    @VisibleForTesting
    public boolean evaluaLargo(String password) {

        if (password.length() >= MIN_LENTGH) {
            resultadoLargo = true;
        } else {
            resultadoLargo = false;
        }
        return resultadoLargo;
    }

    @VisibleForTesting
    public boolean evaluaMayuscula(String password) {

        for (int x = 0; x < password.length(); x++) {
            if (password.charAt(x) > 64 && password.charAt(x) < 91) { // verifica si existe una mayuscula
                mayuscula = true;
                break;
            } else {
                mayuscula = false;
            }
        }
        return mayuscula;
    }

    @VisibleForTesting
    public boolean evaluaNumerosPassword(String password) {

        for (int x = 0; x < password.length(); x++) {

            if (password.charAt(x) > 47 && password.charAt(x) < 58){
                evaluaNumero = true;
                break;
            }else{
                evaluaNumero = false;
            }
        }
        return evaluaNumero;
    }






}//class
