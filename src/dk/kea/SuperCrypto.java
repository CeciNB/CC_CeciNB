package dk.kea;

public class SuperCrypto implements ICrypto{
    private int shift;
    private int ascii;

    public SuperCrypto() {
    }
    public SuperCrypto(int shift, int ascii) {
        this.shift = shift;
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
