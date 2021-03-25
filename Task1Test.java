public class Task1Test {
    public static void main(String[] args) {
        Parabola myParabola = new Parabola(1, -1, 1.25);
        System.out.println(myParabola + ":" + FunDD.xminim(myParabola, 0, 1)); //Passing object

        System.out.println(FunDD.xminim(new FunDD(){ //Passing object of anonymous class
            public double fun(double x){
                return(Math.sqrt(Math.pow(x-0.75, 2)+1)); //No need for constructor, pass arguments straight to fun()
            }
        }, 0, 2));

        FunDD myFunc = (double x) -> { //Lambda which implements our one only unimplemented function
            return x*x*(x-2);
        };
        System.out.println(FunDD.xminim(myFunc, 0, 2));
    }
}
