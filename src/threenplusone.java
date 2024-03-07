// public class 3n+1 {
    
// }


// import java.util.*;   
// class cp1 
// {  
//    public static void main(String args[])  
//    {  
//     Scanner sc=new Scanner(System.in);
//     System.out.println("Enter number :");   
//      int n=sc.nextInt();
//      while(n!=1)
//      {
//         //System.out.println(n); 
//         if(n%2==0)
//         n=n/2;
//         else
//         n=3*n+1;
//         System.out.print(n); 
//      }

//     //   String original, reverse = ""; // Objects of String class  
//     //   Scanner in = new Scanner(System.in);   
//     //   System.out.println("Enter a string/number to check if it is a palindrome");  
//     //   original = in.nextLine();   
//     //   int length = original.length();   
//     //   for ( int i = length - 1; i >= 0; i-- )  
//     //      reverse = reverse + original.charAt(i);  
//     //   if (original.equals(reverse))  
//     //      System.out.println("Entered string/number is a palindrome.");  
//     //   else  
//     //      System.out.println("Entered string/number isn't a palindrome.");   
//    }  
// }  


import java.util.*;

public class threenplusone {
	public static void main(String... args) {
		try {
			Scanner sc = new Scanner(System.in);
			int i, j, n, ans;
			while (sc.hasNext()) {
				i = sc.nextInt();
				j = sc.nextInt();
				ans = 0;
				for (n = Math.min(i, j); n <= Math.max(i, j); n++) {
					ans = Math.max(cycle(n), ans);
				}
				System.out.println(String.format("%d %d %d", i, j, ans));
			}
		} catch (Exception e) {
			// Nothing to do here
		} finally {
			System.exit(0);
		}
	}

	static int cycle(long n) {
		int ans = 1;
		while (n != 1) {
			if (n % 2 == 0) {
				n = n / 2;
			} else {
				n = 3 * n + 1;
			}
			ans++;
		}
		return ans;
	}
}