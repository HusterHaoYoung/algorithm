package leetcode;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class HelloWorld {
    private static int flag = 0;
    private static Object lock = new Object();
    static class Thread1 extends Thread {
        private String name;
        public Thread1(String name){
            this.name = name;
        }
        @Override
        public void run(){
            while(true){
                synchronized(lock){
                    try {
                        if (flag == 0) {
                            System.out.println(name + "打印1");
                            flag = 1;
                            lock.notify();
                            lock.wait();
                        }
                    }
                    catch(InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        }
    }
    static class Thread2 extends Thread {
        private String name;
        public Thread2(String name){
            this.name = name;
        }
        @Override
        public void run(){
            while(true){
                synchronized(lock){
                    try {
                        if (flag == 1) {
                            System.out.println(name + "打印2");
                            flag = 2;
                            lock.notify();
                            lock.wait();
                        }
                    }
                    catch(InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        }
    }
    static class Thread3 extends Thread {
        private String name;
        public Thread3(String name){
            this.name = name;
        }
        @Override
        public void run(){
            while(true){
                synchronized(lock){
                    try {
                        if (flag == 2) {
                            System.out.println(name + "打印3");
                            flag = 0;
                            lock.notify();
                            lock.wait();
                        }
                    }
                    catch(InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        new Thread1("线程1").start();
        new Thread2("线程2").start();
        new Thread3("线程3").start();
    }
}
