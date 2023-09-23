import java.util.Arrays;

public class PereborLeha {

        static int[] arr = new int[] {0,0,0,0,0};
        static int[] end = new int[] {1,1,1,1,1};


        public static void main(String[] args) {
            recBin(4);
        }
           public static void recBin(int i){

               if(Arrays.equals(arr,end)){
                   return ;
               }


               if(arr[i]==1){
                   arr[i]=0;


                    i--;
                   recBin(i);
                   return;
               }
               else
               {
                   arr[i]=1;
                   i=4;
               }


                for (int a: arr) {
                    System.out.print(a);
                }
                System.out.println();

               recBin(i);
            }
}
