package learn.mosh.java;

public class TextBox extends UIControl {

    private String text = "";

//    public TextBox() {
//        super(false);
//        System.out.println("Text Box class");
//    }


    @Override
    public void render() {
        //super.render();
        System.out.println("Render TextBox");
    }

    //Print a string format of the method, when u call the method and print it.
    @Override
    public String toString(){
        return text;
    }

    public void setText(String text){
        this.text = text;
    }

    public void clear(){
        text = "";
    }

    @Override
    public void enable() {

    }

    @Override
    public void disable() {

    }

    @Override
    public boolean isEnabled() {
        return false;
    }
}
