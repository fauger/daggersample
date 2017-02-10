package daggersample.fauger.com.daggersample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Service mService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        ((MyApplication) getApplication()).getComponent().inject(this);

        boolean injected = mService != null;
        TextView userAvailable = (TextView) findViewById(R.id.hello);
        userAvailable.setText("Dependency injection worked: " + String.valueOf(injected));
    }
}
