package com.jimmysun.algorithms.chapter2_5;

import edu.princeton.cs.algs4.StdRandom;
import com.jimmysun.algorithms.chapter2_1.BubbleSort;
public class TheKthNumber {
	public static Comparable select(Comparable[] a, int k) {
		StdRandom.shuffle(a);
		int low =0, hi = a.length-1;
		while(hi>low) {
			int j = partition(a,low,hi);
			if(j==k) return a[k];
			else if (j>k) hi = j-1;
			else if (j<k) low = j+1;
		}
		return a[k];
	}
    
	
	private static int partition(Comparable[] a, int lo, int hi) {
		int i =lo, j = hi+1;
		Comparable v = a[lo];
		
		while(true) {
			while(less(a[++i],v)) if(i==hi) break;
			while(less(v, a[--j])) if(j==lo) break;
			if(i>=j) break;
			exch(a,i,j);
		}
		
		exch(a,lo,j);
		return j;
	}
	
	private static boolean less(Comparable v, Comparable w) {
		return v.compareTo(w) < 0;
	}

	private static void exch(Comparable[] a, int i, int j) {
		Comparable t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
	
	 public static void main(String[] args) {  
	        // TODO Auto-generated method stub  
	         Integer[] list={46,37,63,93,77,11,13,29,17,19}; 
	         int value =(int)select(list, 6);  
	         //BubbleSort.sort(list);
	         for(Comparable v: list) {
	        	     System.out.println(v);
	         }
	         System.out.println("the value is "+value);
	         System.out.println();  
	    }  
}
