import java.util.ArrayList;
import java.util.List;
/**
 * lists the first 100 real even integers using a do while loop
 * @author Patrick H.
 * @since 2017-11-7
 * @version 1.0
 */
public class Evens {
    public static void main(String[] args){
        List<Integer> evens = new ArrayList<>();
        int count = 1;
        int evenNum;
        do {
            evenNum = ((2 * count));
            evens.add(evenNum);
            count++;
        } while (count <= 100);
        System.out.println(evens);
    }
}
