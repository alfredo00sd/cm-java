package learn.mosh.mytube;

//this as all the class is just like a data container for the object we are using at the time.
public class Video {

    private String fileName;
    private String title;
    private User user;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString(){
        return  " File: " + getFileName() +
                " Title: " + getTitle() +
                " User: " + getUser().getEmail();
    }
}
