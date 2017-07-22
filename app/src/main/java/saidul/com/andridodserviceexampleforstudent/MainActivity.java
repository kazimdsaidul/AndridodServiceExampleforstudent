package saidul.com.andridodserviceexampleforstudent;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.squareup.otto.Subscribe;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private Button btStart, btStop, btStartAnotherActivity;

    private static final String TAG = MainActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

    }

    @Override
    protected void onResume() {
        super.onResume();

        GlobalBus.getBus().register(this);

    }

    @Override
    protected void onPause() {
        super.onPause();

        GlobalBus.getBus().unregister(this);

    }

    private void init() {
        btStart = (Button) findViewById(R.id.btStart);
        btStop = (Button) findViewById(R.id.btStop);
        btStartAnotherActivity = (Button) findViewById(R.id.btStartSecoudActivity);

        btStop.setOnClickListener(this);
        btStart.setOnClickListener(this);
        btStartAnotherActivity.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){

            case R.id.btStart:

                Intent intent = new Intent(this, MyService.class);
                intent.putExtra("counter", 100000);
                startService(intent);

                break;

            case R.id.btStop:

                break;

            case R.id.btStartSecoudActivity:

                Intent intent1 = new Intent(getApplicationContext(), MySecoudActivity.class);
                startActivity(intent1);

                break;

        }

    }

    @Subscribe
    public  void myFeedback(Event event){

        Toast.makeText(getApplicationContext(), ""+event.getMessage(), Toast.LENGTH_LONG).show();
    }

}
