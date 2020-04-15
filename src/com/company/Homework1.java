package com.company;

public class Homework1 {
    Reshenie mark = new Reshenie();
    public void checkall(){
        task1();
        task2();
        task3();
        task4();
        task5();
    }
    public void task1(){
        System.out.println("Task1 __________________");
        double p =0.05;
        int n = 6;
        mark.binom(p, n, mark.massmaker(0, 6));
    }
    public void task2(){
        System.out.println("Task2 __________________");
        int N2=15;
        int K2=6;
        int n2=2;
        int[] k2 = {0, 1, 2};
        mark.gipergeom(N2, K2, n2, k2);
    }
    public void task3(){
        System.out.println("Task3 __________________");
        int m3 = 0;
        double alph3 = 4;
        mark.Poisson(alph3, m3);
    }
    public void task4(){
        System.out.println("Task4 __________________");
        mark.geom(0.3);
    }
    public void task5(){
        System.out.println("Task5 __________________");
        int[] k5 = {2, 3, 4};
        double[] p5 = {0.3,0.5,1};
        mark.kusf(k5, p5);
    }

}
