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
    public String encrypt(String text);

    /**
     * Decrypt string.
     *
     * @param text the text thats encrypted
     * @return the string as de crypted
     */
    public String decrypt(String text);

    /**
     * Gets shift.
     *
     * @return the shift
     */
    public int getShift();

    /**
     * Sets shift.
     *
     * @param shift the shift
     */
    public void setShift(int shift);
}
