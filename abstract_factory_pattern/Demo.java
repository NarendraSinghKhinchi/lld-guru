package abstract_factory_pattern;


public class Demo{

    private static Application configureApplication(){

        Application app;
        GUIFactory factory;

        String osName = System.getProperty("os.name").toLowerCase();
        System.out.println(osName + " operating system detected.");
        if(osName.contains("mac") || osName.contains("darwin")){
            factory = new MacOsFactory();
        }else{
            factory = new WindowsFactory();
        }

        app = new Application(factory);
        return app;
    
    }

    public static void main(String[] args){
        Application app = configureApplication();
        app.paint();
    }
}