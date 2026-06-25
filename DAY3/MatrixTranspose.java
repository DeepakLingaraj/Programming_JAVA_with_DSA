import java.util.Scanner;
class MatrixTranspose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[3][3];
        System.out.print("Enter the 9 elements : ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.print("The elements are: \n ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
              System.out.print(matrix[i][j] + " ");
            }
            System.out.print(" \t \n ");
        }
        System.out.print("The Transpose elements are: \n ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
              System.out.print(matrix[j][i] + " ");
            }
            System.out.print(" \t \n ");
        }
       sc.close();
    }
}