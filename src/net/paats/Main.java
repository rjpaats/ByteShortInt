package net.paats;

public class Main {

    public static void main(String[] args) {

        // Int has a with of 32 bits
        int myMinIntValue = -2_147_483_648;
        int myMaxIntValue = 2_147_483_647;
        int myIntTotal = myMinIntValue/2;
        System.out.println("myIntTotal = " + myIntTotal);

        // Byte has a with of 8 bits
        byte myMinByteValue = -128;
        byte myMaxByteValue = 127;
        byte myNewByteValue = (byte) (myMinByteValue/2);
        System.out.println("myNewByteValue = " + myNewByteValue);

        // Short has a with of 16 bits
        short myMinShortValue = -32768;
        short myMaxShortValue = 32767;
        short myShortValue = (short) (myMinShortValue/2);
        System.out.println("myShortValue = " + myShortValue);

        // Long has a with of 64 bits
        long myMinLongValue = -9_223_372_036_854_775_808L;
        long myMaxLongValue = 9_223_372_036_854_775_807L;
        long myLongValue = myMinLongValue/2;
        System.out.println("myLongValue = " + myLongValue);

        System.out.println("\nNieuwe Opdracht\n");

        byte valueByte = 10;
        short valueShort = 21_000;
        int valueInt = -4_984_283;
        long valueLong = 50_000L + (10L * valueByte + valueShort + valueInt);
        System.out.println("\nvalueLong = " + valueLong);
    }
}
