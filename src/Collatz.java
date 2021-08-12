import java.util.*;

public class Collatz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int number = sc.nextInt(), ans=0;
        System.out.println();
        while (number!=1){
            if (number%2==0)
                ans=number/2;
            else
                ans=3*number+1;
            number=ans;
            System.out.println(ans);
        }
    }
}
