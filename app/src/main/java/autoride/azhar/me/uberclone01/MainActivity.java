package autoride.azhar.me.uberclone01;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //BEFORE SET CONTENT VIEW

        setContentView(R.layout.activity_main);
    }
}
