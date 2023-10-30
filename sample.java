import java.util.*;
import java.lang.*;

public class sample{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a number = ");
        int temp;
        temp=sc.nextInt();
        if(temp%2==0){
            System.out.println("Given number is even");
        }else{
            System.out.println("Given number is odd");
        }

    }
}