public interface FunDD {
    double fun (double x);

    static double xminim(FunDD f, double a, double b){
        double min = f.fun(a);
        double minX = a;
        for(double i = a; i <= b; i+= 0.00001){
            if(f.fun(i) < min){
                min = f.fun(i);
                minX = i;
            }
        }
        return minX;
    }
}
