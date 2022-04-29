package com.saida.appmacro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textOnboard;
    TextView textOnboard2;
    Button buttonOnboard;
    ImageView imageOnboard;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textOnboard = (TextView) findViewById(R.id.textOnboard);
        textOnboard2 = (TextView) findViewById(R.id.textOnboard2);
        buttonOnboard = (Button) findViewById(R.id.buttonOnboard);
        imageOnboard = (ImageView) findViewById(R.id.imageOnboard);



    }
}