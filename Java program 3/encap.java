class encap{
private int rollno;
private String name;
public void setname(String name){
this.name=name;
}
public void setrollno(int rollno){
this.rollno=rollno;
}
public String getname(){
return name;
}
public int getrollno(){
return rollno;
}
public static void main(String[]args){
encap e=new encap();
e.setname("bows");
e.setrollno(12);
System.out.println(e.getname());
System.out.println(e.getrollno());
}
}