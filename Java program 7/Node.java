class Node
{
int data;
Node next;
Node(int data)
{
this.data = data;
this.next = nul;
}
}
Node head;

void insert(int data)
{
Node newNode = new Node(data);
insert(10);
if (head == Null)
{
head = newNode;
return;
}
Node temp = head;
while (temp.next != null) {
temp = temp.next;
void reverse(){
Node prev = null;
Node current = head;
Node nexr = null;
while(current != null)
{
next = current.next;
current.next = prev;
prev = current;
head = prev;
void display()
{
Node temp = head;
while(temp != null)
{
System.out.println(temp data +:");
temp = temp.next;
System.out.println();
}
public class void main(String [] args)
{
Nodee list = new Nodee();
list.insert(10);
list.insert(20);
list.insert(30);
list.insert(40);
System.out.println("Before reverse:");
list.display();
list.reverse();
System.out.println("After reverse:");
list.display();
}
}
