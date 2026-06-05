import java.util.Arrays;
class secondsmall{
public static void main(String[]args){
int[] arr={10,20,5,40,30};
Arrays.sort(arr);
System.out.println("second smallest="+arr[arr.length+1]);
}
}