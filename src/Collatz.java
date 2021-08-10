import java.util.*;

public class Collatz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt(), ans=0;
        System.out.println();
        while (n!=1){
            if (n%2==0)
                ans=n/2;
            else
                ans=3*n+1;
            n=ans;
            System.out.println(ans);
        }
    }
}
