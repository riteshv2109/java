import java.util.Scanner;

public class Input{
    public static void main(String[] args)
    {
        // to take input we need to import Scanner into java first as in first line
        // to take input we use 'Scanner' and create an object  
        Scanner sc = new Scanner(System.in);
        System.out.println("input your name:");
        String name = sc.nextLine();
        /*sc.nextInt() is used to take input as integer.
        sc.next() is used to get input as string ; it only takes tokens 
        i.e. only takes a single word as input. If wanr whole line 
        we use function sc.nextLine()  */
        System.out.println(name);


    }
}