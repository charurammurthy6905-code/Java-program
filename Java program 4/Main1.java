interface AA{
void ShowA();
}
interface BB extends AA
{
void showB();
}
interface CC extends AA
{
void showC();
}
class DD implements BB,CC{
public void showA()
{
System.out.println("A");
}
{
System.out.println("B");
}
{
System.out.println("C");
}
}
public class Main1 {
    public static void main(String[] args) {
        DD obj = new DD();

        obj.showA();
        obj.showB();
        obj.showC();
    }
}
