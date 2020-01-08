package learn.mosh.mytube;

public class VideoProcessor {

    private VideoEncoder encoder;
    private VideoDatabase database;
    private NotificationService notificationService;

    public VideoProcessor(VideoEncoder encoder, VideoDatabase database, NotificationService notificationService) {
        this.encoder = encoder;
        this.database = database;
        this.notificationService = notificationService;
    }

    public void process(Video video){
        //Encode the video
        encoder.encode(video);
        //Storage it
        database.store(video);
        //Send a notification to the user.
        notificationService.notify(video.getUser());
    }

    //TODO Change implementations for interfaces... DONE!
//    VideoEncoder encoder = new XVideoEncoder();
//        encoder.encode(video);
//
//    VideoDatabase database = new VideoDatabase();
//        database.store(video);
//
//    EmailService emailService = new EmailService();
//        emailService.sendEmail(video.getUser());

}
