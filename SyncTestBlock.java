package com.mphasis.sync;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class WorkerBlocksSySynchronized {

    private Random random = new Random();

    private List<Integer> list1 = new ArrayList<>();
    private List<Integer> list2 = new ArrayList<>();

    /**
     * synchronized, methods use different data (list1 list2) so by synchronized
     * methods if one thread runs the stageOne other thread cannot run stageTwo
     * at the same time because that same locks are used. Solution is using two
     * lock Object for two shared data.
     */
    public void stageOne() {
        try {
            //do your work here
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        list1.add(random.nextInt(100));
    }

    public void stageTwo() {
        try {
            //do your work here
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        list2.add(random.nextInt(100));
    }

    public void process() {
        for (int i = 0; i < 1000; i++) {
            synchronized (this) {
                stageOne();
            }
            synchronized (this) {
                stageTwo();
            }
        }
    }

    public void main() {
        System.out.println("Starting ...");
        long start = System.currentTimeMillis();
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                process();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                process();
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException ignored) {}

        long end = System.currentTimeMillis();

        System.out.println("Time taken: " + (end - start));
        System.out.println("List1: " + list1.size() + "; List2: " + list2.size());
    }
}



public class SyncTestBlock {

    public static void main(String[] args) {

        System.out.println("Synchronized Methods: ");
        // WorkerMethodsSynchronized worker2 = new WorkerMethodsSynchronized();
        WorkerBlocksSySynchronized worker1=new WorkerBlocksSySynchronized();
        worker1.main();
    }
}