package prof.rbz.animaldingdong;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class ChicanActivity extends AppCompatActivity {
    Timer timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chican);

        setTitle("AnimalDingDong Chicken");
        MediaPlayer mediaPlayer =  MediaPlayer.create(this, R.raw.chicken);
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
