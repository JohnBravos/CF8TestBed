package gr.aueb.cf.ch12;

public class UserMain {

    public static void main(String[] args) {
        User john = new User(1, "John", "Bravos");

        System.out.printf("Firstname: %s, Lastname: %s, ID: %d\n", john.getFirstname(), john.getLastname(), john.getId());
    }
}
