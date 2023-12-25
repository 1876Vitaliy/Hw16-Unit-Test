package org.example.app.service;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    private BonusService service;

    @BeforeEach
    void setUp() { service = new BonusService(); }

    @Test
    @DisplayName("Test of expected result.")
    void test_Expected_Result() {
        assertEquals(50, service.calcBonus(500));
    }

    @Test
    @DisplayName("Test of unexpected result.")
    void test_Of_Unexpected_Result() {
        assertNotEquals(410, service.calcBonus( 500));
    }

    @AfterEach
    void tearDown() { service = null;
    }
}