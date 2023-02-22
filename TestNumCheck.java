class NumCheck {
int CompareNum(int x, int y) {
//int x=n1;
//int y=n2;
if(x<y)
return y;
else 
return x;
}
}
public class TestNumCheck {
public static void main(String a[]) {
NumCheck n=new NumCheck();
int result=n.CompareNum(10,9);
System.out.println("Biggest Number: "+result);
}
}