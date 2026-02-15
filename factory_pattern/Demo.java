package factory_pattern;

public class Demo{

    private static Dialog dialog;

    public static void main(String[] args){
        configure();
        runBusinessLogic();
        HtmlButton ht = new HtmlButton();
        WindowsButton wb = new WindowsButton();
    }

    static void configure(){
        if(System.getProperty("os.name").equals("Windows 10")){
            dialog = new WindowDialog();
        }else {
            dialog = new HtmlDialog();
        }
    }

    static void runBusinessLogic(){
        dialog.renderWindow();
    }
}