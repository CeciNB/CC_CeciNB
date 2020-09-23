package dk.kea;

/**
 * The type Cesar crypto.
 * Only works if text is A-Z or a-z
 * @author CeciNB
 */
public class CesarCrypto implements ICrypto{

    private int shift;

    public CesarCrypto() {
    }

    /**
     * Instantiates a new Cesar crypto.
     *
     * @param shift how many places you wish to shift
     */
    public CesarCrypto(int shift) {
        this.shift = shift;
    }

    public String encrypt(String text) {
        shift = 26 + (shift % 26);
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

    public String decrypt(String text) {
        shift = 26 - (shift % 26);
        return encrypt(text);
    }

    public int getShift() {
        return shift;
    }

    public void setShift(int shift) {
        this.shift = shift;
    }

}
