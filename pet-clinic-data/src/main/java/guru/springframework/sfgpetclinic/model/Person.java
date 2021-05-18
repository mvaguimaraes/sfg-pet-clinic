package guru.springframework.sfgpetclinic.model;

public class Person extends BaseEntity {

    private String firstName;
    private String lasteName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLasteName() {
        return lasteName;
    }

    public void setLasteName(String lasteName) {
        this.lasteName = lasteName;
    }
}
