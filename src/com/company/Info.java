package com.company;

public class Info extends Thread {
    boolean flag = true;
    Info(){

    }
    @Override
    public void run() {
        while (flag){
            try{Main.inf();}catch (Exception e){}
        }
    }
}
