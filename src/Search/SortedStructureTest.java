package Search;

public class SortedStructureTest {

    public static void main(String[] args) {
        sumOfPairs();
    }

    private static void sumOfPairs() {
        int[] args = {1, 2, 3, 4, 4};
        int n = 8;
        SortedStructure s = new SortedStructure();
        if (s.sumOfPairs(args, n)) System.out.println("Exist sum of pairs");
        else System.out.println("Not exist sum of pairs");
    }
}