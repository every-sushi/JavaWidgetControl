package rlaskfud0515.kr.hs.emirim.javawidgetcontrol;

import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView text1 = (TextView) findViewById(R.id.text1);
        TextView text2 = (TextView) findViewById(R.id.text2);
        TextView text3 = (TextView) findViewById(R.id.text3);
        TextView text4 = (TextView) findViewById(R.id.text4);

        text1.setText("밈재보고시ㄸㅏ~!~! 갈걸....그때 직관 갔으면 만날 수 있는건데..");
        text1.setTextSize(30);
        text1.setBackgroundColor(Color.LTGRAY);
        text1.setTextColor(Color.BLACK);

        text2.setText(R.string.text2_str);
        text2.setTypeface(Typeface.SANS_SERIF, Typeface.BOLD_ITALIC);

        text3.setWidth(20);
        text3.setTextScaleX(2);


        text4.setBackgroundColor(Color.MAGENTA);
        text1.setTextSize(60);
    }
}
