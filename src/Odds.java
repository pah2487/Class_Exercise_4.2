import java.util.ArrayList;
import java.util.List;
/**
 * lists the first 100 real odd integers using a for loop
 * @author Patrick H.
 * @since 2017-11-7
 * @version 1.0
 */
public class Odds {
    public static void main(String[] args){
        List<Integer> odds = new ArrayList<>();
        int count;
        int oddNum;
        for(count = 0; count < 100;count++){
            oddNum = ((2 * count)+1);
            odds.add(oddNum);
        }
        System.out.println(odds);
    }
}
