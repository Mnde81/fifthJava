package lt.vcd2;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

//        int[] temp=new int[3];
        int[] temp= {8, 10, 7, 8, 9 ,12, 9};
        temp[0]=5;

//        System.out.println(temp[0]+ " " + temp[1]+ " "+temp[2]);
//
//        for (int i =0; i < temp.length; i++) {
//            System.out.print(temp[i]+ " ");
//        }

        for (int t:temp){    //for each javoj
            System.out.print(t + " ");
        }

    }
}
