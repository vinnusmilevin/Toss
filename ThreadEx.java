package com.mphasis.thread;

class Taskn implements Runnable{

    @Override
    public void run() {
 System.out.println("thread state"+Thread.currentThread());
        System.out.println("thread state"+Thread.currentThread());
        /*for (int i = 0; i < 2; i++) {
            System.out.println("hai");
        }*/
    }
}


public class ThreadEx {

    public static void main(String[] args) {
        Thread obj=new Thread(new Taskn());
        Thread obj1=new Thread(new Taskn());
        System.out.println("thread state"+Thread.currentThread());
        System.out.println("thread state"+obj.getState());
        obj.start();
        obj1.start();
        System.out.println("thread state"+obj.getState());
    }
}
