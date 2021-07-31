package mergeSortArrayNoExtraSpace;

import java.util.Arrays;

public class MergeSortArrayNoExtraSpace {
	
	public static void merge(int a[], int m, int b[], int n) {
		int i = 0;
		int temp = 0;
		while(a[m-1]>b[0]) {
			if(a[i]>b[0]) {
				temp = a[i];
				a[i] = b[0];
				b[0] = temp;
				Arrays.sort(b);
			}
			i++;
		}
		System.out.println("sorted arrays after merging are");
		System.out.print("array one: ");
		for(int arr1:a) {
			System.out.print(arr1 + " ");
		}	
			System.out.println();
			System.out.print("array two: ");
		for(int arr2:b) {	
			System.out.print(arr2 + " ");
		}
	}
	
	public static void main(String[] args) {
		int a[] = {1,4,5,6,6,8,9};
		int m = a.length;
		int b[] = {2,3,3,7,8,11,15};
		int n = b.length;
		System.out.println("provided arrays are");
		System.out.print("array one: ");
		for(int x:a) {
			System.out.print(x + " ");
		}
		System.out.println();
		System.out.print("array two: ");
		for(int y:b) {
			System.out.print(y + " ");
		}
		System.out.println("\n");
		MergeSortArrayNoExtraSpace.merge(a, m, b, n);
	}
}
