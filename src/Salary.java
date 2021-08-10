import java.util.*;

public class Salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter working hours in a week:");
        int total_hours = 0, hours=0;
        double  salary = 0.0;
        for(int i=0;i<7;i++){
            hours = sc.nextInt();
            total_hours+=hours;
            salary+=hours*100;
            if (hours>8)
                salary+=(hours-8>0?hours-8:0)*15;
            else if (i==6 && hours>0)
                salary+=hours*100*0.25;
            else if (i==0 && hours>0)
                salary+=hours*100*0.50;
        }
        salary+=total_hours>40?(total_hours-40)*25:0;
        System.out.println("Total Salary will get for a week is : "+salary);

    }
}
