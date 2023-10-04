package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText user;
EditText password;
Button btn;
ImageView cont;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        user=findViewById(R.id.user);
        password=findViewById(R.id.pass);
        btn=findViewById(R.id.button);
cont=findViewById(R.id.imageView);
cont.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Toast.makeText(MainActivity.this, "dklsjfaaaaaaaaaaaaaaaaaaaj", Toast.LENGTH_SHORT).show();
    }
});
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(user.getText().toString().equals("ullas") && password.getText().toString().equals("cen")){
                    Toast.makeText(MainActivity.this, "success", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(MainActivity.this, "failure", Toast.LENGTH_SHORT).show();

                }
            }
        });

    }
}