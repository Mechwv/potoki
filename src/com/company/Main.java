package com.company;

import java.util.Random;

public class Main {
static int coins = 1000;
static int old_coins = coins;
static Bank t1 = new Bank();
static Bank t2 = new Bank();;
static Info t3 = new Info();
static Random random = new Random();
    public static void main(String[] args) throws Exception{
	    t1.start();
        t2.start();
        t3.start();
    }
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RED = "\u001B[31m";
    private static Object key = new Object();

    public static void add() throws Exception{
        if (coins > 0) {
            old_coins = coins;
            coins += random.nextInt(200);
            Thread.sleep(1000);
        }
    }
    public static void sub() throws Exception{
        if (coins > 0) {
            old_coins = coins;
            coins -= random.nextInt(200);
            Thread.sleep(1000);
        }
    }
    public static void inf() throws Exception{
        if (coins < 0) {t1.flag = false; t2.flag = false; t3.flag = false;}
        if (old_coins < coins) {
            System.out.print(ANSI_GREEN + "You have: " + coins + "\n" + ANSI_RESET);
            Thread.sleep(1050);
        }
        else{
            System.out.print(ANSI_RED + "You have: " + coins + "\n" + ANSI_RESET);
            Thread.sleep(1050);
        }
    }
}
//key.notify();
//key.wait();
