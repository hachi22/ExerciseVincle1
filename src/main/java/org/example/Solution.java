package org.example;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        vincleExercise();
    }

    public static List<String> vincleExercise() {

        List<String> result = new ArrayList<>();
        String aux;

        for(int i = 1; i<101; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                aux = "VINCLE";
                System.out.println(aux);
            } else if (i % 3 == 0) {
                aux = "VIN";
                System.out.println(aux);
            } else if (i % 5 == 0) {
                aux = "CLE";
                System.out.println(aux);
            } else {
                aux = Integer.toString(i);
                System.out.println(aux);
            }

            result.add(aux);
        }
        return result;
    }
}