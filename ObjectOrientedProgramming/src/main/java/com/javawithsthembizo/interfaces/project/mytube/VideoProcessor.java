package com.javawithsthembizo.interfaces.project.mytube;

public class VideoProcessor {

    private Encoder encoder;
    private Database database;
    private NotificationService notificationService;

    public VideoProcessor(Encoder encoder, Database database, NotificationService notificationService) {
        this.encoder = encoder;
        this.database = database;
        this.notificationService = notificationService;
    }

    public void process(Video video) {
        encoder.encode(video);

        database.store(video);

        notificationService.sendEmail(video.getUser());
    }
}
