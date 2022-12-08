package com.test.app2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    protected void onResume() {
        super.onResume();
        setContentView(R.layout.activity_main);

        ImageView backgroundImageView1 = (ImageView) findViewById(R.id.imageView);
        backgroundImageView1.setImageURI(Uri.parse("/mnt/sdcard/Documents/Museum/Page1.png"));


//        VideoView simpleVideoView1 = (VideoView) findViewById(R.id.videoView1);
//        simpleVideoView1.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
//            @Override
//            public void onPrepared(MediaPlayer mp) {
//                mp.setLooping(true);
//            }
//        });
//        simpleVideoView1.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.cat));
//        simpleVideoView1.start();
//
//        VideoView simpleVideoView2 = (VideoView) findViewById(R.id.videoView2);
//        simpleVideoView2.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
//            @Override
//            public void onPrepared(MediaPlayer mp) {
//                mp.setLooping(true);
//            }
//        });
//        simpleVideoView2.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.cat3));
//        simpleVideoView2.start();

    }

    public void goToAnActivity2(View view) {
//        Intent intent = new Intent(this, MainActivity2.class);
//        startActivity(intent);
    }
}