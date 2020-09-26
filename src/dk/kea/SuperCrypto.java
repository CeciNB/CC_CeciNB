package dk.kea;

/**
 * The type Super crypto.
 * Only works if shift is between -32 to 6
 * @author CeciNB
 */
public class SuperCrypto implements ICrypto{
    private int ascii;

    public SuperCrypto() {
        ascii = 255;
    }

    public String encrypt(String text, int shift) {
        shift = ascii + shift % ascii;
        StringBuilder result = new StringBuilder();
        char[] chars = text.toCharArray();
        for (char i : chars) {
            int val = (i + shift) % ascii;
            result.append((char)val);
        }
        return result.toString();
    }

    public String decrypt(String text, int shift) {
        shift = shift * -1;
        return encrypt(text, shift);
    }
}
