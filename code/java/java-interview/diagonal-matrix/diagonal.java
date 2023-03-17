import java.util.*;

public class diagonal{

	public static void main(String[] args){
		
		List<Integer[][]> matrixList = createMatrices();
		Integer[] di;
		for(Integer[][] matrix: matrixList){
			di = getDiagonal(matrix);
			for(Integer i: di){
				System.out.print(i.toString()+ " ");
			}
			 
		}

		

	}

	public static List<Integer[][]> createMatrices(){
		List<Integer[][]> matrixList = new ArrayList<>();
		// 4x4 matrix
		Integer[][] matrix1 = {
  		{1, 2, 3, 4},
  		{5, 6, 7, 8},
  		{9, 10, 11, 12},
  		{13, 14, 15, 16}
		};

		// 5x5 matrix
		Integer[][] matrix2 = {
  		{1, 2, 3, 4, 5},
  		{6, 7, 8, 9, 10},
  		{11, 12, 13, 14, 15},
  		{16, 17, 18, 19, 20},
  		{21, 22, 23, 24, 25}
		};

		// 6x6 matrix
		Integer[][] matrix3 = {
  		{1, 2, 3, 4, 5, 6},
  		{7, 8, 9, 10, 11, 12},
 		{13, 14, 15, 16, 17, 18},
  		{19, 20, 21, 22, 23, 24},
  		{25, 26, 27, 28, 29, 30},
  		{31, 32, 33, 34, 35, 36}
		};

		matrixList.add(matrix1);
		matrixList.add(matrix2);
		matrixList.add(matrix3);

		return matrixList;


	}

	public static Integer[] getDiagonal(Integer[][] matrix){
		List<Integer> list = new ArrayList<>();
		Integer diag_elem;
		for(int row = 0; row < matrix.length; row++){
			diag_elem = matrix[row][row];
			list.add(diag_elem);
		}

		return list.toArray(new Integer[0]); 

	}

}
