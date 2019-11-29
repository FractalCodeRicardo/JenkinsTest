import java.util.ArrayList;
import java.util.List;

public class DummyDataSource implements DataSource<Person> {

    @Override
    public List getData() {
        List<Person> list = new ArrayList<>();


        list.add(new Person(1, "Alfonso"));
        list.add(new Person(2, "Mariano"));


        return list;
    }
}