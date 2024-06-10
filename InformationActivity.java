package com.example.courseselectapp.activity.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.courseselectapp.R;

public class InformationActivity extends AppCompatActivity {

    private Button mRe_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);
        mRe_btn=findViewById(R.id.re_btn);
        mRe_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(InformationActivity.this, "修改成功！", Toast.LENGTH_SHORT).show();
            }
        });
    }
}