package basics;

public class PrimiviteType {

    public static void main(String[] args) {
        int i = 5;
        System.out.println("Before :: " + i);
        change(i);
        System.out.println("After :: " + i);

    }

    //
    private static void change(int a) {
        //
        a++; //a=a+1
    }

}
