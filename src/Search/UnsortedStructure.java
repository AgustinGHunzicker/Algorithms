package Search;

import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

public class UnsortedStructure {

    public UnsortedStructure() {}

    public void sumOfPairs(int @NotNull [] args, int sum) {

        Map<Integer, Integer> rest = new HashMap<>();

        if (sum % 2 > 0) { // n
            for (int j : args) {
                rest.put(j, sum - j);
            }
        }
        else { // 2n
            // if the sum is pair, but in the array we should find at least 2 time its half
            // In the case we have only one time the half of the sum, half + half is not possible and we remove it
            int half = 0;
            for (int j : args) {
                rest.put(j, sum - j);
                if (j == sum / 2) half++;
            }
            if (half < 2) rest.remove(sum / 2);
        }

        // n
        for (int arg : args) {
            if (rest.get(rest.get(arg)) != null) {
                System.out.println("{" + arg + ", " + rest.get(arg) + "}");
                rest.remove(rest.get(arg));
                rest.remove(arg);
            }
        }

    }
}
