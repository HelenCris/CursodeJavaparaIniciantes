import java.text.NumberFormat;

public class FormatingNumbers {
    public static void main(String[] arg) {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(1234567.891);
        System.out.println(result);

        
        String resultPercent = NumberFormat.getPercentInstance().format(0.1);
        System.out.println(resultPercent);
    }
}
