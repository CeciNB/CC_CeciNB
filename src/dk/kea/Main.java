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
        //cesarCrypto();
        //System.out.println(" ");
        //superCrypto();
        String aliceOriginal = FileHandler.readFile("resources/AliceInWonderland.txt");
        aliceSuperCrypto(aliceOriginal);
        //aliceCesarCrypto(aliceOriginal);

    }

    public static void aliceSuperCrypto(String aliceOriginal){
        SuperCrypto superCrypto = new SuperCrypto();
        String superEncrypted = superCrypto.encrypt(aliceOriginal,40);
        System.out.println("Encrypted text: " + superEncrypted);
        String superDecrypted = superCrypto.decrypt(superEncrypted,40);
        System.out.println("Decrypted text: " + superDecrypted);
    }
    public static void aliceCesarCrypto(String aliceOriginal){
        CesarCrypto cesarCrypto = new CesarCrypto();
        String encrypt = cesarCrypto.encrypt(aliceOriginal,40);
        System.out.println("Encrypted text: " + encrypt);
        String decrypt = cesarCrypto.decrypt(encrypt,40);
        System.out.println("Decrypted text: " + decrypt);
    }

    public static void cesarCrypto(){
        System.out.println("Cesars Crypt - Only works if text is A-Z or a-z");
        CesarCrypto cesarCrypto = new CesarCrypto();
        String original = "ALICE'S ADVENTURES IN WONDERLAND";
        System.out.println("Original text: " + original);
        String encrypted = cesarCrypto.encrypt(original, 1);
        System.out.println("Encrypted text: " + encrypted);
        String decrypted = cesarCrypto.decrypt(encrypted, 1);
        System.out.println("Decrypted text: " + decrypted);
    }

    public static void superCrypto(){
        System.out.println("Super Crypt - Only works if shift is between -32 to 6");
        SuperCrypto superCrypto = new SuperCrypto();
        String superOriginal = ".,- ABC abc Numse prut 990 æøå ÆØÅ";
        System.out.println("Original text: " + superOriginal);
        String superEncrypted = superCrypto.encrypt(superOriginal,40);
        System.out.println("Encrypted text: " + superEncrypted);
        String superDecrypted = superCrypto.decrypt(superEncrypted,40);
        System.out.println("Decrypted text: " + superDecrypted);
    }
}