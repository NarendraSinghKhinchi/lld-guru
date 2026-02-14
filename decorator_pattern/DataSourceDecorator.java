package decorator_pattern;

public abstract class DataSourceDecorator implements DataSource {
    private DataSource wrappee;

    public DataSourceDecorator(DataSource wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public String readData(){
       return wrappee.readData();
    }

    @Override
    public void writeData(String data){
        wrappee.writeData(data);
    }
}