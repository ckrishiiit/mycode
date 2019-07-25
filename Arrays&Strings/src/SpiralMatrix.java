import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
	
	  public static List<Integer> spiralOrder(int[][] matrix) {
		  
		  int m = matrix.length;
		  int n = matrix[0].length;
		  System.out.println(m +","+n);
		  int left = 0, right = n-1;
		  int top = 0, bottom = m-1;
		  
		  List<Integer> list = new ArrayList<>();
		  
		  while(list.size() < m*n) {
			  
			  //top row
			  for(int j=left; j<=right; j++) {
				  list.add(matrix[top][j]);
			  }
			  top++;
			  
			  //top right
			  for(int i=top; i<=bottom; i++) {
				  list.add(matrix[i][right]);
			  }
			  right--;
			  
			  if(bottom < top)
				  break;
			  //bottom row
			  for(int k=right; k>=left; k--) {
				  list.add(matrix[bottom][k]);
			  }
			  bottom--;
			  
			  if(right< left)
				  break;
			  
			  for(int i=bottom; i>=top; i--) {
				  list.add(matrix[i][left]);
			  }
			  left++;  
		  }
		  
		  
		  return list;
		  
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arr = { 
				{1,2,3,4},
				{5,6,7,8},
				 {9,10,11,12}
				 
		          };
		
		List<Integer> list = spiralOrder(arr);
		for (Integer no : list) {
			System.out.print(no+" ");
		}
	}

}
