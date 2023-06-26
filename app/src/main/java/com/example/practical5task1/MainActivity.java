package com.example.practical5task1;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.FrameLayout;
import android.graphics.Color;
public class MainActivity extends AppCompatActivity {
    FrameLayout lay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Color Changer (02, 14, 43)");
        lay = findViewById(R.id.frameLayout);
        Button redbtn = findViewById(R.id.red_btn),
                greenbtn = findViewById(R.id.green_btn),
                bluebtn = findViewById(R.id.blue_btn),
                yellowbtn = findViewById(R.id.yellow_btn),
                cyanbtn = findViewById(R.id.cyan_btn),
                magentabtn = findViewById(R.id.magenta_btn),
                blackbtn = findViewById(R.id.black_btn),
                whitebtn = findViewById(R.id.white_btn);
        TextView txt = findViewById(R.id.textView);
        redbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lay.setBackgroundColor(Color.RED);
                txt.setTextColor(Color.WHITE);
                txt.setText(redbtn.getText());
            }
        });
        greenbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lay.setBackgroundColor(Color.GREEN);
                txt.setTextColor(Color.BLACK);
                txt.setText(greenbtn.getText());
            }
        });
        bluebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lay.setBackgroundColor(Color.BLUE);
                txt.setTextColor(Color.WHITE);
                txt.setText(bluebtn.getText());
            }
        });
        yellowbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lay.setBackgroundColor(Color.YELLOW);
                txt.setTextColor(Color.BLACK);
                txt.setText(yellowbtn.getText());
            }
        });
        cyanbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lay.setBackgroundColor(Color.CYAN);
                txt.setTextColor(Color.BLACK);
                txt.setText(cyanbtn.getText());
            }
        });
        magentabtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lay.setBackgroundColor(Color.MAGENTA);
                txt.setTextColor(Color.BLACK);
                txt.setText(magentabtn.getText());
            }
        });

        blackbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lay.setBackgroundColor(Color.BLACK);
                txt.setText(blackbtn.getText());
                txt.setTextColor(Color.WHITE);
            }
        });
        whitebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lay.setBackgroundColor(Color.WHITE);
                txt.setTextColor(Color.BLACK);
                txt.setText(whitebtn.getText());
            }
        });
    }
}