import javax.sound.midi.VoiceStatus;

public class EscapeSequences {
    public static void main(String[] args) {
        // c:\Windows\...
        String message = "Hello \"Helen\"";
        String msg = "c:\\Windows\\...";
        String msge = "hELLO\n"; //pula uma linha
        String msag = "Hello \t Cris"; // add an tab
        System.out.println(message);
        System.out.println(msg);
    }
}
