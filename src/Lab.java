import java.util.*;

public class Lab {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] capacity = new int[4];
        for(int i=0;i<=3;i++) {
            if (i == 3) System.out.print("Enter number of students need to be allocated : ");
            else System.out.print("Enter Lab " + (i + 1) + " capacity :");
            capacity[i] = sc.nextInt();
            System.out.println();
        }
        int val=Integer.MAX_VALUE, ans=0;
        for(int i=0;i<3;i++) {
            if (capacity[3]<=capacity[i] && val>capacity[i]) {
                val = capacity[i];
                ans = i+1;
            }
        }
        if (ans==0)
            System.out.println("Labs are not available.");
        else
            System.out.println("Labs "+ ans +" is available.");

    }
}
