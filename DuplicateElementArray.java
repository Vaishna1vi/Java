import java.util.*;

public class DuplicateElementArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        System.out.println("Enter the array range: ");  
        int size = sc.nextInt();  
        int[] arr = new int[size];  
        System.out.println("Enter the elements of the array: ");  
    
        for(int i=0; i<size; i++) {  
           arr[i] = sc.nextInt();  
        }  
        DuplicateElementArray dp = new DuplicateElementArray();
        System.out.println(dp.DuplicateElement(arr, size));

        sc.close();
    }

    public  ArrayList<Integer> DuplicateElement(int arr[], int n) {
        ArrayList<Integer> al = new ArrayList<> ();
        int i, j, cnt = 1;
        for(i=0; i<n; i++) {
            for(j=i+1; j<n; j++) {
                if(arr[i]==arr[j]) {
                    cnt++;
                    if(cnt>1) {
                        al.add(arr[j]);
                    }
                }
            }
        }
        Collections.sort(al);
        Set<Integer> s = new HashSet<>(al);
        al.clear();
        al.addAll(s);
        if(al.isEmpty()) {
            al.add(-1);
        }
        return al;
    }
}
