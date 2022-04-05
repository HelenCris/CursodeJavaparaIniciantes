public class MathClass {
    public static void main(String[] main) {
        int result = Math.round(1.1F); //return a long
        int result2 = (int)Math.ceil(1.1F);
        int result3 = (int) Math.floor(1.1F);
        int result4 = Math.max(1, 2);
        int result5 = Math.min(1, 2);
        double result6 = Math.random() * 100;
        int result7 = (int) Math.round(Math.random() * 100);
    }
}
