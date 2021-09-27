
public class find_x {

	public static int find(int[] L, int n, int x) {
		int i = 0;
		
		while (i < n) {
			
			if (L[i] == x) {
				return i;
			}
			
			else {
				i += 2;
			}
			
			if (i > n - 1) {
				i = 1;
			}
		}
		return -1;
	}
	
	
	public static void main(String[] args) {
		int[] L = {4, 5, 6, 7, 8, 9};
		int x = 9;
		int y = L.length;
		
		System.out.println(find(L, y, x));
	}
}
