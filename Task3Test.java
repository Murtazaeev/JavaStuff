import java.util.Arrays;
public class Task3Test {
    public static void main(String[] args) {
        String[] arr = {"Alice", "Sue", "Janet", "Bea"};
        System.out.println(Arrays.toString(arr));
        String[] a1 = SFilter.filter(arr,new LenFilter(4));
        System.out.println(Arrays.toString(a1));
        String[] a2 = SFilter.filter(arr, new SFilter(){
            public boolean test(String x){
                char firstChar = x.charAt(0);
                if(firstChar < 'D' && firstChar >= 'A'){
                    return true;
                } else {
                    return false;
                }
            }
        });
        System.out.println(Arrays.toString(a2));
        SFilter myFilt = (String x) ->{
            char firstChar = x.charAt(0);
            if(firstChar > 'H' && firstChar <= 'Z'){
                return true;
            } else {
                return false;
            }
        };
        String[] a3 = SFilter.filter(arr,myFilt);
        System.out.println(Arrays.toString(a3));
    }
}
