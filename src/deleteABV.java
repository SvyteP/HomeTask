import java.util.Arrays;
import java.util.Scanner;

public class deleteABV {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt() , count = in.nextInt(),tmp=0;
        in.nextLine();
        String str = in.nextLine();
        boolean bol=true;

        char [][] matrix = new char[2][n];
        int x=0;
        for (char i : str.toCharArray()){

            for (char  j : matrix[0]){

                if(i == j)
                {

                    bol = false;
                }
            }

            if(bol) {
                matrix[0][x] = i;
                System.out.print(matrix[0][x]);
                matrix[1][x] = 0;
                x++;
            }

            bol=true;

        }
        x=0;

        for (char i: matrix[0]){

            for (char j: str.toCharArray()){

                if(i==j){
                    tmp = (int) matrix[1][x];
                    tmp++;
                    matrix[1][x] = (char) (tmp + '0');


                }
                x++;
            }
        }
        System.out.println();
        for (char i: matrix[0])
        {
            System.out.print(" "+i);
        }
        System.out.println();
        for (char i: matrix[1])
        {
            System.out.print(" "+i);
        }

        }

    }

