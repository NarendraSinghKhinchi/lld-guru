package factory_pattern;


public class WindowsButton implements Button {
  

    public void render(){
        System.out.println("Windows Button");
    }

    public void onClick(){
       System.out.println("Clicked Windows Button - says 'Hello Nick!';");
    }
}