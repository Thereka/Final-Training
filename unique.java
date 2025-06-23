public class Main {
    public static void main(String[] args) {
        int start = 10;
        int end = 15;
        int Count = 0;

        for (int i = start; i <= end; i++) {
            String num = "" + i;
            char a = num.charAt(0);
            char b = num.charAt(1);

            if (a != b) {
                Count++; 
            }
        }

        System.out.println("Output: " + Count);
    }
}
