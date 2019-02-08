package com.leopoldo;

public class Main {

    public static void main(String[] args) {

        double dvar = 20;
        double dvar2 = 80;

        double dvar3 = (dvar + dvar2) * 25d;
        double dvar4 = (dvar3 % 40);

        if (dvar4 <= 20)
        {
            System.out.println("Total was over the limit");
        }


    }
}
