package saidul.com.andridodserviceexampleforstudent;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.squareup.otto.Subscribe;

public class MySecoudActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_secoud);
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

    @Subscribe
    public  void myFeedback(Event event){

        Toast.makeText(getApplicationContext(), ""+event.getMessage(), Toast.LENGTH_LONG).show();
    }




}
