public class Parabola implements FunDD{
    double a, b, c;
    Parabola(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double fun(double x){
//    System.out.println(x + " : " + (this.a*x*x+this.b*x+this.c));
    return this.a*x*x+this.b*x+this.c;
    }

    public String toString(){
        return "" + this.a + "x^2 +" + this.b + "x +" + this.c;
    }
}
