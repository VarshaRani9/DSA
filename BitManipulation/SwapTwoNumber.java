import java.util.ArrayList;
import java.util.List;

public class SwapTwoNumber {

    // USING a third variable
    private static List<Integer> swap1(int a, int b) {
        int temp = a;
        a = b;
        b= temp;
        List<Integer> l = new ArrayList<>();
        l.add(a);
        l.add(b);
        return l;
    }

    // USING XOR operator
    private static List<Integer> swap2(int a, int b) {
        a = a^b;
        b = a^b;
        a = a^b;
        List<Integer> l = new ArrayList<>();
        l.add(a);
        l.add(b);
        return l;
    }

     public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l = swap1(70,50);
        System.out.println(l);
        l = swap2(10,20);
        System.out.println(l);
     }
}