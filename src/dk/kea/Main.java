package dk.kea;

public class Main {

    public static void main(String[] args) {
        Crypto crypto = new Crypto(90);
        String original = "ABC abc Numse prut 990 æøå ÆØÅ";

        System.out.println("Original text: " + original);
        String encrypted = crypto.encrypt(original);
        System.out.println("Encrypted text: " + encrypted);
        String decrypted = crypto.decrypt(encrypted);
        System.out.println("Decrypted text: " + decrypted);
    }
}
