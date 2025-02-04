package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MoreCollections {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Type a number: ");
        int number = myScanner.nextInt();
        List<Integer> myArr = new ArrayList(Collections.nCopies(10, (Object)null));
        myArr.set(0, number);
        myArr.set(1, number);
        System.out.println(myArr.get(1));

        for(int i = 2; i < myArr.size(); ++i) {
            if (myArr.get(i) == null) {
                myArr.set(i, (Integer)myArr.get(i - 1) + (Integer)myArr.get(i - 2));
            }
        }

        System.out.println(myArr);
    }
}
