import java.util.Scanner;
public class question16 {
    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
		System.out.print("Enter Year:-");
		int year = in.nextInt();
        boolean flag = false;
        if(year % 4 == 0)
        {
            if( year % 100 == 0)
            {
                if ( year % 400 == 0)
                    flag = true;
                else
                    flag = false;
            }
            else
                flag = true;
        }
        else
            flag = false;
        if(flag)
            System.out.println(year + " is a leap year.");
        else
            System.out.println(year + " is not a leap year.");
    }
}