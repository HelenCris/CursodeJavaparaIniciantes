public class Strings {
    public static void main(String[] args) throws Exception {
        String message = "Hello World" + "!!";
        System.out.println(message.length());
        System.out.println(message.indexOf("H"));
        System.out.println(message.replace("!", "*"));
        System.out.println(message.toLowerCase());
        System.out.println(message.trim()); //remove the useless space
        
    }
}
