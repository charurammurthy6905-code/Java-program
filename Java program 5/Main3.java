import java.util.*;

class student
{
    int id;
    String name;

    student(int id, String name)
    {
        this.id = id;
        this.name = name;
    }
}

class Main3
{
    public static void main(String[] args)
    {
        ArrayList<student> list = new ArrayList<>();

        list.add(new student(101, "anu"));
        list.add(new student(102, "kavi"));

        for (student s : list)
        {
            System.out.println(s.id + " " + s.name);
        }
    }
}