class dog extends Animal
{
void bark()
{
System.out.println("barking");
}
public static void main(String[]args)
{
dog d=new dog();
d.eat();
d.bark();
}
}