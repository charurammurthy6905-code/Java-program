class Employe2{
private int salary;
public void setsalary(int salary){
this.salary=salary;
}
public int getsalary(){
return salary;
}
public static void main(String[]args){
Employe2 e=new Employe2();
e.setsalary(50000);
System.out.println(e.getsalary());
}
}