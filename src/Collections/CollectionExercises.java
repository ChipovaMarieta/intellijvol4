package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CollectionExercises {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Insert 1st number:");
        int number1 = scanner.nextInt();
        System.out.println(" Insert 2nd number:");
        int number2 = scanner.nextInt();
        System.out.println(" Insert 3rd number:");
        int number3 = scanner.nextInt();
        System.out.println(" Insert 4th number:");
        int number4 = scanner.nextInt();
        System.out.println(" Insert 5th number:");
        int number5 = scanner.nextInt();
        List<Integer> numbersArr = new ArrayList(Arrays.asList(number1, number2, number3, number4, number5));
        Integer minnumber = null;

        for(int i = 0; i < numbersArr.size(); ++i) {
            if ((Integer)numbersArr.get(i) % 3 == 0 && (minnumber == null || (Integer)numbersArr.get(i) < minnumber)) {
                minnumber = (Integer)numbersArr.get(i);
            }
        }

        if (minnumber != null) {
            System.out.println("Number wanted:" + minnumber);
        } else {
            System.out.println("There are no numbers.");
        }

    }

}
