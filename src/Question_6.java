
public class Question_6 {
	
	/*
	i ← 0
	j ← 0
	while i < n do {
	if L[j] = x then return j
	else j ← j + 2
	if j ≥ n − 1 then j ← 1
	i ← i + 1
	}
	return -1
	*/
	
	public static int search(int[] L, int n, int x) {
		
		int i = 0;
		int j = 0;
		
		while (i < n) {
			// the while loop will stop when i is 5 which is the size of array - 1
			
			if (L[j] == x) {
				return j;
			} // if found at j then we return j (index)
			
			else {
				j += 2;
			} // if not found then we increment j by 2, checking even indexes
			
			if (j >= n - 1) {
				j = 1;
				i += 1;
			} // if j is at the last element in the array or incremented higher start at 1 again
		} // exits an error in this if statement if we want to check the final element in the array
		
		return -1;
	}
	
	public static void main(String[] args) {
		int[] L = {4, 5, 6, 7, 8, 9};
		int x = 9;
		int y = L.length;
		
		System.out.println(search(L, y, x));
	}

}
