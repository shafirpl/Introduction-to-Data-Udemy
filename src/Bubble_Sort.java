/**
 * 
 */

/**
 * @author shafi
 *
 */



public class Bubble_Sort {
	int [] array;

	Bubble_Sort(int [] input){
		for (int i = 0; i<=input.length-2; i++) {
			for(int j =0; j<=input.length-2-i;j++) {
				if(input[j]>input[j+1]) {
					int temp = input[j];
					input[j] = input[j+1];
					input[j+1] = temp;
				}
			}
		}
		array = input;
	}
	
	void PrintArray(){
		for(int i = 0; i<array.length;i++) {
			System.out.println(array[i]);
		}
	}
	
}
