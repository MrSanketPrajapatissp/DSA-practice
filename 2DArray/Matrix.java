import java.util.*;


public class Matrix {

    static void simpleMatrix()
    {
        Scanner sc = new Scanner(System.in);
        int mat[][] = new int[3][2];

        int n = mat.length, m = mat[0].length;

        for(int i=0; i<n; i++)
        {
            for(int j=0; j< m; j++)
            {
                mat[i][j] = sc.nextInt();

            }
        }

        for(int i = 0; i< n; i++)
        {
            for(int j = 0; j<m; j++)
            {
                System.out.print(+mat[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void spiralMatrrix(int matrix[][])
    {
        int startingRow = 0;
        int startingCol = 0;
        int endingCol = matrix[0].length-1;
        int endingRow = matrix.length -1;

        while (startingRow <= endingRow && startingCol <= endingCol)
        {


            // top

            for(int j = startingCol; j<= endingCol; j++)
            {
                System.out.print(matrix[startingRow][j]+" ");
            }

            // Right

            for(int i = startingRow+1; i<=endingRow; i++)
            {
                System.out.print(matrix[i][endingCol]+" ");
            }

            // bottom

            for(int j = endingCol - 1; j>=startingCol; j--)
            {
                if(startingRow == endingRow)
                {
                    break;
                }

                System.out.print(matrix[endingRow][j]+" ");
            }

            // left

            for(int i = endingRow -1; i >= startingRow + 1; i--)
            {
                if(startingCol == endingCol)
                {
                    break;
                }
                
                System.out.print(matrix[i][startingCol]+" ");
            }

            startingCol++;
            startingRow++;
            endingCol--;
            endingRow--;
        }
    }
    
    public static int DiagonalSum(int matrix[][])  // O(n^2)
    {
        int sum = 0;
        for(int i = 0; i < matrix.length; i++)
        {
            for(int j = 0; j < matrix[0].length; j++)
            {
                if(i == j)
                {
                    sum += matrix[i][j];
                }
                else if(i + j == matrix.length -1)
                {
                    sum += matrix[i][j];
                }
            }
        }
        return  sum;
        
    }

    public static int DiagonalSumOpt(int matrix[][])  // O(n)
    {
        int sum = 0; 
        for(int i = 0; i<matrix.length; i++)
        {
            sum += matrix[i][i];

            if(i != matrix.length - i - 1)
            {
                sum += matrix[i][matrix.length - i - 1];
            }
        }
        return sum;
    }


    public static boolean  stairCaseSearch(int matrix[][], int key)
    {
        int row = 0; int col = matrix[0].length -1; 

        while(row < matrix.length && col >= 0)
        {
            if(matrix[row][col] == key)
            {
                System.out.println("key is found at index ("+row+","+col+")");
                return true;
            }
            else if(key < matrix[row][col])
            {
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("Key is not found!");
        return false;
    }
    public static void main(String[] args) {
            
        int matrix[][] = {
            {0,1,2},
            {3,4,5},
            {6,7,8},

        };
    //   simpleMatrix();
    // spiral Matrix call
    //    int sum  = DiagonalSum(matrix);
    //    int sumOptimize  = DiagonalSumOpt(matrix);
    //    System.out.println("Sum : "+sum);
    //    System.out.println("Sum : "+sumOptimize);

    stairCaseSearch(matrix, 75);
    }
}