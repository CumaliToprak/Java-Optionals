import java.util.Optional;

public class RealWordImpl {
    public static void main(String[] args) {
        Person person = new Person("cumali", "CUMALİ@GMAİL.COm");
        String email_is_not_provided = person.getEmail().map(String::toLowerCase).orElse("email is not provided");
        System.out.println(email_is_not_provided);
    }
}

class Person {
    private final String  name;
    private final String email;

    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public Optional<String> getEmail() {
        return Optional.ofNullable(email);
    }

    public String getName() {
        return name;
    }
}
