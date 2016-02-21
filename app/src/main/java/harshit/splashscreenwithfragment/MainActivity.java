package harshit.splashscreenwithfragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

//Import handler class below
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Runnable runnable3secs=new Runnable() {
            @Override
            public void run() {
                nextActivity();
                finish();
            }
        };
        Handler myhandler=new Handler();
        myhandler.postDelayed(runnable3secs,10000);
    }

    public void nextActivity(){
        Intent i=new Intent(this,Main2Activity.class);
        startActivity(i);

    }
}
