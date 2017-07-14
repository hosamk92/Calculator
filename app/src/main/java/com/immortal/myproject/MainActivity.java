package com.immortal.myproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.widget.Toast.*;

public class MainActivity extends AppCompatActivity {

    float n1,n2,r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView tv1 = (TextView) findViewById(R.id.ftv);
        Button b1 = (Button) findViewById(R.id.fb);
        Button p = (Button) findViewById(R.id.Plus);
        Button min = (Button) findViewById(R.id.Minus);
        Button mult = (Button) findViewById(R.id.Mult);
        Button div = (Button) findViewById(R.id.Div);
        final EditText e1 = (EditText) findViewById(R.id.set);
        final EditText e2 = (EditText) findViewById(R.id.fet);
      //  final int n1 , n2;
        b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                e1.setText("");
                e2.setText("");
                tv1.setText("Result");

                // Code here executes on main thread after user presses button
            }
        });
        p.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(e1.getText().toString().isEmpty()||e2.getText().toString().isEmpty()) {
                    Toast.makeText(getApplicationContext(),"Enter text", LENGTH_SHORT).show();
                }
                else {
                    n1 = Integer.parseInt(e1.getText().toString());
                    n2 = Integer.parseInt(e2.getText().toString());
                    r = n1 + n2;
                    tv1.setText(r + "");
                }    // Code here executes on main thread after user presses button
            }
        });
        min.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(e1.getText().toString().isEmpty()||e2.getText().toString().isEmpty()) {
                    Toast.makeText(getApplicationContext(),"Enter text", LENGTH_SHORT).show();
                }
                else {
                    n1 = Integer.parseInt(e1.getText().toString());
                    n2 = Integer.parseInt(e2.getText().toString());
                    r = n1 - n2;
                    tv1.setText(r + "");
                }    // Code here executes on main thread after user presses button
            }
        });
        mult.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(e1.getText().toString().isEmpty()||e2.getText().toString().isEmpty()) {
                    Toast.makeText(getApplicationContext(),"Enter text", LENGTH_SHORT).show();
                }
                else {
                    n1 = Integer.parseInt(e1.getText().toString());
                    n2 = Integer.parseInt(e2.getText().toString());
                    r = n1 * n2;
                    tv1.setText(r + "");
                }// Code here executes on main thread after user presses button
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                if(e1.getText().toString().isEmpty()||e2.getText().toString().isEmpty()) {
                    Toast.makeText(getApplicationContext(),"Enter text", LENGTH_SHORT).show();
                }
                else {
                    n1 = Integer.parseInt(e1.getText().toString());
                    n2 = Integer.parseInt(e2.getText().toString());
                    r = n1 / n2;
                    tv1.setText(r + "");
                }    // Code here executes on main thread after user presses button
            }
        });

    }
}
