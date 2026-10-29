package lt.vcd3;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        int[] temp1=new int[3];

        temp1[0]=5;
        temp1[1]=9;
        temp1[2]=3;



        int[] temp2=new int[3];

//        temp2[0]=3;
//        temp2[1]=0;
//        temp2[2]=-1;

temp2=temp1.clone();

temp2[1]=-1;
temp1[0]=10;

        for (int t:temp1){    //for each javoj
            System.out.print(t + " ");
        }
        System.out.println();
        for (int t:temp2){    //for each javoj
            System.out.print(t + " ");
        }

    }
}
