package lt.vcd5;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        System.out.println("Iveskite vienazenklius skaicius, apskaiciuosime kiek ir kokiu skaiciu ivedete, pabaiga 0: ");
        Scanner in=new Scanner(System.in);

        int n;
        int[] sk= new int[10];

        do{
            n=in.nextInt();
            sk[n]++;

        }while(n!=0);

        for (int i=0; i<10; i++) {
            System.out.println(i+": "+sk[i]);
        }
    }
}
