public class Person {


    public Person(int personId, String name) {
        this.personId = personId;
        this.name = name;
    }

    private int personId;
    private String name;


    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
