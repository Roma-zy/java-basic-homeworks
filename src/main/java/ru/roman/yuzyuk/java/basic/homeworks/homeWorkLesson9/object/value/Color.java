package ru.roman.yuzyuk.java.basic.homeworks.homeWorkLesson9.object.value;

public final class Color {
    private final String hex;

    public Color(String hex) {
        if (!isValidHex(hex)) {
            throw new IllegalArgumentException("Invalid hex color code.");
        }
        this.hex = hex;
    }

    private boolean isValidHex(String hex) {
        return hex != null && hex.matches("^#([A-Fa-f0-9]{6}|[A-Fa-f0-9]{3})$");
    }

    public String getHex() {
        return hex;
    }
}

