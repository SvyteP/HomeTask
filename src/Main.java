import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt() , count = in.nextInt(),tmp=n;
        boolean bol = true;

        while(bol){


            if(count>=tmp)
            {
             count -= tmp;
             tmp--;

             if(tmp<1){
                 tmp=n;
             }

            }

            if(count<tmp){
                bol=false;

            }

        }
        System.out.println(count);

    }
}