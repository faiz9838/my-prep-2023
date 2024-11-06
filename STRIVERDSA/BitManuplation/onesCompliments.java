package STRIVERDSA.BitManuplation;

public class onesCompliments {
    public static void main(String[] args) {
        int num = 10;
        String binary = Integer.toBinaryString(num);

        String ones = "";
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1') {
                ones += '0';
            } else {
                ones += '1';
            }
        }
        System.out.println(ones);
    }
}
