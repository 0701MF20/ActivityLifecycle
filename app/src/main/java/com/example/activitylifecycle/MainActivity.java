package com.example.activitylifecycle;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v("MainActivity","Start");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v("MainActivity","Resume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v("MainActivity","Pause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v("MainActivity","Stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v("MainActivity","Destroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.v("MainActivity","Restart");
    }
}