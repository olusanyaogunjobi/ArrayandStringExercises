package se.lexicon;

/**
 * Hello world!
 *
 */
public class App {


    public static void main(String[] args) {
        String name = "Sanya";

        Greeter(name);

    }

    public static String Greeter(String s) {

        String greetings  = "Hello!";
         if (s.isEmpty()){

             System.out.println(greetings);
         }
         else {

             System.out.println(greetings + " " + s );
         }

         return greetings;
    }
}
