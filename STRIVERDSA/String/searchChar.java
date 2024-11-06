package STRIVERDSA.String;

public class searchChar {
    public static void main(String[] args) {
        String str = "Faiz Ahmad";
        char x = 'a';
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == x)
                System.out.println(i);

        }

    }
}
