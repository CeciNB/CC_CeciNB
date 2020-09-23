package dk.kea;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The type Cesar crypto test.
 * @author CeciNB
 */
class CesarCryptoTest {

    ICrypto cesarCrypto;
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
        cesarCrypto.setShift(3);
        String expected = "DEF def 123";
        String actual = cesarCrypto.encrypt(test);
        assertEquals(expected,actual);
    }

    /**
     * Three to the left.
     */
    @Test
    void threeToTheLeft(){
        cesarCrypto.setShift(-3);
        String expected = "XYZ xyz 123";
        String actual = cesarCrypto.encrypt(test);
        assertEquals(expected,actual);
    }

    /**
     * Twenty six to the right.
     */
    @Test
    void twentySixToTheRight(){
        cesarCrypto.setShift(26);
        String expected = "ABC abc 123";
        String actual = cesarCrypto.encrypt(test);
        assertEquals(expected,actual);
    }

    /**
     * Twenty six to the left.
     */
    @Test
    void twentySixToTheLeft(){
        cesarCrypto.setShift(-26);
        String expected = "ABC abc 123";
        String actual = cesarCrypto.encrypt(test);
        assertEquals(expected,actual);
    }

    /**
     * Encrypt decrypt four left.
     */
    @Test
    void encryptDecryptFourLeft(){
        cesarCrypto.setShift(-4);
        String expected = "ABC abc 123";
        String crypted = cesarCrypto.encrypt(test);
        String actual = cesarCrypto.decrypt(crypted);
        assertEquals(expected,actual);
    }

    /**
     * Encrypt decrypt seven right.
     */
    @Test
    void encryptDecryptSevenRight(){
        cesarCrypto.setShift(7);
        String expected = "ABC abc 123";
        String crypted = cesarCrypto.encrypt(test);
        String actual = cesarCrypto.decrypt(crypted);
        assertEquals(expected,actual);
    }

    /**
     * Encrypt decrypt out of range.
     */
    @Test
    void encryptDecryptOutOfRange(){
        cesarCrypto.setShift(70);
        String expected = "ABC abc 123";
        String crypted = cesarCrypto.encrypt(test);
        String actual = cesarCrypto.decrypt(crypted);
        assertEquals(expected,actual);
    }

    /**
     * Encrypt empty.
     */
    @Test
    void encryptEmpty(){
        cesarCrypto.setShift(70);
        String expected = "";
        String crypted = cesarCrypto.encrypt("");
        String actual = cesarCrypto.decrypt(crypted);
        assertEquals(expected,actual);
    }

    /**
     * Get shift 3.
     */
    @Test
    void getShift3(){
        int expected = 3;
        cesarCrypto.setShift(expected);
        int actual = cesarCrypto.getShift();
        assertEquals(expected,actual);
    }

    /**
     * Get shift 90.
     */
    @Test
    void getShift90(){
        int expected = 90;
        cesarCrypto.setShift(expected);
        int actual = cesarCrypto.getShift();
        assertEquals(expected,actual);
    }

    /**
     * Get shiftminus.
     */
    @Test
    void getShiftminus(){
        int expected = -16;
        cesarCrypto.setShift(expected);
        int actual = cesarCrypto.getShift();
        assertEquals(expected,actual);
    }


                //a   b   c   d   e   f   g   h   i   j   k   l   m   n   o   p   q   r   s   t   u   v   w   x   y   z
    //a   b   c   d   e   f   g   h   i   j   k   l   m   n   o   p   q   r   s   t   u   v   w   x   y   z

}