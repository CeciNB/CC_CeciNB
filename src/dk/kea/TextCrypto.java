package dk.kea;

//Needs to encrypt a file

import java.util.HashMap;
import java.util.Random;

public class TextCrypto{

    public String encrypt(String text) {
        Random random = new Random(26);
        StringBuilder result = new StringBuilder();
        for (char i : text.toCharArray()) {
            if (Character.isLetter(i)) {
                if (Character.isUpperCase(i)) {
                    result.append((char) ('A' + (i - 'A' + shift) % 26 ));
                } else {
                    result.append((char) ('a' + (i - 'a' + shift) % 26 ));
                }
            } else {
                result.append(i);
            }
        }
        return result.toString();
    }

    public HashMap<Integer,String> quessShift(){
        result =
    }

    public String decrypt(String text, int shift) {
        return null;
    }

}
