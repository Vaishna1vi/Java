public class Palindrom {
    
    public static void main(String args[]) {
        String a="nayan";
        String rev="";
      int length=a.length();

        for(int i=a.length()-1;i>=0;i--)
        rev=rev+a.charAt(i);
        
        if(a.equals(rev)){
            System.out.println("string is palindrom");
        }
        else{
            System.out.println("string is not palindrom");
        }

        }
        
    }
