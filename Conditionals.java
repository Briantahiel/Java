public class Conditionals {
    public static void main(String[] args) {
        int age = 17;
        int adult = 20;
        if (age >= 18) {
            System.out.println("You're in!");
        } else {
            if (adult >= 18) {
                System.out.println("Now you're in!");
            } else {
                System.out.println("You're out!");
            }
        }
    }
}
