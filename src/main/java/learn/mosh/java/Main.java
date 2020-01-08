package learn.mosh.java;

public class Main {

    //Do not inheritance more than 3 levels

    public static void main(String[] args) {
        //TextBox textBox = new TextBox();

        //textBox.setText("Hi");
        // -Method overriding
        //System.out.println(textBox);

        //System.out.println(textBox.hashCode());
        // -460141958

        //System.out.println(textBox1.toString());
        // -learn.mosh.java.TextBox@4554617c after @ you get the hexadecimal representation of the hashcode of the obj

        // Up casting
        TextBox textBox = new TextBox();
        show(textBox);
        //Down casting
    }
    //The parameter passed here must be a instance of the class UIControl.
    //Go from the specific to general not in reverse, JAVA does not understand it.
    private static void show(UIControl control){
        if(control instanceof TextBox){ //to prevent down Casting errors
            TextBox tc = (TextBox) control;
            tc.setText("Hello");
        }
        System.out.println(control);
    }
}
