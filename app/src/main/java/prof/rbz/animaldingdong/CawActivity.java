package prof.rbz.animaldingdong;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.text.BreakIterator;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class CawActivity extends AppCompatActivity {
    Timer timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caw);

        setTitle("AnimalDingDong Cow");
        MediaPlayer mediaPlayer =  MediaPlayer.create(this, R.raw.cow);
        mediaPlayer.start();

        timer = new Timer();
        MyTimerTask myTimerTask = new MyTimerTask();
        timer.schedule(myTimerTask, mediaPlayer.getDuration());
    }


    class MyTimerTask extends TimerTask {

        @Override
        public void run() {
            finish();
        }

    }


}
