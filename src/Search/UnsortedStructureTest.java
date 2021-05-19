package Search;

public class UnsortedStructureTest {

    public static void main(String[] args) {
        sumOfPairs();
    }

    public static void sumOfPairs(){
        UnsortedStructure u = new UnsortedStructure();
        int[] ar = {-18,-1,0,1, 2, 3, 2, 3, 4, 5, 6, 7, 8, 9, 4, 5,4, 7, 12, 10, 30, 50};
        int sum = 12;
        u.sumOfPairs(ar,sum);
    }

}
