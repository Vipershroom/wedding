import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Wedding {
    LocalDate date;
    Couple couple;
    String location;

    public Wedding(LocalDate date, Couple couple, String location) {
        this.date = date;
        this.couple = couple;
        this.location = location;
    }

    public LocalDate get_date() {
        return this.date;
    }
    public Couple get_couple() {
        return this.couple;
    }
    public String get_location() {
        return this.location;
    }

}