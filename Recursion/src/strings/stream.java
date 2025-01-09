package strings;

public class stream {
    public static void main(String[] args) {
//        skip("", "baccadh");
//        System.out.println(skip2("baccadh"));
//        System.out.println(skipApple("bdapplefg"));
        System.out.println(skipAppNotApple("bdapplfg"));
    }
    static void skip (String p, String up) {    // processed (p) - empty one and unprocessed (up) - original one
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if (ch == 'a') {
            skip(p, up.substring(1));
        } else {
            skip(p + ch, up.substring(1));
        }
    }


    static String skip2(String up) {
        if (up.isEmpty()) {
            return "";
        }
        char ch = up.charAt(0);
        if (ch == 'a') {
            return skip2(up.substring(1));
        } else {
            return ch + skip2(up.substring(1));
        }
    }


    static String skipApple(String up) {
        if (up.isEmpty()) {
            return "";
        }
        char ch = up.charAt(0);
        if (up.startsWith("apple")) {
            return skipApple(up.substring(5));
        } else {
            return ch + skipApple(up.substring(1));
        }
    }


    static String skipAppNotApple(String up) {
        if (up.isEmpty()) {
            return "";
        }
        char ch = up.charAt(0);
        if (up.startsWith("app") && !up.startsWith("apple")) {
            return skipAppNotApple(up.substring(3));
        } else {
            return ch + skipAppNotApple(up.substring(1));
        }
    }
}
