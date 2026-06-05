public class miss{
public static void main (String[]args)
{
int [] arr={1,2,4,5,};
int n=5;
int exceptedSum=n* (n+1)/ 2;
int actualSum=0;
for(int num : arr){
actualSum +=num;
}
int missing=expected- actualSum;
System.out.println("missing number:"+missing);
}
}