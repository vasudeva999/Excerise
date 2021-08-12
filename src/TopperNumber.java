import java.util.*;

public class TopperNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int even_sum=0, odd_sum=0, number= sc.nextInt(), digit=0;
        while (number!=0){
            digit=number%10;
            number/=10;
            if (digit%2==0)
                even_sum+=digit;
            else
                odd_sum+=digit;
        }
        if (even_sum==odd_sum)
            System.out.println("\nGiven Number is a Probable topper number.");
        else
            System.out.println("\nGiven Number is not a Probable topper number.");
    }
}
