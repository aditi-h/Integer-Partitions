public class Integer_Partitions_Tester {
    public static void main(String[] args) {
        Integer_Partitions n = new Integer_Partitions();
        for (int i = 1; i < 20; i++) {
            n.printAllUniqueParts(i);
            System.out.println(i); 
            n.numPartitions();
            n.oddPartitions(); // Theorem 3
            //n.distinctPartitions(); //TODO
            System.out.println();
        }
    }
}