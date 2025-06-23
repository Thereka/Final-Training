import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String s1 = "rrmm";
        String s2 = "mrmr";

        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        if (Arrays.equals(a, b)) {
            System.out.println("Output: 0"); // strings can be rearranged to match
        } else {
            System.out.println("Output: Not Matchable");
        }
    }
}
