package abstract_factory_pattern;

public class MacOsCheckbox implements Checkbox{

    @Override
    public void paint() {
        System.out.println("MacOs Checkbox");
    }
}