package learn.mosh.java;

public class TextBox {

    private String text = "";

    public void setText(String text){
        this.text = text;
    }

    public String getText(){
        return this.text;
    }

    public void clear(){
        text = "";
    }
}
