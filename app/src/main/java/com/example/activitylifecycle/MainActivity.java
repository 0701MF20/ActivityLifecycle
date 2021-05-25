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
    //Start method is executing  just after launching the app
    @Override
    protected void onStart() {
        super.onStart();
        Log.v("MainActivity","Start");
    }
    //onResume() method is used in order to continue for activity representing in visible
    @Override
    protected void onResume() {
        super.onResume();
        Log.v("MainActivity","Resume");
    }
//onPause() method is actually used to go for partially visible state
    @Override
    protected void onPause() {
        super.onPause();
        Log.v("MainActivity","Pause");
    }
//onStop() method is actually used to hidden state
    @Override
    protected void onStop() {
        super.onStop();
        Log.v("MainActivity","Stop");
    }
//onDestroy() method is used for going in destroy state
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v("MainActivity","Destroy");
    }
//onRestart() method is used for using to restart from paused state
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.v("MainActivity","Restart");
    }
}
