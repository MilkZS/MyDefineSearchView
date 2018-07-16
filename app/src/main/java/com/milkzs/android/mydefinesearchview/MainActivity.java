package com.milkzs.android.mydefinesearchview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.google.android.flexbox.FlexboxLayout;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search_tag);
        FlexboxLayout flexboxLayout = findViewById(R.id.float_layout_search_tag);
        for(int i=0;i<12;i++){
            TextView textView = new TextView(this);
            textView.setText("阿萨法发");
            flexboxLayout.addView(textView);
        }
    }
}
