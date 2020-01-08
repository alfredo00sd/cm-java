package learn.mosh.mytube;

public class Main {

    public static void main(String[] args) {
        Video video = new Video();
        video.setFileName("Jungle.mp4");
        video.setTitle("Welcome to the jungle");
        video.setUser(new User("aap@mytube.com.do"));

        VideoProcessor processor = new VideoProcessor(
                new XVideoEncoder(),
                new SqlVideoDatabase(),
                new XNotificationService()
        );
        processor.process(video);
    }
}
