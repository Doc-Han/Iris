package com.banana.iris;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    private TextView phone,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        phone = (TextView)findViewById(R.id.l_phone);
        password = (TextView)findViewById(R.id.l_password);

    }

    public void validate(View view){
        String getPhone = phone.getText().toString();
        String getPassword = password.getText().toString();
        success();
        /*
        if(getPhone.equals("0558359341") && getPassword.equals("allah")){
            success();
        }else{
            Toast.makeText(this, "Phone/Password Incorrect", Toast.LENGTH_LONG).show();
        }*/
    }

    public void success(){
        Intent intent = new Intent(this, goals.class);
        startActivity(intent);
    }

}
