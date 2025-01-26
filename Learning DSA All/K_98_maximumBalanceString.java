public class K_98_maximumBalanceString {
    public static int maxBalanceString(String str) {
        int n = str.length();
        int Lcount = 0;
        int Rcount = 0;
        int ans = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'L') {
                Lcount++;
            } else {
                Rcount++;
            }

            if (Lcount == Rcount) {
                ans++;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        String str = "LRRRRLLRLLRL";
        System.out.println("maximum Balance String is = "+maxBalanceString(str));
    }
}
