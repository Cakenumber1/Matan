package com.company;


public class Homework2 extends  Homework1{
    Reshenie2 mark2 = new Reshenie2();
    @Override
    public void task1(){
        int n =5;
        int m =2;
        double p = 0.51;
        double a= 0;
        System.out.println("Task1");
        System.out.println("a)");
        checktask(mark2.Bernulli(n, m, p));
        System.out.println("б)");
        for (int i=0; i<=m;i++){
            a+=Double.valueOf(mark2.Bernulli(n, i, p).lastElement());
        }
        System.out.println("Вероятность > "+m+" из "+n+":");
        System.out.println(1-a);
    }
    public void task2(){
        int n =2000;
        int k =2;
        double p = 0.001;
        double a=0;
        System.out.println("Task2");
        System.out.println("1)");
        System.out.println("long < 2000!");
        System.out.println("2a)");
        checktask(mark2.Poisson(n, k , p));
        System.out.println("2б)");
        for (int i=0; i<k;i++){
            a+=Double.valueOf(mark2.Poisson(n, i, p).lastElement());
        }
        System.out.println("Вероятность > "+k+" из "+n+":");
        System.out.println(1-a);
    }
    public void task3(){
        System.out.println("Task3");
        int n = 300;
        int k =75;
        double p =0.25;
        checktask(mark2.Poisson(n, k , p));
    }
    public void task4(){
        System.out.println("Task4");
        int n = 5000;
        int k =3;
        double p =0.0002;
        double a=0;
        for (int i=0; i<k;i++){
            a+=Double.valueOf(mark2.Poisson(n, i, p).lastElement());
        }
        System.out.println("Вероятность > "+k+" из "+n+":");
        System.out.println(a);
    }
    public void task5(){
        System.out.println("Task5");
        int all = 768;
        int left = 564;
        int right = 600;
        double p = 0.75;
        checktask(mark2.Moivre_Laplace(all, left, right, p));
    }

}

