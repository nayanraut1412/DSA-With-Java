import java.util.*;
public class Jolly_jumper {
    public static void main(String arg[])
    {
        // Scanner sc =new Scanner (System.in);
        // int b=sc.
       int arr []={4,1,4,2,3};
       int n=5;
       int a=0;
       boolean temp=true;
       for(int i=0;i<4;i++)
       {
        a=Math.abs(arr[i]-arr[i+1]);
        if(a>n)
        {
            System.out.println("Not Jolly");
            temp=false;
            break;
        }
       }
       if(temp==true)
       System.out.println("Jolly");

}
}
