package dk.kea;

/**
 * The type Cesar crypto.
 * Only works if text is A-Z or a-z
 * @author CeciNB
 */
public class CesarCrypto /*implements ICrypto*/{

    public CesarCrypto() {
    }

    /**
     * Instantiates a new Cesar crypto.
     *
     * @param shift how many places you wish to shift
     */

    public String encrypt(String text, int shift) {
        shift = (26 + shift) % 26;
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

    public String decrypt(String text, int shift) {
        shift = (26 - shift) % 26;
        return encrypt(text, shift);
    }

}
