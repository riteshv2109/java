import java.util.*;

public class Funct{
    /* to create a function use 'public static void function name()'*/
        public static void printJava()
        {
            System.out.println("hello java");
        }
        public static void printname(String name)
        {
            System.out.println(name);
        }
        public static void sum(int a,int b)
        {
            int sum=a+b;
            System.out.println(sum);
        }
    public static void main(String[] args)
    {
       printJava();
       printname("ritesh");
       sum(2,5);


    }
}