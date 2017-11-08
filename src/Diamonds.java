/**
 * creates a diamond our of asterisks using a while loop
 * @author Patrick H.
 * @since 2017-11-7
 * @version 1.0
 */
public class Diamonds {
    public static void main(String[] args){
        int count = 0;
        int input = 5;
        int loop;

        while (count < input) {
            switch (count){
                case 0:
                case 4:
                    loop = 0;
                    System.out.print("  ");
                    while (loop < (input-4)) {
                        System.out.print("*");
                        loop++;
                    }
                    break;
                case 1:
                case 3:
                    loop = 0;
                    System.out.print(" ");
                    while (loop < (input-2)){
                        System.out.print("*");
                        loop++;
                    }
                    break;
                case 2:
                    loop = 0;
                    while (loop < input){
                        System.out.print("*");
                        loop++;
                    }
                    break;
               }
            count++;
            System.out.print("\n");
        }
    }

}
