
import java.util.ArrayList;
import java.util.Iterator;
import java.util.HashSet;
class Student
{
int id;
String name;
int yop;
public Student(int id,String name,int yop)
{
this.id=id;
this.name=name;
this.yop=yop;
}
//@override
public String toString()
{
return this.id+" "+this.name+" "+this.yop;
}
}
public class Demo
{
public static void main(String[] args)
{
ArrayList <Object> l1=new ArrayList<Object>();
Student[] st=new Student[2];
l1.add(new Student(10,"Krishna",2016));
l1.add("Hello");
l1.add("Hello");
l1.add("Bye");
l1.add("Bye");
l1.add("Test");
l1.add("Test");
System.out.println("Before removing Duplicates");
Iterator it=l1.iterator();
while(it.hasNext())
{
System.out.println(it.next());
}
HashSet <Object> sh=new HashSet <Object>();
sh.addAll(l1);
l1.clear();
l1.addAll(sh);
System.out.println("After removing Duplicates");
Iterator it1=l1.iterator();
while(it1.hasNext())
{
System.out.println(it1.next());
}

}
}


