public class PrefixSum {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10};
        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];
        for(int i=1;i<arr.length;i++)
            prefix[i] = prefix[i-1] + arr[i];
        int l = 1, r = 3;
        if(l==0)
            System.out.println(prefix[r]);
        else
            System.out.println(prefix[r] - prefix[l-1]);
    }
}