package com.Madpoints;

public class Main {

    public static void main(String[] args) {
        // Max and min values for type int (width 32)
        int myMinValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647;

        // Max and min values for type byte (width 8)
        byte myByteValueMax = 127;
        byte myByteValueMin = -128;

        // Max and min values for type short (width 16)
        short myShortValueMax = 32767;
        short myShortValueMin = -32768;

        // Max and min values for type long (width 64)
        long myLongValueMax = 9_223_372_854_775_807L;
        long myLongValueMin = -9_223_372_854_775_808L;

        // Java math
        int myInt = 876_543_210;
        byte myByte = 78;
        short myShort = 21012;

        long myLong = (50000L + 10L * (myByte + myShort + myInt));
        System.out.println("long example: " + myLong);
    }
}
