public class K_39_TillingProblemsolve {
    public static int tillingProblem(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        int forVertical = tillingProblem(n - 1);
        int forHorizontal = tillingProblem(n - 2);

        int totalOfWay = forVertical + forHorizontal;

        return totalOfWay;

        //single line code
        // return tillingProblem(n - 1) + tillingProblem(n - 2);

    }

    public static void main(String arg[]) {
        System.out.print(tillingProblem(4));
    }

}
