public class Source {
    public static void main(String[] args) {
        String str="2";
        System.out.println(isDigit(str));
    }

    public static boolean isDigit(String s)
    {
        return s.matches("[-+]?\\d*\\.?\\d+");
    }
}