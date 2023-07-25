import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {


        LinkedList ll = new LinkedList();
        for (int i = 0;i<20 ;i++ )
        {
            ll.add(i);
        }
        ll.print();
        ll.expand1();
        ll.print();
        ll.expand();
        ll.print();
    }

}