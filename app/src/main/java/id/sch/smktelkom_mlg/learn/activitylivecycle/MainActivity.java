package id.sch.smktelkom_mlg.learn.activitylivecycle;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "LivecycleTag";
    MediaPlayer mediaplayer;

    @Override
    protected void onCreate(Bundle savedInstanceState)

    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mediaplayer = MediaPlayer.create(this, R.raw.song);

    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart : ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume : ");
        mediaplayer.pause();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause : ");
    }

    @Override
    protected void onStop() {
        super.onPause();
        Log.d(TAG, "onStop : ");
    }

    @Override
    protected void onRestart() {
        super.onPause();
        Log.d(TAG, "onRestart : ");
    }

    @Override
    protected void onDestroy() {
        super.onPause();
        Log.d(TAG, "onDestroy : ");
        if (mediaplayer != null)
            mediaplayer.release();
    }

}
