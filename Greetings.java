import java.util.Date;

public class Greetings {
    public String getCurrentDate() {
        Date date = new Date();
        return "The Current Date is " + date;
    }
    public String greetInEnglish(String name) {
        return "Hello, " + name;
    }
    public String greetInSpanish(String name) {
        return "Hola, " + name;
    }
}
