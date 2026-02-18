package abstract_factory_pattern;

public class WindowsCheckbox implements Checkbox{

    @Override
    public void paint() {
        System.out.println("Windows Checkbox");
    }
}