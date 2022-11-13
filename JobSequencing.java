import java.util.*;

public class JobSequencing {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String[] slot = new String[3];
        String[] job = { "j1", "j2", "j3", "j4", "j5" };
        int[] profit = { 20, 15, 10, 5, 1 };
        int[] deadline = { 2, 2, 1, 3, 3 };
        int counter = 0;

        for (int i = 0; i < 5; i++) {
            int j = deadline[i] - 1;
            while (j >= 0) {
                if (slot[j] == null) {
                    slot[j] = job[i];
                    counter++;
                    break;
                } else
                    j--;
            }
            if (counter == 3)
                break;
        }
        for (int k = 0; k < 3; k++) {
            System.out.print(slot[k] + " ");
        }

    }
}
