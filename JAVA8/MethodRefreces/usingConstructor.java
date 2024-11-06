package JAVA8.MethodRefreces;

import java.security.MessageDigest;

interface messageable {

    Message getMessage(String msg);
}

class Message {
    Message(String msg) {
        System.out.println(msg);
    }
}

public class usingConstructor {
    public static void main(String[] args) {
        messageable m1 = Message::new;

        m1.getMessage("Faiz Ahmad");
    }
}
