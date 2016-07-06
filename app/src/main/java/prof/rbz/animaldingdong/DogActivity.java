package prof.rbz.animaldingdong;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class DogActivity extends AppCompatActivity {
    Timer timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dog);

        setTitle("AnimalDingDong Dog");
        MediaPlayer mediaPlayer =  MediaPlayer.create(this, R.raw.dog);
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
