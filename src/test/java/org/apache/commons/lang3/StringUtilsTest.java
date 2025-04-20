package org.apache.commons.lang3;

public class StringUtilsTest {
    public static void main(String[] args) {
        // 测试 isBlank 方法
        System.out.println("Testing isBlank:");
        System.out.println("isBlank(null): " + StringUtils.isBlank(null)); // 应为 true
        System.out.println("isBlank(\"\"): " + StringUtils.isBlank("")); // 应为 true
        System.out.println("isBlank(\" \"): " + StringUtils.isBlank(" ")); // 应为 true
        System.out.println("isBlank(\"abc\"): " + StringUtils.isBlank("abc")); // 应为 false

        // 测试 isEmpty 方法
        System.out.println("\nTesting isEmpty:");
        System.out.println("isEmpty(null): " + StringUtils.isEmpty(null)); // 应为 true
        System.out.println("isEmpty(\"\"): " + StringUtils.isEmpty("")); // 应为 true
        System.out.println("isEmpty(\"abc\"): " + StringUtils.isEmpty("abc")); // 应为 false

        // 测试 equals 方法
        System.out.println("\nTesting equals:");
        System.out.println("equals(null, null): " + StringUtils.equals(null, null)); // 应为 true
        System.out.println("equals(\"abc\", \"abc\"): " + StringUtils.equals("abc", "abc")); // 应为 true
        System.out.println("equals(\"abc\", \"def\"): " + StringUtils.equals("abc", "def")); // 应为 false
    }
}
