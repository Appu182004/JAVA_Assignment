public class BinarySearchRecursive {
    static int search(int[] arr,int l,int r,int key){
        if(l>r) return -1;
        int mid=(l+r)/2;
        if(arr[mid]==key) return mid;
        if(arr[mid]>key)
            return search(arr,l,mid-1,key);
        return search(arr,mid+1,r,key);
    }
    public static void main(String[] args){
        int[] arr={1,3,5,7,9};
        System.out.println(search(arr,0,arr.length-1,7));
    }
}