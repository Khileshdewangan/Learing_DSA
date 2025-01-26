public class K_29_BitManipulation {
    // Question-1
    public static int getbit(int n, int i) {
        int bitmask = 1 << i;
        if ((n & bitmask) == 0) {
            return 0;
        }
        return 1;
    }

    // Question-2
    public static int setbit(int n, int i) {
        int bitmask = 1 << i;

        return n | bitmask;
    }

    // Question-3
    public static int clearbit(int n, int i) {
        int bitmask = ~(1 << i);
        return n & bitmask;
    }

    // Question-4
    public static int updatebit(int n, int i, int newbit) {
        // if(newbit==0){
        // return clearbit(n,i);
        // }
        // else{
        // return setbit(n,i);
        // }

        // another option
        n = clearbit(n, i);
        int bitmast = newbit << i;
        return n | bitmast;
    }

    // Question-5
    public static int clearLastBit(int n, int i) {
        int bitmask = (~0) << i;
        return n & bitmask;
    }

    // Question-6
    public static int clearRangeI(int n, int i, int j) {
        int a = (~0) << (j + 1);
        int b = (1 << i) - 1;
        int bitmask = a | b;
        return n & bitmask;
    }
    
    
    // Question-7
    public static boolean isPower(int n) {
        return (n & (n - 1)) == 0;
    }
    
    
    // Question-8
    public static int countSetBit(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) != 0) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }


    // Question-9
    public static int fastExpo(int a, int n) {
        int ans = 1;
        while (n > 0) {
            if ((n & 1) != 0) {
                ans = ans * a;
            }
            a = a * a;
            n = n >> 1;
        }
        return ans;
    }

    public static void main(String arg[]){
        // System.out.println(fastExpo(3,5));
   

        // System.out.println(5 & 6);
        // System.out.println(5 | 6);
        // System.out.println(5 ^ 6);
        // System.out.println(5 ^ 6);
        // System.out.println(~0);
        // System.out.println(~5);
        // System.out.println(5<<2);

        // System.out.println(setbit(10,4));
        // System.out.println(getbit(26,4));
        // System.out.println(clearbit(14,1));
        System.out.println(updatebit(10,2,1));
        System.out.println(updatebit(10,1,0));
        // System.out.println(clearLastBit(15,2));
        // System.out.println(clearRangeI(10,2,4));
        // System.out.println(isPower(4));
        // System.out.println(countSetBit(55));
        // System.out.println(fastExpo(3,5));

        // System.out.println(10|(1<<2));

    }

}
