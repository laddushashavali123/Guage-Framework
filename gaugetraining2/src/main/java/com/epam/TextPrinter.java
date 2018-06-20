package com.epam;

public final class TextPrinter {

    public enum Color {

        BLUE("\033[46m"),
        YELLOW("\033[43m"),
        BRIGHT_YELLOW("\033[103m"),
        RED("\033[41m"),
        WHITE("\033[107m"),
        MAGENTA("\033[45m");

        private String color;

        private Color(String color) {
            this.color = color;
        }

        public String toString() {
            return this.color;
        }
    }

    private TextPrinter() {
    }

    public static void printText(String text) {
        System.out.println(text);
    }

    public static void printText(String text, Color color) {
        System.out.print(color.toString());
        printText(text);
        System.out.print(Color.WHITE.toString());
    }

    private static String buildBorder(String borderStyle, int length) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append(borderStyle);
        }
        return sb.toString();
    }

    public static String printBorderedText(String text, String borderStyle, Color color) {
        String inlineBorder = buildBorder(borderStyle, 20);
        String textLine = inlineBorder + " " + text + " " + inlineBorder;
        printText(textLine, color);
        return textLine;
    }

}
