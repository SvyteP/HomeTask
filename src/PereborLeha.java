import java.util.Arrays;

public class PereborLeha {

        static int[] arr = new int[] {0,0,0,0,0};
        static int[] end = new int[] {1,1,1,1,1};


        public static void main(String[] args) {
            recBin(4);
        }
           public static int recBin(int i){

               if(Arrays.equals(arr,end)){
                   return 1;
               }

               if(arr[i]==1){
                   arr[i]=0;


                    i--;
                   return recBin(i);
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

            return  recBin(i);
            }
}
