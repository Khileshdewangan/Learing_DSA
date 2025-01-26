import java.util.ArrayList;

public class K_59_PairSum2 {
    public static boolean pairSum2(ArrayList<Integer> list, int target) {
        int breakingpoint = -1;
        int n= list.size();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > list.get(i + 1)) {
                breakingpoint = i;
                break;
            }
        }
        int leftp = breakingpoint + 1;
        int rightp = breakingpoint;

        while (leftp != rightp) {
            // case 1
            if (list.get(leftp) + list.get(rightp) == target) {
                return true;
            } else if (list.get(leftp) + list.get(rightp) < target) {
                leftp= (leftp+1)%n;
            }
            else{
                rightp = (n+rightp-1)%n;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        System.out.println(pairSum2(list, 16));
        System.out.println(pairSum2(list, 100));
    }
}
