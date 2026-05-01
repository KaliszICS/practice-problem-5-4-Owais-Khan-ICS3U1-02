/**

        * File: Lesson 5.4 - Swapping, reverse, split

        * Author: Owais Ali Khan

        * Date Created: May 1, 2026

        * Date Last Modified: May 1, 2026

        */

public class PracticeProblem {

	public static void main(String args[]) {

	}
	public static void stringSwap(String[] arr, int n1, int n2){
        String temp;
        temp = arr[n1];
        arr[n1] = arr[n2];
        arr[n2] = temp;

    }    
    
    public static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        int temp;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;

        }
        
    }
    
    public static String[] toWordArray(String words) {
        String[] arr = words.split(" ");
		int count = 0; 
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != "") {
				count++;
			}
		}

		String[] arr2 = new String[count];
		int origIdx = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != "") {
				arr2[origIdx] = arr[i];
				origIdx++;
			}
		}

		return arr2;
    }

}
