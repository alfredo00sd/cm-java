package learn.mosh.java;

public class Exec {
    public static void main(String[] args) {

        UIControl[] controls = {new TextBox(), new CheckBox()};

        for(UIControl control : controls){
            // Procedural way
            // if control is TextBox
            // render TextBox
            // else if it a CheckBox
            // render a CheckBox
            //  ...

            // Use polymorphism
            // By the implementation of render empty method in controller UI, you can give the
            // a render form in each object.
            control.render();
        }

    }
//    Point point1 = new Point(1,2);
//    Point point  = new Point(1,2);
//
//    //System.out.println(point.equals(new TextBox()));
//        System.out.println(point.hashCode());
//        System.out.println(point1.hashCode());
}
