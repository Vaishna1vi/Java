class A {
void Greet(){
System.out.println("Hello !!");
}
}
class B extends A {
void Day() {
System.out.println("Have a Good Day !!");
}
}
class C extends B {
void Morn() {
System.out.println("Good Morning !!");
}
}
public class Multilevel{
public static void main(String a[]) {
C ob=new C();
ob.Greet();
ob.Day();
ob.Morn();
}
}