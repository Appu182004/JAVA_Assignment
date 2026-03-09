public class StringExample {
    public static void main(String[] args) {
        String s = "Hello";
        s = s + " World";
        System.out.println(s);
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println(sb);
        StringBuffer sf = new StringBuffer("Hello");
        sf.append(" World");
        System.out.println(sf);
    }
}