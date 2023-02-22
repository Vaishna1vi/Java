class Student {
int id;
String Cname;
public void details(int id,String Cname) {
this.id=id;
this.Cname=Cname;
}
void display() {
System.out.println("My id is: "+id+"\n"+"My course is: "+Cname);
}
public static void main(String a[]) {
Student s=new Student();
Student s1=new Student();
s.details(101,"Maths");
s1.details(201,"DBMS");
s.display();
s1.display();
}
}