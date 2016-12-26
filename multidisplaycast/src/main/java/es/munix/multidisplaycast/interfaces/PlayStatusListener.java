package es.munix.multidisplaycast.interfaces;

/**
 * Created by munix on 3/11/16.
 */

public interface PlayStatusListener {

    public static int STATUS_START_PLAYING = 0;
    public static int STATUS_PLAYING = 1;
    public static int STATUS_PAUSED = 2;
    public static int STATUS_STOPPED = 3;
    public static int STATUS_FINISHED = 4;
    public static int STATUS_FORMAT_NOT_ALLOWED = 5;
    public static int STATUS_RESUME_PAUSE = 6;
    public static int STATUS_CAPABILITY_NOT_SUPPORTED = 7;

    void onPlayStatusChanged( int playStatus );

    void onPositionChanged( long currentPosition );

    void onTotalDurationObtained( long totalDuration );

    void onSuccessSeek();
}
