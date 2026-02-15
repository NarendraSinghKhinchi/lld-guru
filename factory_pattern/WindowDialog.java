package factory_pattern;


public class WindowDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}