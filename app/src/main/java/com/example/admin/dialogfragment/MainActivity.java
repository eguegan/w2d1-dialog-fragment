package com.example.admin.dialogfragment;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity implements BlankFragment.ActivityCallback {
    private static  final String BLANK_FRAGMENT_TAG = "TAG";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    
    public void openDialog(View view) {
        FragmentManager fm = getSupportFragmentManager();
        BlankFragment bf = new BlankFragment();

        bf.show(fm, BLANK_FRAGMENT_TAG);
    }

    @Override
    public void buttonClick() {
        Log.d("TAG", "buttonClick: Button inside Fragment clicked.");
    }
}
