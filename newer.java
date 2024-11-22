import java.util.Scanner;

public class newer {
    
    public static void main(String[] args) {
        Scanner count = new Scanner(System.in);
        System.out.println("How many times do you want to solve: ");
        
        int a = count.nextInt();
        int k= 1;
        while (k <= a) {
            Scanner matrixRow = new Scanner(System.in);
            System.out.println();
            System.out.println();
            System.out.println("Enter the row of matrix: ");
        
            int row = matrixRow.nextInt();
        
            Scanner matrixCol = new Scanner(System.in);
            System.out.println("Enter the column of matrix: ");
        
            int col = matrixCol.nextInt();
        
            Scanner matrixAll = new Scanner(System.in);
            System.out.println("Fill the matrix: ");
        
            //int matrixFull[row][col] = matrixAll.nextInt();
            int[][] matrix = new int[row][col];
        
            for (int i=0;i<row;i++) {
                for (int j=0;j<col;j++) {
                    System.out.print("Enter row" + (i+1) + "col" + (j+1) + ":  ");
                    matrix[i][j] = matrixAll.nextInt();
                }
            }
            for (int x=0;x<row;x++) {
                for (int y=0;y<col;y++) {
                    if (y==0) {
                        System.out.println();
                        System.out.print("{");
                    }
                    System.out.print(matrix[x][y] + " ");
                }
                System.out.print("}");
            }
            System.out.println();
            Scanner transpose = new Scanner(System.in);
            System.out.println("For transpose, type 1: ");
            System.out.println("For determinant, type 2: ");
        
            int tran = transpose.nextInt();
            if (tran==1) {
                for (int x=0;x<row;x++) {
                    for (int y=0;y<col;y++) {
                        if (y==0) {
                            System.out.println();
                            System.out.print("{");
                        }
                        System.out.print(matrix[y][x] + " ");
                    }
                    System.out.print("}");
                }
            }
            else if (tran==2) {
                if (row==3 && col==3) {
                    int determinant1;
                    int determinant2;
                    int determinant3;
                    int total;
                    determinant1 = (matrix[0][0] *(matrix[1][1]*matrix[2][2] - matrix[1][2]*matrix[2][1]));
                    determinant2= (matrix[0][1] *(matrix[1][0]*matrix[2][2] - matrix[1][2]*matrix[2][0]));
                    determinant3 = (matrix[0][2] *(matrix[1][0]*matrix[2][1] - matrix[1][1]*matrix[2][0]));
                    total = determinant1 - determinant2 + determinant3;
                    System.out.println("Determinant is: " + total);
                } else {
                    System.out.println("I no sabi the rest.");
                }
            }
            else {
                System.out.println("End of program.");
            }
            k++;    
        }
    }
}
    
  
