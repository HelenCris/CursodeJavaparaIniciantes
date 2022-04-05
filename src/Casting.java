public class Casting {
    public static void main(String[] args) {
        // mplicit casting
        // byte > short > int > long > float > double
        String x = "1";
        String y = "1.1";
        int xx = Integer.parseInt(x) + 2; // auto 2.0
        double yy = Double.parseDouble(y) + 2;
        System.out.println(xx);
        System.out.println(yy);    }
}
