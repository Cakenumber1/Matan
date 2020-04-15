package com.company;

public class Reshenie {public int factorial(int n)
{
    int ret = 1;
    for (int i = 1; i <= n; ++i) ret *= i;
    return ret;
}
    public long factorial1(int n)
    {
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

    void binom(double p, int n, int[] k){
        System.out.println("Биноминальный закон распределения");
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
        System.out.println("Математическое ожидание: "+Mx);
        System.out.println("Дисперсия: "+Dx);
    }

    void gipergeom(int N, int K, int n, int[] k){
        System.out.println("Гипергеометрический закон распределения");
        for(int i=0; i<k.length;i++){
            int q = N-n;
            double ans =(double) (factorial(K)/(factorial(K-k[i])*factorial(k[i])))*(double)(factorial(N-K)/(factorial(N-K-n+k[i])*factorial(n-k[i])))
                    /(double)(factorial1(N)/(factorial1((N-n))*factorial(n)));
            System.out.println("Вероятность "+k[i]+": "+ans);
        }
        double a = N;
        double b = K;
        double c = n;
        double Mx1  = b*c/a;
        double Dx1 = ((b*c)/a)*((a-c)/b)*((a-b)/(a-1));
        System.out.println("Математическое ожидание: " + Mx1);
        System.out.println("Дисперсия: "+ Dx1);
    }

    void Poisson (double p, int k){
        double a = (Math.pow(p, k)/factorial(k))*Math.pow(Math.exp(1), -p);
        System.out.println("Распределение Пуассона");
        System.out.println("Ответ: "+a);
    }

    void geom (double p){
        double q = 1 - p;
        double Dx=q/(p*p);
        double Mx  = q/p;
        System.out.println("Геометрический закон распределения");
        System.out.println("Математическое ожидание: "+Mx);
        System.out.println("Дисперсия: "+Dx);
    }
    void geom(double p, int[] k){
        for(int i=0; i<k.length;i++){
            double q = 1-p;
            double ans = Math.pow(q, k[i])*p;
            System.out.println("Вероятность "+k[i]+":"+ans);
        }
    }

    void kusf(int[] a, double[] b) {
        double Mx = 0;
        double s = 0;
        for (int i = 0; i < a.length; i++) {
            double q = b[i]-s;
            Mx+=a[i]*q;
            s+=b[i];
            System.out.println(a[i]+" "+b[i]+" "+Mx+" "+s+" "+q);
        }
        System.out.println("Распределения для кусочнозаданной функции");
        System.out.println("Математическое ожидание: "+Mx);
    }
    void errorfunc(){

    }

}