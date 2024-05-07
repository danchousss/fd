import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
public  class Main {
    public static void main(String[]args){
        Scanner dansc=new Scanner(System.in);
        Random danrn=new Random();
        int number=danrn.nextInt(4,7);
        System.out.println(number);
        ArrayList<Integer>danint=new ArrayList<Integer>();
        for(int i=0;i<number;i++){
            int number2= danrn.nextInt(-2,8);
            System.out.println(number2);
            danint.add(number2);
        }
        int max=0;
        int min=-1;
        for(int i=0;i<number;i++){
            if(danint.get(i)>0){
                if(max==0 || danint.get(i)>max){
                    max=danint.get(i);
                }
                if(min==-1 || danint.get(i)<min){
                    min =danint.get(i);

                }
            }
        }

        if(max==0 && min==0){
            System.out.println(-1);
            System.out.println(-1);
        }else{
            System.out.println(max);
            System.out.println(min);
        }
    }

}