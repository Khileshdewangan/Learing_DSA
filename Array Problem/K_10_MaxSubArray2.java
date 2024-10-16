public class K_10_MaxSubArray2 {
    public static void SumArry(int num[]) {
        int currsum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[num.length];
        prefix[0] = num[0];

        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + num[i];
        }

        for (int i = 0; i < num.length; i++) {
            int start = i;
            for (int j = i; j < prefix.length; j++) {
                int end = j;
                currsum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                if (maxSum < currsum) {
                    maxSum = currsum;
                }
            }
        }
        System.out.println("max sum is : " + maxSum);
    }

    public static void kadanes(int num[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for (int i = 0; i < num.length; i++) {
            cs = cs + num[i];
            if (cs < 0) {
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("max sum is : " + ms);
    }

    public static void main(String arg[]) {

        // int num2[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        // kadanes(num2);
        int num2[] = { -1,-2,-3,-4 };
        kadanes(num2);
        // int num[]= {1,-2,6,-1,3};
        // SumArry(num);

    }
}
