package _1_decorator._99_exercice.withDecorator;

public class DataSource implements _1_decorator._99_exercice.withoutDecorator.DataSource {

    DataSource dataSource;

    DataSource(DataSource _dataSource){
        dataSource = _dataSource;
    }

    @Override
    public void writeData(String data) {
        dataSource.writeData(data);
    }

    @Override
    public String readData() {
        return dataSource.readData();
    }
}
