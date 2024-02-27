public class Couple {
    Person bride;
    Person groom;

    public Couple(Person bride, Person groom) {
        this.bride = bride;
        this.groom = groom;
    }

    public Person get_bride() {
        return this.bride;
    }
    public Person get_groom() {
        return this.groom;
    }
}
