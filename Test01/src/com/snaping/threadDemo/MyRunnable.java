package com.snaping.threadDemo;

public class MyRunnable implements Runnable {
    int ticket = 100;
    @Override
    public void run() {

        while (true){
            if(ticket < 100){
                ticket++;
                System.out.println();
            }else{
                break;
            }
        }
    }
}
