package com.company;
import java.util.Vector;
public class Homework1 {
    Reshenie mark = new Reshenie();
    public void checktask(Vector<String> in){
        for (int i=0; i<in.size();i++){
            System.out.println(in.elementAt(i));
        }
    }
    public void dohomework(){
        task1();
        task2();
        task3();
        task4();
        task5();
    }
    void task1(){
        System.out.println("Task1");
        double p =0.05;
        int n = 6;
        checktask(mark.binom(p, n, mark.massmaker(0, 6)));
    }
    void task2(){
        System.out.println("Task2");
        int N2=15;
        int K2=6;
        int n2=2;
        int[] k2 = {0, 1, 2};
        checktask(mark.gipergeom(N2, K2, n2, k2));
    }
    public void task3(){
        System.out.println("Task3");
        int m3 = 0;
        double alph3 = 4;
        checktask(mark.Poisson(alph3, m3));
    }
    public void task4(){
        System.out.println("Task4");
        checktask(mark.geom(0.3));
    }
    public void task5(){
        System.out.println("Task5");
        int[] k5 = {2, 3, 4};
        double[] p5 = {0.3,0.5,1};
        checktask(mark.kusf(k5, p5));
    }

}
