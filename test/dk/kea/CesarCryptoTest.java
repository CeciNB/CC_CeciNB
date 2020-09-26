package dk.kea;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The type Cesar crypto test.
 * @author CeciNB
 */
class CesarCryptoTest {

    CesarCrypto cesarCrypto;
    String test;

    /**
     * Sets up.
     * Makes new Crypto object berfore each test
     */
    @BeforeEach
    void setUp() {
        cesarCrypto = new CesarCrypto();
        test = "ABC abc 123";
    }

    /**
     * Three to the right.
     */
    @Test
    void threeToTheRight(){
        String expected = "DEF def 123";
        String actual = cesarCrypto.encrypt(test,3);
        assertEquals(expected,actual);
    }

    /**
     * Three to the left.
     */
    @Test
    void threeToTheLeft(){
        String expected = "XYZ xyz 123";
        String actual = cesarCrypto.encrypt(test,-3);
        assertEquals(expected,actual);
    }

    /**
     * Twenty six to the right.
     */
    @Test
    void twentySixToTheRight(){
        String expected = "ABC abc 123";
        String actual = cesarCrypto.encrypt(test,26);
        assertEquals(expected,actual);
    }

    /**
     * Twenty six to the left.
     */
    @Test
    void twentySixToTheLeft(){
        String expected = "ABC abc 123";
        String actual = cesarCrypto.encrypt(test,-26);
        assertEquals(expected,actual);
    }

    /**
     * Encrypt decrypt four left.
     */
    @Test
    void encryptDecryptFourLeft(){
        String expected = "ABC abc 123";
        String crypted = cesarCrypto.encrypt(test, -4);
        String actual = cesarCrypto.decrypt(crypted, -4);
        assertEquals(expected,actual);
    }

    /**
     * Encrypt decrypt seven right.
     */
    @Test
    void encryptDecryptSevenRight(){
        String expected = "ABC abc 123";
        String crypted = cesarCrypto.encrypt(test,7);
        String actual = cesarCrypto.decrypt(crypted,7);
        assertEquals(expected,actual);
    }

    /**
     * Encrypt decrypt out of range.
     */
    @Test
    void encryptDecryptOutOfRange(){
        String expected = "ABC abc 123";
        String crypted = cesarCrypto.encrypt(test,70);
        String actual = cesarCrypto.decrypt(crypted,70);
        assertEquals(expected,actual);
    }

    /**
     * Encrypt empty.
     */
    @Test
    void encryptEmpty(){
        String expected = "";
        String crypted = cesarCrypto.encrypt("", 70);
        String actual = cesarCrypto.decrypt(crypted, 70);
        assertEquals(expected,actual);
    }


                //a   b   c   d   e   f   g   h   i   j   k   l   m   n   o   p   q   r   s   t   u   v   w   x   y   z
    //a   b   c   d   e   f   g   h   i   j   k   l   m   n   o   p   q   r   s   t   u   v   w   x   y   z

}