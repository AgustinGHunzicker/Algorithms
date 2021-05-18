package Search;

public class SortedArray {

    public SortedArray() {}

    // receive a sorted array of integers and a number n,
    // return true if it's possible to sum two integers equal to n
    // return false in the other case
    // can be repeated values
    // sum of numbers that the are in different positions
    // O(n)
    // reduce the array always in a smaller interval, beginning with the extremes of the array
    public boolean sumOfPairs(int[] args, int sum) {

        int a = 0;
        int b = args.length - 1;
        int c;

        while (b > a) {
            c = args[a] + args[b];
            if (c == sum)
                return true;
            if (c > sum) b --;
            else a++;
        }
        //No sum of pairs where N1 + N2 = N3
        return false;
    }
}

