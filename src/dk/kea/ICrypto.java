package dk.kea;

public interface ICrypto {

    public String encrypt(String text);

    public String decrypt(String text);

    public int getShift();

    public void setShift(int shift);
}
