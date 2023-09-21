import java.util.Scanner;

public class logsError {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int kol = in.nextInt(),a=0,b=0;
        int [] arr = new int[kol+1];
        int kolDiap = 0;


        for (int i=1;i<=kol;i++){
            arr[i] = in.nextInt();
        }

        kolDiap = in.nextInt();

        for(int i=1 ;i<=kolDiap;i++){
            a=in.nextInt();
            b=in.nextInt();

            for (int j=a;j<=b;j++){
                if (a+1==b){
                    System.out.println("Yes");
                    break;
                }

                if(j+2 < kolDiap) {

                    if (arr[j] <= arr[j + 1]) {


                        if (arr[j + 1] > arr[j + 2]) {

                            System.out.println("Yes");
                            break;
                        }
                        else if(arr[j]==arr[j+1])
                        {

                            System.out.println("Yes");
                            break;
                        }
                        else {
                            System.out.println("No");
                            break;
                        }
                    }

                }
                else{
                    if  (a == kolDiap)
                    System.out.println("Yes");
                }
            }



        }

    }
}
