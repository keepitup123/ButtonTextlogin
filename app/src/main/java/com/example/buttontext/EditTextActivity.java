package com.example.buttontext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class EditTextActivity extends AppCompatActivity {
    private Button eton_1;
    private EditText metext_1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_text);
        eton_1 = (Button) findViewById(R.id.btn_4);
        eton_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        metext_1 = findViewById(R.id.et_1);
        metext_1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                Log.d("EditText",s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
    public void showToast(View view){
        Toast.makeText(this,"登陆成功",Toast.LENGTH_SHORT).show();
    }
}
