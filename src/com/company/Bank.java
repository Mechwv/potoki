package com.company;

import java.util.Random;

public class Bank extends Thread {
    Bank(){

    }
    boolean flag = true;
    Random random = new Random();

    @Override
    public void run() {
        while (flag){
            int m = 1+ random.nextInt(2);
            switch (m){
                case 1: try{Main.add(); }catch (Exception e){}
                case 2: try{Main.sub(); }catch (Exception e){}
            }
        }
    }
}
