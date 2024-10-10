package ru.roman.yuzyuk.java.basic.homeworks.lesson29;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    public void testItemsAfterLastOne_NormalCase() {
        int[] input = {2, 3, 1, 4, 5, 6};
        int[] expected = {4, 5, 6};
        assertArrayEquals(expected, Main.getItemsAfterLastOne(input));
    }

    @Test
    public void testItemsAfterLastOne_HasNotOne() {
        int[] input = {2, 3, 4, 5, 6};
        Exception exception = assertThrows(RuntimeException.class, () -> {
            Main.getItemsAfterLastOne(input);
        });
        assertEquals("input - должен содержать еденицу", exception.getMessage());
    }

    @Test
    public void testItemsAfterLastOne_EmptyArray() {
        int[] input = {};
        Exception exception = assertThrows(RuntimeException.class, () -> {
            Main.getItemsAfterLastOne(input);
        });
        assertEquals("input - должен содержать еденицу", exception.getMessage());
    }

    @Test
    void testCheckHasOnlyOneAndTwo_NormalCase() {
        int[] input = {1, 2, 1, 2};
        assertTrue(Main.checkHasOnlyOneAndTwo(input));
    }

    @Test
    void testCheckHasOnlyOneAndTwo_HasNotTwo() {
        int[] input = {1, 1};
        assertFalse(Main.checkHasOnlyOneAndTwo(input));
    }

    @Test
    void testCheckHasOnlyOneAndTwo_HasNotOne() {
        int[] input = {2, 2};
        assertFalse(Main.checkHasOnlyOneAndTwo(input));
    }

    @Test
    void testCheckHasOnlyOneAndTwo_HasMoreThenTwo() {
        int[] input = {1, 2, 3};
        assertFalse(Main.checkHasOnlyOneAndTwo(input));
    }

    @Test
    void testCheckHasOnlyOneAndTwo_HasLessThenOne() {
        int[] input = {1, 2, -3};
        assertFalse(Main.checkHasOnlyOneAndTwo(input));
    }

    @Test
    void testCheckHasOnlyOneAndTwo_EmptyArray() {
        int[] input = {};
        assertFalse(Main.checkHasOnlyOneAndTwo(input));
    }
}