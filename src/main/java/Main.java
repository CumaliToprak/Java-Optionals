import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Optional<Object> empty = Optional.empty();
        System.out.println(empty.isPresent());
        System.out.println(empty.isEmpty());

        Optional<String> isEmpty = Optional.of("Hello");
        System.out.println(isEmpty.isPresent());
        System.out.println(isEmpty.isEmpty());

        Optional<String> o = Optional.ofNullable(null);
        String hello_world = o.orElse("Hello World");
        System.out.println(hello_world);

        Optional<String> hello = Optional.ofNullable("Hello");
        String hello_cumali = hello.map(String::toUpperCase).orElse("Hello_Cumali");
        System.out.println(hello_cumali);

        Optional<String> egg = Optional.ofNullable(null);
        String s = egg.orElseGet(() -> {
            // ... extra computation to retrieve the value, ex: getting the value from db
            return "two egg";
        });
        System.out.println(s);

        Optional<String> is_not_null = Optional.ofNullable("is not null");
        is_not_null.ifPresent(x -> {
            System.out.println(x);
        });

        //ifPresentOrElse
        Optional<String> xxxxx = Optional.ofNullable(null);
        xxxxx.ifPresentOrElse(x -> {
            System.out.println(x);
        },() -> {
            System.out.println("runnable is running");
        });
    }
}
