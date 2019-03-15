package com.example.loginfake;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{
    private EditText username;
    private  EditText password;
    private Button boton;
    private TextView shower;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username=findViewById(R.id.username);
        password=findViewById(R.id.password);
        boton=findViewById(R.id.boton);
        shower=findViewById(R.id.shower);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shower.setText(username.getText());
            }
        });
        boton.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                shower.setText(password.getText());
                return false;
            }
        });

    }

}
