package JavaMiscPractice;

public class SpiralTravelsal2DArray {

	public static void spiralArrayTraversal(int[][] array) {

		int m = array.length;
		int n = array[0].length;
		int dir = 0;
		int top = 0;
		int down = m - 1;
		int left = 0;
		int right = n - 1;
		while (left<=right && top<=down){
			if (dir == 0) {
				for (int i = left; i <= right; i++) {
					System.out.println(array[top][i]);
				}
				top += 1;

			}
			if (dir == 1) {
				for (int i = top; i <= down; i++) {
					System.out.println(array[i][right]);
				}
				right -= 1;

			}
			if (dir == 2) {
				for (int i = right; i >= left; i--) {
					System.out.println(array[down][i]);
				}
				down -= 1;
			}
			if (dir == 3) {
				for (int i = down; i >= top; i--) {
					System.out.println(array[i][left]);
				}
				left +=1;
			}

			dir = (dir + 1) % 4;
		}
	}

	public static void main(String[] args) {
		int mat[][] = { { 1, 2, 3 , 9,11}, 
				        { 5, 6, 7 ,1,1},
				        { 9, 10, 11 ,1,1} };

		spiralArrayTraversal(mat);
	}
}
