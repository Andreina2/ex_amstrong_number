package dev.andreina.ex_amstrong_number;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class armstrongNumberTest {
    @Test
    void testIsArmstrongNumber371() {
        assertTrue(armstrongNumber.isArmstrongNumber(371), "El número es armstrong");
    }

    @Test
    void testIsArmstrongNumber1634() {
        assertTrue(armstrongNumber.isArmstrongNumber(1634), "El número es armstrong");
    }

    @Test
    void testIsArmstrongNumber351() {
        assertFalse(armstrongNumber.isArmstrongNumber(351), "No es un número armstrong");
    }

    @Test
    void testIsArmstrongNumber2015() {
        assertFalse(armstrongNumber.isArmstrongNumber(205), "No es un número armstrong");
    }


}
