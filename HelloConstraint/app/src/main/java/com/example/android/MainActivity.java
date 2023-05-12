package com.example.android;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int mCount = 0;
    private TextView mShowCount;
    private Button mResetButton, mCountButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
        mCountButton = (Button) findViewById(R.id.button_count);
        mResetButton = (Button) findViewById(R.id.button_reset);
        mCountButton.setBackgroundColor(Color.BLACK);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void countUp(View view) {
        mCount++;

        view.setBackgroundColor(mCount % 2 == 0 ? Color.GREEN : Color.BLUE);

        if (mCount > 0) {
            mResetButton.setBackgroundColor(Color.MAGENTA);
            mResetButton.setTextColor(Color.WHITE);
        }

        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
    }

    public void reset(View view) {
        mCount = 0;
        mResetButton.setBackgroundColor(Color.LTGRAY);
        mCountButton.setBackgroundColor(Color.BLACK);

        if (mShowCount != null) {
            mShowCount.setText(Integer.toString(mCount));
        }
    }
}