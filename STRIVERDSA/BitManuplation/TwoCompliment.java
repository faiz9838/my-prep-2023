package STRIVERDSA.BitManuplation;

public class TwoCompliment {
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
        int onesEx = Integer.parseInt(ones, 2);
        System.out.println(onesEx);
        System.out.println("Twos Compliment is: " + Integer.toBinaryString(onesEx + 1));
    }

}