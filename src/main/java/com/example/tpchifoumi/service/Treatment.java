package com.example.tpchifoumi.service;

import jakarta.servlet.http.HttpServlet;

import java.util.Objects;
import java.util.Random;

public class Treatment {
    public static String getRandomChoice() {

        String[] shifumiArray = {"SHI", "FOU", "MI"};

        int idx = new Random().nextInt(shifumiArray.length);
        String random = (shifumiArray[idx]);

        return random;
    }

    public static String getResult(String choice1, String choice2) {
        String result = "Defeat";
        if (Objects.equals(choice1, choice2)){
            result = "Draw";
        } else {
        if (Objects.equals(choice1, "SHI") && Objects.equals(choice2, "MI")){ result = "Victory"; }
        if (Objects.equals(choice1, "FOU") && Objects.equals(choice2, "SHI")){ result = "Victory"; }
        if (Objects.equals(choice1, "MI") && Objects.equals(choice2, "SHI")){ result = "Victory"; }
        }
         return result;
    }
}
