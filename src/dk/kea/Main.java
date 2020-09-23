package dk.kea;

/**
 * @author CeciNB
 *
 */
public class Main {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        System.out.println("Cesars Crypt - Only works if text is A-Z or a-z");
        CesarCrypto cesarCrypto = new CesarCrypto(90);
        String original = "ABC abc Numse prut";
        System.out.println("Original text: " + original);
        String encrypted = cesarCrypto.encrypt(original);
        System.out.println("Encrypted text: " + encrypted);
        String decrypted = cesarCrypto.decrypt(encrypted);
        System.out.println("Decrypted text: " + decrypted);

        System.out.println(" ");
        System.out.println("Super Crypt - Only works if shift is between -32 to 6");
        SuperCrypto superCrypto = new SuperCrypto(2,255);
        String superOriginal = ".,- ABC abc Numse prut 990 æøå ÆØÅ";
        System.out.println("Original text: " + superOriginal);
        String superEncrypted = superCrypto.encrypt(superOriginal);
        System.out.println("Encrypted text: " + superEncrypted);
        String superDecrypted = superCrypto.decrypt(superEncrypted);
        System.out.println("Decrypted text: " + superDecrypted);

    }
}