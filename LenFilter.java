public class LenFilter implements SFilter {
    int minLen;
    LenFilter(int minLen){
        this.minLen = minLen;
    }
    public boolean test(String x){
        return(x.length() >= this.minLen);
    }
}
