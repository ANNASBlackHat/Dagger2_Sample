package com.annasblackhat.dagger;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject NetworkApi networkApi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((MyApplication)getApplication()).getComponent().inject(this);

        boolean isInjected = networkApi != null;

        ((TextView)findViewById(R.id.txt)).setText("Depedency Injection worked : "+String.valueOf(isInjected));
    }
}
