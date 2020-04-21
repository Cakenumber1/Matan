package com.company;
import java.util.Vector;
import org.apache.commons.math3.special.Erf;

public class Reshenie2 extends Reshenie{
    public double F(double x){
        return 0.5*(1+Erf.erf(Math.pow(x, 0.5)));
    }
    public Vector<String> Bernulli(int n, int m, double p){
        Vector<String> answ = new Vector<String>();
        double ans = C(n,m)*Math.pow(p, m)*Math.pow(1-p, n-m);
        answ.add("Формула Бернулли");
        answ.add("Вероятность "+m+" из "+n+": ");
        answ.add(Double.toString(ans));
        return answ;
    }
    public Vector<String> Poisson(int n, int m, double p){
        Vector<String> answ = new Vector<String>();
        double l = n*p;
        double q = 1-p;
        double ans= 0;
        if(l<5){
            ans = Math.pow(l, m)*Math.pow(Math.exp(1), -l)/factorial1(m);}
        else{
            double x =(m-n*p)/Math.pow(n*p*q,0.5);
            ans = Math.pow(Math.exp(1),-Math.pow(x,2)/2)/Math.pow(2*Math.PI*n*p*q, 0.5);
        }
        answ.add("Формула Пуассона");
        answ.add("Вероятность "+m+" из "+n+": ");
        answ.add(Double.toString(ans));
        return answ;
    }
    public Vector<String> Moivre_Laplace(int all, int left, int right, double p){
        Vector<String> answ = new Vector<String>();
        double q= 1-p;
        double a =(left-all*p)/(Math.pow(all*p*q ,0.5));
        double b =(right-all*p)/(Math.pow(all*p*q ,0.5));
        double ans = 0.5*(F(b)+F(-a));
        answ.add("Теорема Муавра-Лапласа");
        answ.add("Вероятность попасть в промежуток ["+left+";"+right+"] из "+all+": ");
        answ.add(Double.toString(ans));
        return answ;
    }

}
