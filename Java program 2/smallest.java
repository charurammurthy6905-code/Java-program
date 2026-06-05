public class Smallest {
public static void main(String[] args) {
int[] arr = {10, 5, 20, 3, 15};
int min = arr[0];
for (int n : arr) {
if (n < min) {
min = n;
}
}
System.out.println("Smallest two number = " + min);
    }
}