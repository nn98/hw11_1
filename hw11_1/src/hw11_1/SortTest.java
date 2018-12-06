package hw11_1;

import java.util.Arrays;
import java.util.Scanner;

public class SortTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("hw11_1: 김윤서\n배열 길이 입력 : ");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.print(n+"개의 정수 입력 : ");
		int[] array=new int[n];
		for(int i=0;i<array.length;i++) {
			array[i]=s.nextInt();
		}
		System.out.println("\n정렬 전 배열 = "+Arrays.toString(array));
		MyIntegerSort.mergeSort(array,0,array.length-1);
		System.out.println("정렬 후 배열 = "+Arrays.toString(array));
	}

}
