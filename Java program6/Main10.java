public class Main10 {
    public static void main(String[] args) {
        int[] arr = {10, 45, 23, 67, 12};
        int max = arr[0];
        for(int n : arr) if(n > max) max = n;
        System.out.println(max);  // 67
    }
}