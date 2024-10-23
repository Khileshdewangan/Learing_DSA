public class K_41_FriendPairProblem {
    public static int friendsPair(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        // single
        int fnm1 = friendsPair(n - 1);

        // pair
        int fnm2 = (n - 1) * friendsPair(n - 2);
        int total = fnm1 + fnm2;
         return total;


        // return friendsPair(n - 1) + friendsPair(n - 2) * friendsPair(n - 1);
    }

    public static void main(String arg[]) {
        System.out.print(friendsPair(5));
    }

}
