package saidul.com.andridodserviceexampleforstudent;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private Button btStart, btStop;

    private static final String TAG = MainActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();




    }

    private void init() {
        btStart = (Button) findViewById(R.id.btStart);
        btStop = (Button) findViewById(R.id.btStop);

        btStop.setOnClickListener(this);
        btStart.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){

            case R.id.btStart:

                Intent intent = new Intent(this, MyService.class);
                intent.putExtra("counter", 1000);
                startService(intent);



                break;

            case R.id.btStop:

                break;

        }

    }
}
