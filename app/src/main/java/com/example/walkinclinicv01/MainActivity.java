package com.example.walkinclinicv01;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    /*private Button signInButton;
    private Button registerButton;*/

    Button register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.register).setOnClickListener(this);
        findViewById(R.id.signIn).setOnClickListener(this);

    }


    public void checkLogin(){
        //check if account has existed on firebase or not.
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.register:
                startActivity(new Intent(this,RegistrationWindow.class));
                break;
            case R.id.signIn:
                checkLogin();
                startActivity(new Intent(this,WelcomeWindow.class));
                break;

        }

    }
}
