import org.junit.Assert;
import org.junit.Test;
import org.junit.Ignore;

import java.util.List;

import static org.junit.Assert.assertEquals;


public class TestRepository {

    @Test
    public void find_returns_nothing(){
        Repository<Person> rep = createRepository();
        List<Person> result = rep.find(i-> false);

        if(result.size()>0)
            Assert.fail(("Method find must return empty list"));
    }


    @Test
    public void find_return_person_if_exists(){
        Repository<Person> rep = createRepository();
        List<Person> result = rep.find(i-> i.getName().equals("Alfonso"));

        if(result.size()>0 && !result.get(0).getName().equals("Alfonso"))
            Assert.fail(("Method find must return item that match predicate"));
    }

    @Test
    public void find_return_all(){
        Repository<Person> rep = createRepository();
        List<Person> result = rep.find(i->true);


        if(result.size()!=rep.getDataSource().getData().size())
            Assert.fail(("Method find must return all persons"));
    }

    @Test
    public void find_fail(){
        //Assert.fail("Method find fail");
    }


    @Test
    public void fails(){
        //Assert.fail("Method find fail");
    }

    private Repository<Person> createRepository(){
        Repository<Person> rep= new Repository<>();
        DataSource<Person> dummyDataSource = new DummyDataSource();
        rep.setDataSource(dummyDataSource);

        return rep;
    }


}



