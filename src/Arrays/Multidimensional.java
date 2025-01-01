package Arrays;

public class Multidimensional
{
    public static void main(String args[])
    {
        int[][] arr = {{1,2,3,4},{10,20,30,40}};
//        Accessing Multidimensional Array
        System.out.println(arr[0][1]); // 2
//      Modifing MultiDimensional Array
        arr[0][1] = 200;
        System.out.println(arr[0][1]); // The Value 2 is Replaced with 200
System.out.println("------------------------------\n\n");
       int[][] num = {
               {1,2,3,4},
               {10,20,30,40},
               {100,200,300,400}
       };
        System.out.println("------------------------------\n\n");

//       Iterating Through for-each loop
        for(int[] row : num) // This loop to Iterate Array in Array ie. {1,2,3,4},{10,20,30,40},{100,200,300,400}
        {
            for(int i : row) // This Loop to iterate Arrays in Array Elements 1,2,3,4,10,20,30,40,100,200,300,400
            {
                System.out.println(i);
            }
            System.out.println("---");
        }
        System.out.println("------------------------------\n\n");

    int[][] myNum = {{1,2,3,4},{10,20,30,40}}; // this Is 2Dimensional Array
//    Iterating Through For loop
     for(int i=0; i< myNum.length;i++)
     {
        for(int j=0;j< myNum[i].length;j++)
         {
         System.out.println(myNum[i][j]);
         }
    }


    }
}
