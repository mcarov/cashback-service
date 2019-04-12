package ru.itpark.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackServiceTest {

    @Test
    @DisplayName("Should calculate cashback")
    void calculateChashback() {
        var service = new CashbackService();
        var result = service.calculateChashback(100);

        assertEquals(5, result);
    }

    @Test
    @DisplayName("Should apply max limit to cashback")
    void calculateChashbackWithMaxLimit() {
        var service = new CashbackService();
        var result = service.calculateChashback(1_000_000);

        assertEquals(3000, result);
    }
}