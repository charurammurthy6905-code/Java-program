class bank{
public static void main(String[]args)
{
int[] transaction={1000,-1200,2000,-3000,2100};
int balance=0;
int withdrawal=0;
int largest=transaction[0];
for(int t:transaction){
balance+=t;
if(t<0){
withdrawal++;
}
if(t>largest){
largest=t;
}
}
System.out.println("Final Balance = " + balance);
System.out.println("Number of Withdrawals = " + withdrawal);
System.out.println("Largest Transaction = " + largest);
}
}

