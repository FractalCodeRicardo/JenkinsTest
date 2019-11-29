
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Repository<T> {

    private DataSource<T> dataSource;

    public DataSource<T> getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource<T> dataSource) {
        this.dataSource = dataSource;
    }


    public List<T> find(Predicate<T> predicate){
        List<T> result =  new ArrayList<>();
        for (T t: dataSource.getData()) {
            if(predicate.test(t))
                result.add(t);
        }

        return result;
    }
}
