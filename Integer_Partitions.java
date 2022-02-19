import java.util.HashSet;

public class Integer_Partitions {
 
    private int partitions;
    private int numOdd;
    private int numDistinct;

    public Integer_Partitions() {
    }

    public void printArray(int p[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(p[i] + " ");
        }
        System.out.println();
    }

    // code borrowed and modified from geeks4geeks b/c im too lazy to learn dynamic programming ehehe T_T
    public void printAllUniqueParts(int n) {
        int[] p = new int[n];
        int k = 0;
        p[k] = n;
        
        while (true) {
            
            /* TOGGLE if you want to PRINT young tableaux */
            //printArray(p, k+1);
            
            /* TOGGLE if you want to see num of partitions with only ODD parts */
            boolean odd = true;
            for (int i = 0; i < p.length; i++) {
                if (p[i] % 2 == 0 && p[i] != 0) {
                    odd = false;
                    break;
                }
            }
            if (odd) {
                numOdd++;
            }

            /* TODO: TOGGLE if you want to see DISTINCT partitions */
            /* boolean distinct = true;
            HashSet<Integer> hset = new HashSet<>();
            for (int i = 0; i < p.length; i++) {
                if (p[i] != 0) {
                    if (hset.contains(p[i])) {
                        distinct = false;
                        break;
                    } else {
                        hset.add(p[i]);
                    }
                }
            }
            if (distinct) {
                numDistinct++;
            } */

            /* TOGGLE if you want NUM partitions */
            partitions++; 

            /* Dynamic programming stuff and things below */
            int rem_val = 0;
            while(k >= 0 && p[k] == 1) {
            rem_val += p[k];
                k--;
            }
            if (k < 0) {
                return;
            }

            // Decrease the p[k] found above and adjust the rem_val
		    p[k]--;
		    rem_val++;

		    // If rem_val is more, then the sorted order is violated. Divide
		    // rem_val in different values of size p[k] and copy these values at
		    // different positions after p[k]
		    while (rem_val > p[k]) {
			    p[k+1] = p[k];
			    rem_val = rem_val - p[k];
				    k++;
	    	}

		    // Copy rem_val to next position and increment position
		    p[k+1] = rem_val;
		    k++;
        }
    }

    public void numPartitions() {
        System.out.println("num: " + partitions);
        partitions = 0;
    }

    public void oddPartitions() {
        System.out.println("odd: " + numOdd);
        numOdd = 0;
    }

    public void distinctPartitions() {
        System.out.println("distinct: " + numDistinct);
        numDistinct = 0;
    }
}
	