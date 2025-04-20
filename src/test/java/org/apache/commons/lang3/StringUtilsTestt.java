package org.apache.commons.lang3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTestt {
    @Test
    public void testIsBlank() {
        assertTrue(StringUtils.isBlank(null)); // 应为 true
        assertTrue(StringUtils.isBlank("")); // 应为 true
        assertTrue(StringUtils.isBlank(" ")); // 应为 true
        assertFalse(StringUtils.isBlank("abc")); // 应为 false
    }

    @Test
    public void testIsEmpty() {
        assertTrue(StringUtils.isEmpty(null)); // 应为 true
        assertTrue(StringUtils.isEmpty("")); // 应为 true
        assertFalse(StringUtils.isEmpty("abc")); // 应为 false
    }

    @Test
    public void testEquals() {
        assertTrue(StringUtils.equals(null, null)); // 应为 true
        assertTrue(StringUtils.equals("abc", "abc")); // 应为 true
        assertFalse(StringUtils.equals("abc", "def")); // 应为 false
    }
}