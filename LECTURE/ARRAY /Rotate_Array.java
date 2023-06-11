// Rotate the array a by the given k steps where k is non negaive Note k can be greater then nas well
import java.util.Scanner;
public class Rotate_Array{
    static int[] rotate_array(int array2[] , int num1){
        int n = array2.length;
        int result_arr [] = new int [n];
        num1 = num1 % n ;
        int j = 0;
        for(int i = n-num1 ; i<array2.length ; i++){ // here the loop will itrate for given number this loop will enter back element 
        result_arr[j++] = array2[i];
        }
        for(int i = 0 ; i<n-num1 ; i++){ // This loop print starting elements in the array
            result_arr[j++] = array2[i];
            }
        return result_arr;
    }

    static void print_arr(int arr[]){
        for(int j = 0 ;j<arr.length ; j++) System.out.print(arr[j]+" ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int array1[] = new int [size];
        int arr_len = array1.length;
        System.out.println("Enter the elements of the array ");
        for(int i=0;i<=array1.length-1;i++) array1[i]=sc.nextInt();
        print_arr(array1);   
        System.out.println("  ");
        System.out.println("Enter the number by which you want to rotate the array ");
        int rotate_num = sc.nextInt();
        System.out.println("Array after rotation");
        print_arr(rotate_array(array1,rotate_num));   
    }   
}
