package learn.mosh.java;

public abstract class UIControl {

    //As abstract class, you can not instance it anymore, just extend it

//    public UIControl(boolean isEnabled) {
//        this.isEnabled = isEnabled;
//        System.out.println("UI control");
//    }

    public abstract void render();
    public abstract void enable();
    public abstract void disable();
    public abstract boolean isEnabled();
}
