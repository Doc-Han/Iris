package com.banana.iris;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Index extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);
    }

    public void toLogin(View view){
        Intent intent = new Intent(this, Login.class);
        startActivity(intent);
    }

    public void toRegister(View view){
        Intent intent = new Intent(this, Register.class);
        startActivity(intent);
    }

}
