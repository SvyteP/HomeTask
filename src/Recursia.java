import java.util.Scanner;

public class Recursia {
    static Scanner in =new Scanner(System.in);
    private static int sumJo = in.nextInt(),count = in.nextInt();
    private static int [] bank = new int[count*2];
    static int i=0 ,result=0;
    static boolean[] bol = new boolean[count*2];
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
/*
        if(t<0){
            return -1;
        }
        if(result>sumJo || c<0){
            result=0;
            System.out.println("1");
            c = t;

            t--;
        }
        if (result<sumJo){
            result+=bank[c];
        }
        if(result==sumJo){

            return result;
        }*/
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
            result += bank[c];
            return raidBank(c-1,z,x);

        }else if(result>sumJo)
        {
            result = bank[x];
            z--;

        }

        if(result==sumJo){
            return result;
        }
        if(x==0){
            return -1;
        }

        return raidBank(c,z,x);
    }
}
