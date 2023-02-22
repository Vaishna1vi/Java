 class Person {
int income=50000;
}
public class Employee extends Person {
int incentive=20000;
public static void main(String a[]) {
Employee e=new Employee();
int n =e.income;
int m=e.incentive;
System.out.println("Income is: "+n+"\n"+"Incentive is: "+m);
}
}
