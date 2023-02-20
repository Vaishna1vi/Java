class StatA {
static int a;
//a=0;
static {
System.out.println("1 is loading....");
}
}

public class StaticLoading {

public static void main(String a[]) {
//StatA.a=5;
System.out.println("3 is loading..");
StatA.a=2;
}
static {
System.out.println("2 is loading...");
}
}