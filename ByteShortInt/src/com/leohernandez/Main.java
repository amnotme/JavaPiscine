package com.leohernandez;
/*
public class Main {
    public static void main(String[] args){

        int myMinValue = -2_147_483_648;
        int myTotal = (myMinValue / 2);
        System.out.println("MyTotal Value " + myTotal);

        byte myByteValue = -128;
        byte myNewByteValue =  (byte) (myByteValue/2);
        System.out.println("MyNewByteValue " + myNewByteValue);

        short myShortValue = 32767;
        short myNewShortValue = (short)(myShortValue / 2);
        System.out.println("MyNewShortValue " + myNewShortValue);

        long  myLongValue = 9_223_372_036_854_775_807L;
        long  myNewLongValue = (long)(myLongValue / 2);
        System.out.println("MyNewLongValue " + myNewLongValue);
    }
}*/

public class Main
{
    public static void main(String[] args)
    {
        byte    bvar = 122;
        short   svar = 31333;
        int     ivar = 10000000;
        long    lvar = (50000 + (10 * (svar + bvar + ivar)));
        System.out.println("My long " + lvar);
    }
}