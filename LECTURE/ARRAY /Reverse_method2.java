import java.util.Scanner;
public class Reverse_method2 {
    static void swapInArray(int array1[] , int i , int j){
        int temp = array1[i];
        array1[i] = array1[j];
        array1[j] = temp;
        for(int k = 0; k < array1.length;k++) System.out.println(array1[j]+" ");
    }
    static void Reverse_Array2(int arr[]){
    int i=0;
    int j=arr.length-1;
    while(i<j){
        swapInArray(arr,i,j);
        i++;
        j--;
    }
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int array[] = new int [size];
        System.out.println("Enter the elements of the array ");
        for(int i=0;i<array.length;i++) array[i] = sc.nextInt();
        for(int j=0;j<array.length;j++) System.out.print(array[j]+" ");
        System.out.println(" ");
        Reverse_Array2(array);
    } 
}
