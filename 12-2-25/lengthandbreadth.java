import java.util.ArrayList;
import java.util.List;

public class lengthandbreadth {
    static double switchCase(int choice, List<Double> arr){
        // code here
        double r=0;
        switch(choice){
            case 1:
                double d = arr.get(0);
                r = 3.14159 * d * d;
                break;
            case 2:
                double l = arr.get(0);
                double b = arr.get(1);
                r = l*b;
                break;
        }
        return r;
    }
    public static void main(String[] args) {
        int c = 1;
        List<Double> l = new ArrayList<>();
        l.add(4d);
        System.out.print(switchCase(c, l));

    }
}
