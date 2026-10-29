package lt.vcd4;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        System.out.println("Iveskite pazymiu kieki: ");
        Scanner in=new Scanner(System.in);

        int n=in.nextInt();
        int[] pazymiai=new int[n];

        for (int i=0; i <n; i++) {
            System.out.print("Iveskite " +(i+1)+ " pazymi: ");
            pazymiai[i]= in.nextInt();
        }

        int suma=0;
        int min=pazymiai[0];
        int max=pazymiai[0];
        for (int i = 0; i < n; i++) {
            suma=suma+pazymiai[i];

            if (pazymiai[i]<min){
                min=pazymiai[i];
            }

            if (pazymiai[i]>max){
                max=pazymiai[i];
            }

        }

        for (int t:pazymiai){    //for each javoj
            System.out.print(t + " ");
        }

        System.out.println("\nVidurkis " + (float) suma / pazymiai.length);

        System.out.println("Didziausias " + max);
        System.out.println("Maziausias " + min);


    }
}
