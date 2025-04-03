import java.util.*;
public class Variables{
    public static void main(String[] args)
    {
       String name ="ritesh";
    //    types of variables : primitive and non primitive
    // primitive- stores simple values
    // byte - 1 [-128 to 127]
    // short - 2 
    // int - 4
    // long - 8
    // float - 4 
    // double - 8
    // char - 2
    // boolean - 1

    // float pi = 3.14F;
    // System.out.println(pi);
    
    // non primitive - stores complex values
    // string 
    // concatenate= to join two or more strings
    // charAt(position) = tells what is present at that position
    String name1 = "ritesh";
    System.out.println(name1.length());
    // .length() is used to find the length of the string

    String name2="verma";
    String fullname=name1+name2;
    System.out.println(fullname);

    String wtf="fucked up the life";
    System.out.println(wtf.charAt(5));
    System.out.println(fullname.charAt(5));
    // substring(0,4) = used to extract a part of the string but index 4 is not included it is exclusive
    
    }
}