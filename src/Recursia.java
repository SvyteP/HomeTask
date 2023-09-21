import java.util.Scanner;

public class Recursia {
    static Scanner in =new Scanner(System.in);
    private static int sumJo = in.nextInt(),count = in.nextInt();
    private static int [] bank = new int[count*2];
    public static void main(String[] args) {
        init(bank.length);
        getBank();
        System.out.println( raidBank(bank.length-1,bank.length-1));

    }
    static int i=0 ,result=0;
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

    public static int raidBank(int c ,int t){

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
        }

        return raidBank(c-1,t);


    }
}
