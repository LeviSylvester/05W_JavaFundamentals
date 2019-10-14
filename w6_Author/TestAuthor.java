package w6_Author;

public class TestAuthor {

    public static void main(String[] args) {
        Author levi = new Author("Levi", "levi@email.com", 'm');
        System.out.println(levi);
        System.out.println(levi.getName());
        System.out.println(levi.getGender());
        System.out.println(levi.getEmail());
        levi.setEmail("l3vi@email.com");
        System.out.println(levi.getEmail());
    }
}
