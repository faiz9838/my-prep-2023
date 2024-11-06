package STRIVERDSA.BitManuplation;

public class setIthBit {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        int num = 13;
        int k = 2;

        System.out.println(num ^ (1 << k));

    }
}
