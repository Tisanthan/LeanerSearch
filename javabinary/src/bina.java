import java.util.Scanner;

public class bina{

    public static void main(String[] args){
        long[] arry;
        arry = new long[6];
        int nElems;
        int k,j=01,i;
        long searchkey;

        for (i=0;i<arry.length;i++){

            Scanner inpu = new Scanner(System.in);

            System.out.print("enther the number "+j+" :");

            arry[i] = inpu.nextLong();

            j++;




        }
        Scanner inpu =new Scanner(System.in);

        System.out.print("enter the search key:");

        searchkey = inpu.nextLong();

        nElems = arry.length;

        for (i=0;i<arry.length;i++){

            System.out.print(arry[i]+",");
        }

        for (i=0;i<nElems;i++){

            if(arry[i]==searchkey) {
                break;
            }

        }
        if(i==nElems)
            System.out.print("cannot found"+searchkey);
        else
            System.out.printf("found "+searchkey);





    }

}
