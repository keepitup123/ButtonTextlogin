package com.example.buttontext;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ButtonActivity extends AppCompatActivity {
    private Button etn_2;
    private Button mbtn_1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);
        mbtn_1 = findViewById(R.id.btn_2);
        mbtn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ButtonActivity.this,"按键2被点击了",Toast.LENGTH_SHORT).show();
            }
        });
        etn_2 = (Button) findViewById(R.id.btn_3);
        etn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ButtonActivity.this,EditTextActivity.class);
                startActivity(intent);
            }
        });
    }
    public void showToast(View view){
        Toast.makeText(this,"按键3被点击了",Toast.LENGTH_SHORT).show();
    }
}
