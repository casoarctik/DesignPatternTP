package _1_decorator._99_exercice.withoutDecorator;

/**
 * Interface pour une data source.
 */
public interface DataSource {
    void writeData(String data);

    String readData();
}