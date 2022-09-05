package Crio.DSA1;

import java.util.Scanner;

public class FindElementQuery {

	 // NOTE: Please do not modify this function
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int q = sc.nextInt();

        while (q-- > 0) {

            int x = sc.nextInt();
            int result = findElementQuery(n, arr, x);

            System.out.println(result);
            sc.close();
        }

    }

    static int findElementQuery(int n, int[] arr, int x) {

        //find mid=(start + end)/2
        //if arr[mid] = item, then find leftmost by reverse looping till 0, keep changing mid whenever item is at found at certain index and break when elemnt is not found at any subsequent index
        //else if item < arr[mid], then end = mid-1
        //else item > arr[mid], then start= mid+1

        int start=0,end=n-1,mid=0;

        while(start<=end){

            mid = (start+end)/2;

            if(x == arr[mid]){
                for(int i=mid-1;i>=0;i--){
                    if(x == arr[i])
                        mid=i;
                    else
                        break;
                }
                return mid;
            }
            else if(x<arr[mid])
                end=mid-1;
            else if(x>arr[mid])
                start=mid+1; 
        }
        return -1;
    }
}
