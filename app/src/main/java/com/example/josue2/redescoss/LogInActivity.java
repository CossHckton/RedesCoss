package com.example.josue2.redescoss;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.facebook.AccessToken;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.login.LoginManager;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;

import java.util.Arrays;

public class LogInActivity extends AppCompatActivity {
    private TextView textViewLogIn = null;
    private TextView main_textview = null;
    private LoginButton loginButton;
    private CallbackManager callbackManager;
    private AccessToken accessToken = null;
    String token = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
/*
        textViewLogIn = findViewById(R.id.login_textview);
        loginButton = findViewById(R.id.login_button);
        main_textview = findViewById(R.id.main_textview);

        callbackManager = CallbackManager.Factory.create();



        loginButton.setReadPermissions("email");
        // If using in a fragment
        //loginButton.setFragment(this);

        accessToken = AccessToken.getCurrentAccessToken();
        boolean isLoggedIn = accessToken != null && !accessToken.isExpired();
        LoginManager.getInstance().logInWithReadPermissions(this, Arrays.asList("public_profile"));

        token = String.valueOf(accessToken);

        // Callback registration
        loginButton.registerCallback(callbackManager, new FacebookCallback<LoginResult>() {
            @Override
            public void onSuccess(LoginResult loginResult) {
                textViewLogIn.setText("Ingresó con su cuenta de Facebook");
                main_textview.setText("TOKEN:  " +  accessToken.getToken());
                goLoggedInActivity();
            }

            @Override
            public void onCancel() {
                textViewLogIn.setText("Cancelado");
                Toast.makeText(getApplicationContext(), "Cancelado", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onError(FacebookException exception) {
                textViewLogIn.setText("Error al ingresar con su cuenta de usuario");
                Toast.makeText(getApplicationContext(), "Error al ingresar con su cuenta de usuario", Toast.LENGTH_SHORT).show();
            }
        });
        */
/*///
        LoginManager.getInstance().registerCallback(callbackManager, new FacebookCallback<LoginResult>() {
            @Override
            public void onSuccess(LoginResult loginResult) {
                // App code
            }

            @Override
            public void onCancel() {
                // App code
            }

            @Override
            public void onError(FacebookException exception) {
                // App code
            }
        });
*/
/*    }

    private void goLoggedInActivity (){
        Intent intent2 = new Intent( this, MainActivity.class );
        intent2.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP  | Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivityForResult(intent2, 0);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        callbackManager.onActivityResult(requestCode, resultCode, data);
        super.onActivityResult(requestCode, resultCode, data);
        callbackManager.onActivityResult(requestCode, resultCode, data);
*/
    }

}

