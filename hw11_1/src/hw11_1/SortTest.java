package hw11_1;

import java.util.Arrays;
import java.util.Scanner;

public class SortTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("hw11_1: ������\n�迭 ���� �Է� : ");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.print(n+"���� ���� �Է� : ");
		int[] array=new int[n];
		for(int i=0;i<array.length;i++) {
			array[i]=s.nextInt();
		}
		System.out.println("\n���� �� �迭 = "+Arrays.toString(array));
		MyIntegerSort.mergeSort(array,0,array.length-1);
		System.out.println("���� �� �迭 = "+Arrays.toString(array));
	}

}
