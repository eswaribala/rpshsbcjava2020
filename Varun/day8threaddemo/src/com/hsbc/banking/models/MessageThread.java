package com.hsbc.banking.models;

public class MessageThread extends Thread {
    public MessageThread(String name) {
        super(name);
        Thread.currentThread().setName(name);
    }

    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
}
