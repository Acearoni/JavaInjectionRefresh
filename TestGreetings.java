public class TestGreetings {
    public static void main(String[] args) {

        Greetings greeterApp = new Greetings();


        String dateMessage = greeterApp.getCurrentDate();
        System.out.println(dateMessage);

        String englishGreeting = greeterApp.greetInEnglish("Savanna");
        System.out.println(englishGreeting);

        String spanishGreeting = greeterApp.greetInSpanish("Adam");
        System.out.println(spanishGreeting);
    }
}
