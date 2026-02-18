package abstract_factory_pattern;

public class MacOsButton implements Button {
    @Override
    public void paint(){
        System.out.println("MacOs Button");
    }
}