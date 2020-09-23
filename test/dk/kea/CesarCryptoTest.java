package dk.kea;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CesarCryptoTest {

    CesarCrypto cesarCrypto;
    String test;

    @BeforeEach
    void setUp() {
        cesarCrypto = new CesarCrypto();
        test = "ABC abc 123";
    }

    @Test
    void threeToTheRight(){
        cesarCrypto.setShift(3);
        String expected = "DEF def 123";
        String actual = cesarCrypto.encrypt(test);
        assertEquals(expected,actual);
    }
    @Test
    void threeToTheLeft(){
        cesarCrypto.setShift(-3);
        String expected = "XYZ xyz 123";
        String actual = cesarCrypto.encrypt(test);
        assertEquals(expected,actual);
    }
    @Test
    void twentySixToTheRight(){
        cesarCrypto.setShift(26);
        String expected = "ABC abc 123";
        String actual = cesarCrypto.encrypt(test);
        assertEquals(expected,actual);
    }
    @Test
    void twentySixToTheLeft(){
        cesarCrypto.setShift(-26);
        String expected = "ABC abc 123";
        String actual = cesarCrypto.encrypt(test);
        assertEquals(expected,actual);
    }
    @Test
    void encryptDecryptFourLeft(){
        cesarCrypto.setShift(-4);
        String expected = "ABC abc 123";
        String crypted = cesarCrypto.encrypt(test);
        String actual = cesarCrypto.decrypt(crypted);
        assertEquals(expected,actual);
    }

    @Test
    void encryptDecryptSevenRight(){
        cesarCrypto.setShift(7);
        String expected = "ABC abc 123";
        String crypted = cesarCrypto.encrypt(test);
        String actual = cesarCrypto.decrypt(crypted);
        assertEquals(expected,actual);
    }

    @Test
    void encryptDecryptOutOfRange(){
        cesarCrypto.setShift(70);
        String expected = "ABC abc 123";
        String crypted = cesarCrypto.encrypt(test);
        String actual = cesarCrypto.decrypt(crypted);
        assertEquals(expected,actual);
    }

    @Test
    void encryptEmpty(){
        cesarCrypto.setShift(70);
        String expected = "";
        String crypted = cesarCrypto.encrypt("");
        String actual = cesarCrypto.decrypt(crypted);
        assertEquals(expected,actual);
    }

    @Test
    void getShift3(){
        int expected = 3;
        cesarCrypto.setShift(expected);
        int actual = cesarCrypto.getShift();
        assertEquals(expected,actual);
    }

    @Test
    void getShift90(){
        int expected = 90;
        cesarCrypto.setShift(expected);
        int actual = cesarCrypto.getShift();
        assertEquals(expected,actual);
    }

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