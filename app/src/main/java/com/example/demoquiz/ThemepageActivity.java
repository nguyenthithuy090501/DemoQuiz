package com.example.demoquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class ThemepageActivity extends AppCompatActivity {
    private String selectedTopicName = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_themepage);

        final LinearLayout topic1 = findViewById(R.id.layoutTopic1);
        final LinearLayout topic2 = findViewById(R.id.layoutTopic2);
        final LinearLayout topic3 = findViewById(R.id.layoutTopic3);
        final LinearLayout topic4 = findViewById(R.id.layoutTopic4);

        final Button btnStart = findViewById(R.id.btnStartQuiz);

        topic1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopicName = "Bienca";
                topic1.setBackgroundResource(R.drawable.round_back_white_stoke10);

                topic2.setBackgroundResource(R.drawable.round_back_white10);
                topic3.setBackgroundResource(R.drawable.round_back_white10);
                topic4.setBackgroundResource(R.drawable.round_back_white10);

            }
        });
        topic2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopicName = "DongVat";
                topic2.setBackgroundResource(R.drawable.round_back_white_stoke10);

                topic1.setBackgroundResource(R.drawable.round_back_white10);
                topic3.setBackgroundResource(R.drawable.round_back_white10);
                topic4.setBackgroundResource(R.drawable.round_back_white10);
            }
        });
        topic3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopicName = "GiaDinh";
                topic3.setBackgroundResource(R.drawable.round_back_white_stoke10);

                topic1.setBackgroundResource(R.drawable.round_back_white10);
                topic2.setBackgroundResource(R.drawable.round_back_white10);
                topic4.setBackgroundResource(R.drawable.round_back_white10);
            }
        });
        topic4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopicName = "ThucVat";
                topic4.setBackgroundResource(R.drawable.round_back_white_stoke10);

                topic1.setBackgroundResource(R.drawable.round_back_white10);
                topic2.setBackgroundResource(R.drawable.round_back_white10);
                topic3.setBackgroundResource(R.drawable.round_back_white10);
            }
        });
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(selectedTopicName.isEmpty()){
                    Toast.makeText(ThemepageActivity.this, "Please select the Topic", Toast.LENGTH_SHORT).show();
                }
                else{
                    Intent intent = new Intent(ThemepageActivity.this, QuizActivity.class);
                    intent.putExtra("selectedTopic", selectedTopicName);
                    startActivity(intent);
                }
            }
        });
    }
}