package com.altair.nuark.fortesting;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this,"I have made changed",Toast.LENGTH_LONG).show();
        Toast.makeText(this,"I have made change next time",Toast.LENGTH_LONG).show();
        Toast.makeText(this,"I have made changed for third time1",Toast.LENGTH_LONG).show();
    }
}
