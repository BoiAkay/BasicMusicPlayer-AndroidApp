package com.example.akaymusicz;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
    MediaPlayer player;

    public void play(View view)
    {
        player.start();
        TextView statusBar = findViewById(R.id.statusBar);
        statusBar.setText("Playing");

    }
    public void pause(View view)
    {
        player.pause();
        TextView statusBar = findViewById(R.id.statusBar);
        statusBar.setText("Pause");
    }
    public void stop(View view)
    {
        player.stop();
        TextView statusBar = findViewById(R.id.statusBar);
        statusBar.setText("");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // my code
        player = MediaPlayer.create(this,R.raw.audio);
    }

}