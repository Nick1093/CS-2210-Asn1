public class MostTimes {

    public static int most_times(int[] A, int n){
    // Input: Array A storing n  integer values
    // Output: The value that appears the largest number of times in $A$. If several values appear
    //         in $A$ the largest number of times, the algorithm must return the smalles among these
    //         values.

		// create a new temporary array to store integers that represent the number of times an element
		// in array A appear, we will use this temporary array to find the maximum counted element
    	int[] temp = new int[n];
    	
		// create an integer variable to count the appearances of each element in the array
        int count = 0;

        // 
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
        
        int max = 0;
        
        for (int j = 0; j < n; j++) {
        	if (temp[j] > max) {
        		max = temp[j];
        	}
        }
        
        int index = A[0];
        
        for (int k = 0; k < n; k++) {
        	if (temp[k] == max) {
        		if (index > A[k])
        			index = A[k];
        	}
        }
        
        return index;
    }
    
    
    public static void main(String[] args) {


		
    	
    	int array[] = {5, 1, 2, 3, 5, 20, 36, 78, 20, 300}; // returns 5
    	
    	// 12 1 2 3 7 12 3 56 12 224 448 --> returns  12
    	
    	System.out.println(most_times(array, array.length));
    }
    
    
    
    
    
}
