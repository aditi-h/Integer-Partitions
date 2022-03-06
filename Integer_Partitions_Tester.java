public class Integer_Partitions_Tester {
    public static void main(String[] args) {
        Integer_Partitions n = new Integer_Partitions();
        int[] primeNums = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 87, 93, 97};
        //for (int i = 1; i < 10000000; i++) {
        for (int i = 0; i < primeNums.length; i++) {
            n.printAllUniqueParts(primeNums[i]);
            System.out.println(primeNums[i]); 
            n.numPartitions();
            //n.oddPartitions(); // Theorem 3
            //n.distinctPartitions(); //TODO
            System.out.println();
        }
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}