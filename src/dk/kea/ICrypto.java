package dk.kea;

/**
 * The interface Crypto.
 * @author CeciNB
 */
public interface ICrypto {

    /**
     * Encrypt string.
     *
     * @param text the text you want to encrypt
     * @return the string as encrypted
     */
    String encrypt(String text, int shift);

    /**
     * Decrypt string.
     *
     * @param text the text thats encrypted
     * @return the string as de crypted
     */
    String decrypt(String text, int shift);
}
