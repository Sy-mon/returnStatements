//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       int [] awesomeArray = gimmeArrayFromInts(4, 5, 8);
       System.out.println(awesomeArray[0]);
       System.out.println("================");
        System.out.println(awesomeArray[1]);
        System.out.println("==============");
        System.out.println(awesomeArray[2]);


    }

    public  static int [] gimmeArrayFromInts(int a, int b, int c){
        int [] array = new int[3];
        array[0] = a;
        array[1] = b;
        array[2] = c;

        return array;
    }
}