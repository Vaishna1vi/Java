public class Convert {
public static void main(String args[]) {
java.util.Scanner sc=new java.util.Scanner(System.in);
String cname=sc.nextLine();
String[] digits={"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
String[] words= new String[cname.length()];
int i=0;
int n=Integer.parseInt(cname);
while(n>0)
{
words[i]=digits[n%10];
n/=10;
i++;
}
for(i=words.length-1;i>=0;i--)
//for(i=0;i<=words.length;i++)
System.out.println(words[i]+"\t");
}
}
