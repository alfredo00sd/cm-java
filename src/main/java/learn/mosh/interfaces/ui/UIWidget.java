package learn.mosh.interfaces.ui;

//Interface can have multiple parents
public interface UIWidget extends Draggable, Resizable {
    void render();
}

