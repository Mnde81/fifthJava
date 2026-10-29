package lt.vcd6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() throws FileNotFoundException {

        Scanner fin=new Scanner(new File("temperaturos.txt"));
        int n=fin.nextInt();

        int[][] temp=new int[n][7];

        for ( int i = 0; i <n; i++) {

            for (int d=0; d<7; d++) {
                temp[i][d]=fin.nextInt();
            }

        }
//        for (int i =0; i < n; i++) {
//            for (int d=0; d<7; d++){
//                System.out.print(temp[i][d]+"\t");
//            }
//            System.out.println();
//
//        }

        for (int[] sav:temp) {
            for (int diena:sav){
                System.out.print(diena+"\t");

            }
            System.out.println();
        }

//        int suma=0;
//        for(int t:temp) {
//            System.out.print(t+" ");
//            suma +=t;
//        }

//        System.out.println("\nVidutine temperatura: " + (float)suma/temp.length);
    }
}
