package com.example.fbreaderdemo;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import org.geometerplus.android.fbreader.FBReader;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startActivity(new Intent(this, FBReader.class));
        this.finish();
    }


}
