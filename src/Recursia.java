import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Recursia {
    static Scanner in =new Scanner(System.in);
    private static final int sumJo = in.nextInt(),count = in.nextInt();
    private static int [] bank = new int[count*2];
    static int i=0 ,result=0;
    static boolean tmp = true;

    static List <Integer> win = new ArrayList<>();


    public static void main(String[] args) {
        init(bank.length);
        getBank();
        System.out.println( raidBank(bank.length-1,bank.length-1,bank.length-1));

    }

    public static int init (int c){
        if (i == c){
            return 0;
        }
        bank[i] = in.nextInt();
        bank[i+1] = bank[i];
        i+=2;

        return init(c);
    }

    public static void getBank(){
        for (int i:
             bank) {
            System.out.println(i);
        }
    }



    public static int raidBank(int c,int z ,int x) {


        if(x==0){
            return -1;
        }
        if (z==0){
            x--;
            z=x-1;
            c=z-1;

        }

        if(c<0){

            c=z-1;
            z--;
        }


        if (result < sumJo){

            if (tmp && x != bank.length-1)
            {
                result = bank[x];
                win.add(result);
                tmp=false;
            }

            result += bank[c];

            win.add(bank[c]);
            return raidBank(c-1,z,x);

        }
        else if(result>sumJo)
        {
            win.clear();
            tmp=true;
            result = bank[x];
            z--;

        }

        if(result==sumJo){
            System.out.println(Arrays.toString(win.toArray()));
            return result;
        }
        if(x==0){
            return -1;
        }

        return raidBank(c,z,x);
    }
}
