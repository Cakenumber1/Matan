package com.company;
import java.util.Vector;

public class Reshenie {

    public int factorial(int n){
        int ret = 1;
        for (int i = 1; i <= n; ++i) ret *= i;
        return ret;
    }
    public long factorial1(int n){
        long ret = 1;
        for (int i = 1; i <= n; ++i) ret *= i;
        return ret;
    }
    public int[] massmaker(int st, int end){
        int[] ans = new int[end-st+1];
        int c = 0;
        for(int i=st; i<=end; i++){
            ans[c]=i;
            c++;
        }
        return ans;
    }


    Vector<String> binom(double p, int n, int[] k){
        Vector<String> answ = new Vector<String>();
        answ.add("Биноминальный закон распределения");
        double Mx  = 0;
        double Mxquad  = 0;
        double Dx=0;
        for(int i=0; i<=k.length-1;i++){
            int q =n-k[i];
            double a = ((double)(factorial(n)/((factorial(k[i]))*factorial(q)))*Math.pow(p, k[i])*Math.pow(1-p, q));
            Mx += a*k[i];
            Mxquad += a*k[i]*k[i];
        }
        Dx = Mxquad -Math.pow(Mx, 2);
        answ.add("Математическое ожидание: "+Mx);
        answ.add("Дисперсия: "+Dx);
        return answ;
    }

    Vector<String> gipergeom(int N, int K, int n, int[] k){
        Vector<String> answ = new Vector<String>();
        answ.add("Гипергеометрический закон распределения");
        for(int i=0; i<k.length;i++){
            int q = N-n;
            double ans =(double) (factorial(K)/(factorial(K-k[i])*factorial(k[i])))*(double)(factorial(N-K)/(factorial(N-K-n+k[i])*factorial(n-k[i])))
                    /(double)(factorial1(N)/(factorial1((N-n))*factorial(n)));
            answ.add("Вероятность "+k[i]+": "+ans);
        }
        double a = N;
        double b = K;
        double c = n;
        double Mx1  = b*c/a;
        double Dx1 = ((b*c)/a)*((a-c)/b)*((a-b)/(a-1));
        answ.add("Математическое ожидание: " + Mx1);
        answ.add("Дисперсия: "+ Dx1);
        return answ;
    }

    Vector<String> Poisson (double p, int k){
        Vector<String> answ = new Vector<String>();
        double a = (Math.pow(p, k)/factorial(k))*Math.pow(Math.exp(1), -p);
        answ.add("Распределение Пуассона");
        answ.add("Ответ: "+a);
        return answ;
    }

    Vector<String> geom (double p){
        Vector<String> answ = new Vector<String>();
        double q = 1 - p;
        double Dx=q/(p*p);
        double Mx  = q/p;
        answ.add("Геометрический закон распределения");
        answ.add("Математическое ожидание: "+Mx);
        answ.add("Дисперсия: "+Dx);
        return answ;
    }
    Vector<String> geom(double p, int[] k){
        Vector<String> answ = new Vector<String>();
        for(int i=0; i<k.length;i++){
            double q = 1-p;
            double ans = Math.pow(q, k[i])*p;
            answ.add("Вероятность "+k[i]+":"+ans);
        }
        return answ;
    }

    Vector<String> kusf(int[] a, double[] b) {
        Vector<String> answ = new Vector<String>();
        double Mx = 0;
        double s = 0;
        for (int i = 0; i < a.length; i++) {
            double q = b[i]-s;
            Mx+=a[i]*q;
            s+=b[i];
            answ.add(a[i]+" "+b[i]+" "+Mx+" "+s+" "+q);
        }
        answ.add("Распределения для кусочнозаданной функции");
        answ.add("Математическое ожидание: "+Mx);
        return answ;
    }

}