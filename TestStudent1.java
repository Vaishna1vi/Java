class Student {
String Reg_no;
String Course;
String detail(String Reg_no, String Crs) {
this.Reg_no=Reg_no;
this.Course=Crs;
return Reg_no;
//return Crs;
}
}
public class TestStudent1 {

public static void main(String a[]) {
Student s=new Student();
System.out.println(s.detail("22MCA10189", "Software"));
//System.out.println(s.detail());
}
}