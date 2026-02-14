package decorator_pattern;


public class Demo{

    public static void main(String[]args){
        String salarayRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";

        DataSourceDecorator encoded = new CompressionDecorator(
            new EncryptionDecorator(
                new FileDataSource("employees.txt")
            )
        );

        encoded.writeData(salarayRecords);
        DataSource plain = new FileDataSource("employees.txt");

        System.out.println("- Input ----------------");
        System.out.println(salarayRecords);
        System.out.println("- Encoded --------------");
        System.out.println(plain.readData());
        System.out.println("- Decoded --------------");
        System.out.println(encoded.readData());

    }
}