package array;
import java.util.*;
public class ArraySortingTest {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int size,i;
        int array[]=new int[20];
        System.out.println("Enter Array Size");
        size = sc.nextInt();
        System.out.println("Enter "+size+ " Array Elements");
        for (i=0;i<size;i++){
            array[i]=sc.nextInt();
        }
        for(i=1;i<size;i++)
        {
            for(int j=0;j<size-i;j++)
            {
                if(array[j]>array[j+1])
                {
                    int temp;
                    temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        System.out.print("Your sorted Array Elements are:");
        for (i=0;i<size;i++){
            System.out.print(" "+array[i]);
        }
    }
}