public class MyColor extends java.awt.Color implements Comparable<MyColor>{
    MyColor(int red, int green, int blue){
        //Check if ranges are legal
//        if(red < 255 && red > 0 && green < 255 && green > 0 && blue < 255 && blue > 0){
////            throw new Exception();
////        }
        super(red, green, blue);
    }

    public int compareTo( MyColor c){
        return this.getRed() + this.getGreen() + this.getBlue() - c.getRed() - c.getGreen() - c.getBlue();
    }



    public String toString(){
        return "(" + this.getRed() + ", " + this.getGreen() + ", " + this.getBlue() + ")";
    }
}
