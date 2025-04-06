import java.util.Arrays;
import java.util.Scanner;
public class Except{
    public static void main(String[] args)
    {
        // exception handling = TRY AND CATCH
        int[] marks = {34,45,56};
       
        /* here we dont have 5th index so it's an exception so we use
        TRY and CATCH*/
        try{
        //   write statements here in which exception can occur
           System.out.println(marks[5]);
        }catch( Exception exception){
        //  write statements to do after catching exception
         System.out.println("my name is ritesh");
         int arr[]={1,2,3,4,5};
         System.out.println(arr[2]);


        }
         System.out.println("my name is ritesh");


    }
}
// If there are no exceptions thrown, the catch block is skipped entirely.