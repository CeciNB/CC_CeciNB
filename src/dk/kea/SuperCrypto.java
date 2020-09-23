package dk.kea;

/**
 * The type Super crypto.
 * Only works if shift is between -32 to 6
 * @author CeciNB
 */
public class SuperCrypto implements ICrypto{
    private int shift;
    private int ascii;

    public SuperCrypto() {
    }

    /**
     * Instantiates a new Super crypto.
     *
     * @param shift the how many places you wish to shift
     * @param ascii out of ascii values you want to use.
     */
    public SuperCrypto(int shift, int ascii) {
        this.shift = shift;
        if (ascii < 0)
            ascii = ascii + 255;
        else if (ascii > 255)
            ascii = ascii - 255;
        this.ascii = ascii;
    }

    public String encrypt(String text) {
        StringBuilder result = new StringBuilder();
        char[] chars = text.toCharArray();
        for (char i : chars) {
            int val = (i + shift) % ascii;
            result.append((char)val);
        }
        return result.toString();
    }

    public String decrypt(String text) {
        shift = shift * -1;
        return encrypt(text);
    }

    public int getShift() {
        return shift;
    }

    public void setShift(int shift) {
        this.shift = shift;
    }
}
