package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MoreCollections2 {

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
        List<Integer> arr = new ArrayList();
        arr.add(0, number1);
        arr.add(1, number2);
        arr.add(2, number3);
        arr.add(3, number4);
        arr.add(4, number5);
        System.out.println(arr);

        for(int i = 0; i < arr.size() / 2; ++i) {
            if (!((Integer)arr.get(i)).equals(arr.get(arr.size() - 1 - i))) {
                return;
            }
        }

        System.out.println("The array is mirror");
    }
}
