package com.hsbc.banking.utilities;

import com.hsbc.banking.models.MessageThread;

public class ThreadDemo {
    public static void main(String[] args) {
        MessageThread messageThread = new MessageThread("day8thread");
        messageThread.start();

        System.out.println(Thread.currentThread().getName());
    }
}
