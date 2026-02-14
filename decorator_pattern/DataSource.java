package decorator_pattern;

public interface DataSource {
    void writeData(String data);

    String readData();
}