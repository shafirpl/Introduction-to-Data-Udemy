
public class Insertion_Sort {
 int [] array;
 
 Insertion_Sort(int [] input){
	 for (int i = 1; i<input.length;i++) {
		 //Since we are assuming that the first item is sorted, we need to run loops for each unsorted item, so say if we
		 //had 4 items, then we had to run the loop 3 times, since we are starting from 1, we have to do 1,2,3 for i
		 int value = input[i];
		 int j = i;
		 
		 //think of it as the item we picked up from the unsorted array, that thing is a hole and we are just moving the hole
		 //until we find the right place to place the hole, and then we put the value to the hole. So we are basically swaping 
		 //an item with a hole.
		 //We had to do j>0 as j>=0 will result j-1 to be -1, which will throw an error
		 while(j>0 && input[j-1]>value) {
			 input[j] = input[j-1];
			 j--;
			 //System.out.println("j value is:"+j);
		 }
		 input[j] = value;
	 }
	array = input;
 }
	void print_array() {
		for(int i = 0; i<array.length;i++) {
			System.out.println(array[i]);
		}
	}
}
