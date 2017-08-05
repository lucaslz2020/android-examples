package com.lucasleelz.geoquiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.widget.Button;
import android.widget.Toast;

public class QuizActivity extends AppCompatActivity {

    private Button mTrueButton;

    private Button mFalseButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        mTrueButton = (Button) findViewById(R.id.true_button);
        mFalseButton = (Button) findViewById(R.id.false_button);

        mTrueButton.setOnClickListener(view -> {
            Toast toast = Toast.makeText(QuizActivity.this, R.string.correct_toast, Toast.LENGTH_LONG);
            toast.setGravity(Gravity.CENTER, 0, 0); // 居中.
            toast.show();
        });

        mFalseButton.setOnClickListener(view ->
            Toast.makeText(QuizActivity.this, R.string.incorrect_toast, Toast.LENGTH_LONG).show()
        );
    }
}
