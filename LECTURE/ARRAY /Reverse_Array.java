// Reverse an array consist of intigers
import java.util.Scanner;
public class Reverse_Array{
    static int [] reverse_arr(int arr[]){
        int j = 0;
        int len = arr.length;
        int answer[] = new int [len];
        for(int i = len-1 ; i>=0 ; i--){
            answer[j++] = arr[i];
            
        }
        return answer;
    }
    static void display(int arr[]){
        for(int j=0;j<arr.length;j++) System.out.print(arr[j]+" ");
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
        int ans[] = reverse_arr(array);
        display(ans);
    }    
}
