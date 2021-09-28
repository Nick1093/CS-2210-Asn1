public class MostTimes {

    public int most_times(int[] A, int n){
    // Input: Array A storing n  integer values
    // Output: The value that appears the largest number of times in $A$. If several values appear
    //         in $A$ the largest number of times, the algorithm must return the smalles among these
    //         values.

		// create a new temporary array to store integers that represent the number of times an element
		// in array A appear, we will use this temporary array to find the maximum counted element
    	int[] temp = new int[n];
    	
		// create an integer variable to count the appearances of each element in the array
        int count = 0;

		// for the sake of this if this, if the length of the input array is 0 we will return -1
		if (A.length == 0) {
			return -1;
		}
		

        // this for loop loops through the array to count the occurences of each element and store them in temp
        for (int i = 0; i < n; i++) {
        	
        	int curr = A[i];
        	
        	for (int j = 0; j < n; j++) {
        		if (A[j] == curr) {
        			count += 1;
        		}
        	}
        	
        	temp[i] = count;
        	
        	count = 0;
        			
        }
        
		// declare a variable to store the highest count of occurence
        int max = 0;
        
		// for loop to loop through temp to get the max
        for (int j = 0; j < n; j++) {
        	if (temp[j] > max) {
        		max = temp[j];
        	}
        }
        
		// int variable to store the index of the most repeated number
        int index = A[0];
        
		// we use a for loop to loop through the temp array comparing the element with the max, if it is the max we store it in the index by referencing where it is in the original array A, 
		// if there exists a tie in count, we want to compare the elements in array A and store the smallest one (in the if statements)
        for (int k = 0; k < n; k++) {
        	if (temp[k] == max) {
        		if (index > A[k])
        			index = A[k];
        	}
        }
        
		// return index which is the smallest most repeated number in array A
        return index;
    }
    
	
	// this is the main method where I test my program to see if it returns the correct output
	public static void main(String[] args) {

		MostTimes answer = new MostTimes();

		int A[] = {5, 1, 2, 3, 5, 20, 36, 78, 20, 300}; // returns 5
	
    		// 12 1 2 3 7 12 3 56 12 224 448 --> returns  12
    	
    	System.out.println("\n" + answer.most_times(A, A.length) + "\n");
    }
    
    
    
    
    
}
