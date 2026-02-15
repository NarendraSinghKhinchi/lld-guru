package factory_pattern;

public abstract class Dialog{
    public void renderWindow(){
        Button okButton = createButton();
        okButton.render();
    }

    public abstract Button createButton();
}