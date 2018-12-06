package hw11_1;

import java.util.Arrays;

public class MyIntegerSort {
	public static void mergeSort(int[] n) {
		/*
		 * int j=0;
		for(int i=1;i<n.length;i++) {
			if(i==j) continue;
			if(n[i]>n[j]) {
				continue;
			}
			else if(n[i]<n[j]) {
				int s=n[i];
				n[i]=n[j];
				n[j]=s;
				j=i;
			}
		}
		 */
		MyIntegerSort.mergeSort(n, 0, n.length-1);
	}
	public static void mergeSort(int[] arr, int m, int n) {
		int middle;
		if (m < n) {
			middle = (m + n) / 2;
			mergeSort(arr, m, middle);
			mergeSort(arr, middle + 1, n);
			merge(arr, m, middle, n);
		}
	}

	public static void merge(int[] arr, int m, int middle, int n) {
		int i, j, k, t;
		int[] sorted=new int[arr.length];
		i = m;
		j = middle + 1;
		k = m;

		while (i <= middle && j <= n) {
			if (arr[i] <= arr[j])
				sorted[k] = arr[i++];
			else
				sorted[k] = arr[j++];
			k++;
		}

		if (i > middle) {
			for (t = j; t <= n; t++, k++)
				sorted[k] = arr[t];
		} else {
			for (t = i; t <= middle; t++, k++)
				sorted[k] = arr[t];
		}

		for (t = m; t <= n; t++)
			arr[t] = sorted[t];
	}
}
