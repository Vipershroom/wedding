public class Person {
    String first_name;
    String last_name;

    public Person(String first_name, String last_name) {
        this.first_name = first_name;
        this.last_name = last_name;
    }

    public String get_first_name() {
        return this.first_name;
    }

    public String get_last_name(String s) {
        return this.last_name;
    }
}
