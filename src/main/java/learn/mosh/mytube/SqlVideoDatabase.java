package learn.mosh.mytube;

public class SqlVideoDatabase implements VideoDatabase {

    @Override
    public void store(Video video) {
        System.out.println("Storing the metadata of the video...\n");
        System.out.println("Title: "+video.getTitle());
        System.out.println("File name: "+video.getFileName());
        System.out.println("Done! \n");
    }
}
