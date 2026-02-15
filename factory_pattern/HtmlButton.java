package factory_pattern;

public class HtmlButton implements Button{

    public void render(){
        System.out.println("<button>HTML Button</button>");
    }

    public void onClick(){
        System.out.println("Clicked HTML Button - says 'Hello Nick!';");
    }
}