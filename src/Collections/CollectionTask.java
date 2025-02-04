package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionTask {

    public static void main(String[] args) {
        List<Double> coll = new ArrayList(Collections.nCopies(4, (Object)null));

        for(int i = 0; i < coll.size(); ++i) {
            if (coll.get(i) == null) {
                coll.set(i, (double)(i * 3));
            }
        }

        System.out.println(coll);
    }
}
