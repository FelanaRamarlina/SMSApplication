package com.example.framarlina.smsapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;


import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    /*protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }*/

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*TextView text = new TextView(this);
        text.setText("Hello Baby World!&&&&&");
        setContentView(R.layout.activity_main);*/
        setContentView(R.layout.activity_main);
        final EditText edit = (EditText) findViewById(R.id.editText);
        final TextView viewtest = (TextView) findViewById(R.id.textView);
        final Button btn = (Button) findViewById(R.id.showBtn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewtest.setText(edit.getText());
            }
        });

    }



}
