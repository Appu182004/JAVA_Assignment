import java.util.*;
public class EvenIndex {
    public static void main(String[] args) {
        int[] arr = {3,6,12,1,5,8};
        int[] res = new int[arr.length];
        int even = 0, odd = 1;
        for(int x : arr){
            if(x % 2 == 0 && even < arr.length){
                res[even] = x;
                even += 2;
            }else{
                res[odd] = x;
                odd += 2;
            }
        }
        System.out.println(Arrays.toString(res));
    }
}