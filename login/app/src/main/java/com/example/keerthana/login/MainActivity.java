package com.example.keerthana.login;

import android.arch.lifecycle.ViewModelStoreOwner;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Newpage(View view){
        Intent startNewActivity=new Intent(this, DisplayMessageActivity.class);
        startActivity(startNewActivity);
    }
}
