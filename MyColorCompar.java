import java.util.Comparator;

public class MyColorCompar implements Comparator<MyColor> {
    ColComponent COL;
    MyColorCompar(ColComponent COL){
        this.COL = COL;
    }

    @Override
    public int compare(MyColor myColor, MyColor t1) {
        switch(COL){
            case RED:
                return myColor.getRed() - t1.getRed();
            case GREEN:
                return myColor.getGreen() - t1.getGreen();
            case BLUE:
                return myColor.getBlue() - t1.getBlue();
            default:
                return 0;
        }
    }
}
