package strings;
// subset is for arrays and subseq is for strings

import java.util.ArrayList;

public class SubSeq {
    public static void main(String[] args) {
//        subseq("", "abc");
//        System.out.println(subseqArr("", "abc"));
//        subseqAscii("", "abc");
        System.out.println(subseqArrAscii("", "abc"));
    }
    static void subseq(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        subseq(p + ch, up.substring(1));
        subseq(p, up.substring(1));
    }


    static ArrayList<String> subseqArr(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subseqArr(p + ch, up.substring(1));
        ArrayList<String> right = subseqArr(p, up.substring(1));
        left.addAll(right);
        return left;
    }




    static void subseqAscii(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        subseqAscii(p + ch, up.substring(1));
        subseqAscii(p, up.substring(1));
        subseqAscii(p + (ch+0), up.substring(1));
    }


    static ArrayList<String> subseqArrAscii(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> first = subseqArrAscii(p + ch, up.substring(1));
        ArrayList<String> second = subseqArrAscii(p, up.substring(1));
        ArrayList<String> third = subseqArrAscii(p + (ch + 0), up.substring(1));
        first.addAll(second);
        first.addAll(third);
        return first;
    }
}
