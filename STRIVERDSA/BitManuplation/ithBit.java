package STRIVERDSA.BitManuplation;

public class ithBit {
    public static void main(String[] args) {
        int num = 15;
        int k = 2;

        boolean isAns = true;
        // String strBinary = Integer.toBinaryString(num);
        // int len = strBinary.length() - 1;
        // for (int i = len; i >= 0; i--) {
        // if (strBinary.charAt(k) == '1') {
        // isAns = true;
        // } else {
        // isAns = false;
        // }
        // }
        // System.out.println(isAns);

        if ((num & (1 << k)) != 0) {
            isAns = true;
        } else {
            isAns = false;
        }
        System.out.println(isAns);
    }
}
