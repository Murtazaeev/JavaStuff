public interface SFilter {
    boolean test(String x);
    public static String[] filter(String[] arr, SFilter filt){
        int numPassed = 0;
        for(int i = 0; i < arr.length; i++){
            if(filt.test(arr[i])){
                numPassed++;
            }
        }

        String[] result = new String[numPassed];
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(filt.test(arr[i])){
                result[count] = arr[i];
                count++;
            }
        }

        return result;
    }
}
