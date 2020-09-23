package dk.kea;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CryptoTest {

    Crypto crypto;
    String test;

    @BeforeEach
    void setUp() {
        crypto = new Crypto();
        test = "ABC abc 123";
    }

    @Test
    void threeToTheRight(){
        crypto.setShift(3);
        String expected = "DEF def 123";
        String actual = crypto.encrypt(test);
        assertEquals(expected,actual);
    }
    @Test
    void threeToTheLeft(){
        crypto.setShift(-3);
        String expected = "XYZ xyz 123";
        String actual = crypto.encrypt(test);
        assertEquals(expected,actual);
    }
    @Test
    void twentySixToTheRight(){
        crypto.setShift(26);
        String expected = "ABC abc 123";
        String actual = crypto.encrypt(test);
        assertEquals(expected,actual);
    }
    @Test
    void twentySixToTheLeft(){
        crypto.setShift(-26);
        String expected = "ABC abc 123";
        String actual = crypto.encrypt(test);
        assertEquals(expected,actual);
    }
    @Test
    void encryptDecryptFourLeft(){
        crypto.setShift(-4);
        String expected = "ABC abc 123";
        String crypted = crypto.encrypt(test);
        String actual = crypto.decrypt(crypted);
        assertEquals(expected,actual);
    }

    @Test
    void encryptDecryptSevenRight(){
        crypto.setShift(7);
        String expected = "ABC abc 123";
        String crypted = crypto.encrypt(test);
        String actual = crypto.decrypt(crypted);
        assertEquals(expected,actual);
    }

    @Test
    void encryptDecryptOutOfRange(){
        crypto.setShift(70);
        String expected = "ABC abc 123";
        String crypted = crypto.encrypt(test);
        String actual = crypto.decrypt(crypted);
        assertEquals(expected,actual);
    }

    @Test
    void encryptEmpty(){
        crypto.setShift(70);
        String expected = "";
        String crypted = crypto.encrypt("");
        String actual = crypto.decrypt(crypted);
        assertEquals(expected,actual);
    }

    @Test
    void getShift3(){
        int expected = 3;
        crypto.setShift(expected);
        int actual = crypto.getShift();
        assertEquals(expected,actual);
    }

    @Test
    void getShift90(){
        int expected = 90;
        crypto.setShift(expected);
        int actual = crypto.getShift();
        assertEquals(expected,actual);
    }

    @Test
    void getShiftminus(){
        int expected = -16;
        crypto.setShift(expected);
        int actual = crypto.getShift();
        assertEquals(expected,actual);
    }


                //a   b   c   d   e   f   g   h   i   j   k   l   m   n   o   p   q   r   s   t   u   v   w   x   y   z
    //a   b   c   d   e   f   g   h   i   j   k   l   m   n   o   p   q   r   s   t   u   v   w   x   y   z

}