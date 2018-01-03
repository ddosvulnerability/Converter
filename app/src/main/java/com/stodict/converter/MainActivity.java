package com.stodict.converter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button cb= findViewById(R.id.convert);
        cb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText miles= findViewById(R.id.milesinput);
                EditText km= findViewById(R.id.kmoutput);
                double result= Double.valueOf(miles.getText().toString());
                double answer=result/0.621;
                String yo = String.valueOf(answer);

                km.setText(yo);
            }
        });
    }
}
