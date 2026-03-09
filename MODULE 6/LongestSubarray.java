import java.util.*;
public class LongestSubarray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,1,1,1};
        int k = 3;
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = 0, max = 0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
            if(sum == k)
                max = i + 1;
            if(!map.containsKey(sum))
                map.put(sum,i);
            if(map.containsKey(sum - k))
                max = Math.max(max, i - map.get(sum-k));
        }
        System.out.println(max);
    }
}