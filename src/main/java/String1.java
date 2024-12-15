package src.main.java;

public class String1
{
    public static void main(String[] args){
        String1 s = new String1();
        System.out.println(s.helloName("Bob"));
        System.out.println(s.makeAbba("Hi", "Bye"));
        System.out.println(s.makeTags("i", "Yay"));
        System.out.println(s.makeOutWord("<<>>", "Yay"));
        System.out.println(s.extraEnd("Hello"));
        System.out.println(s.firstTwo("Hello"));
        System.out.println(s.withoutEnd("Hello"));
        System.out.println(s.comboString("hi", "Hello"));
        System.out.println(s.middleThree("Candy"));
        System.out.println(s.extraFront("Hello"));
        System.out.println(s.left2("Hello"));
        System.out.println(s.hasBad("badxx"));
        System.out.println(s.conCat("abc", "cat"));
        System.out.println(s.minCat("Hello", "Hi"));
        System.out.println(s.withoutX("xHix"));
        System.out.println(s.deFront("Hello"));
    }

    public String1() {}

    public String helloName(String name) {
        return "Hello " + name + "!";
    }

    public String makeAbba(String a, String b) {
        return a + b + b + a;
    }

    public String makeTags(String tag, String word) {
        return "<" + tag + ">" + word + "</" + tag + ">";
    }

    public String makeOutWord(String out, String word) {
        return out.substring(0, 2) + word + out.substring(2);
    }

    public String extraEnd(String str) {
        String lastTwo = str.substring(str.length() - 2);
        return lastTwo + lastTwo + lastTwo;
    }

    public String firstTwo(String str) {
        return str.length() < 2 ? str : str.substring(0, 2);
    }

    public String firstHalf(String str) {
        return str.substring(0, str.length() / 2);
    }

    public String withoutEnd(String str) {
        return str.substring(1, str.length() - 1);
    }

    public String comboString(String a, String b) {
        return a.length() < b.length() ? a + b + a : b + a + b;
    }

    public String middleThree(String str) {
        int mid = str.length() / 2;
        return str.substring(mid - 1, mid + 2);
    }

    public String extraFront(String str) {
        String firstTwo = str.length() < 2 ? str : str.substring(0, 2);
        return firstTwo + firstTwo + firstTwo;
    }

    public String left2(String str) {
        return str.substring(2) + str.substring(0, 2);
    }

    public boolean hasBad(String str) {
        return str.startsWith("bad") || (str.length() > 1 && str.substring(1).startsWith("bad"));
    }

    public String conCat(String a, String b) {
        if (a.endsWith("") && b.startsWith("")) {
            return a + b.substring(1);
        }
        return a + b;
    }

    public String minCat(String a, String b) {
        int minLength = Math.min(a.length(), b.length());
        return a.substring(a.length() - minLength) + b.substring(b.length() - minLength);
    }

    public String withoutX(String str) {
        if (str.startsWith("x")) {
            str = str.substring(1);
        }
        if (str.endsWith("x")) {
            str = str.substring(0, str.length() - 1);
        }
        return str;
    }

    public String deFront(String str) {
        String result = "";
        if (str.length() > 0 && str.charAt(0) == 'a') {
            result += "a";
        }
        if (str.length() > 1 && str.charAt(1) == 'b') {
            result += "b";
        }
        if (str.length() > 2) {
            result += str.substring(2);
        }
        return result;
    }
}
