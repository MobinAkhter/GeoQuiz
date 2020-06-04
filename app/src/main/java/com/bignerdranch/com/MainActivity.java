package com.bignerdranch.com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // Field variable declaration below
    private Button mTrueButton; // Used m before the variable to indicate that these are member/instance variables.
    private Button mFalseButton;
    private Button mNextButton;
    private TextView mQuestionTextView;

    // Add a Questions Array
    private Questions[] mQuestionBank = new Questions[] {
            new Questions(R.string.question_oceans, true),
            new Questions(R.string.question_mideast, false),
            new Questions(R.string.question_africa, false),
            new Questions(R.string.question_americas, true),
            new Questions(R.string.question_asia, true)
    };

    private int mCurrentIndex = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        mTrueButton = (Button) findViewById(R.id.true_button);
        mTrueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, R.string.correct_toast, Toast.LENGTH_SHORT).show();
            }
        });

        mFalseButton = (Button) findViewById(R.id.false_button);
        mFalseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, R.string.incorrect_toast, Toast.LENGTH_SHORT).show();
            }
        });

    }
}