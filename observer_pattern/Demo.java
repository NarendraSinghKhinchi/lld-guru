package observer_pattern;

public class Demo {
    
    public static void main(String[] args){
        Editor editor = new Editor();
        editor.events.subscribe("open", new LogOpenListener("/path/to/log/file.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("aashi@mail.com"));

        try{
            editor.openFile("aashi.txt");
            editor.saveFile();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
