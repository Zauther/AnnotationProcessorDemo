package cn.cwiki.android.annotationprocessor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;

import cn.cwiki.android.ap.annotations.BindView;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.testView)
    TextView testView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}