import java.util.Arrays;
public class Array{
    public static void main(String[] args)
    {
        /*  to define an array ,[] are used to display list,new int[3]
        represents new memory with space 3 */
        int[] marks= new int[3];
        marks[0]=9;
        marks[1]=7;
        marks[2]=2;
        

        System.out.println(marks[0]);
        // in java arrays are not printed to priint use indexing e.g.marks[2]
        /* in java if marks or space is not assigned any value by default it will
        initialize it with NULL*/

        // to find the  length of an array we use length
        System.out.println(marks.length);
        // for length of an array we doesn't use ()  

        // SORT = it is used in "Arrays" for which we need to import Arrays by import.java.util.Arrays
        
        Arrays.sort(marks);  
        System.out.println(marks[0]);

        // 2D Array

        int [][] finalmarks = {{95,98,44},{45,34,66}};
        System.out.println(finalmarks[1][0]);
        // [0][0]denotes first student first subject marks,[1][0] denotes second student, first marks
    }
}