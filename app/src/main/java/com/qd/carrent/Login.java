package com.qd.carrent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.util.Pair;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputLayout;

public class Login extends AppCompatActivity {
    Button bsignup, bgo;
    ImageView logo_image;
    TextView logo_name, slogan_name;
    TextInputLayout username, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_login);

        bsignup = findViewById(R.id.bsignup);
        bgo = findViewById(R.id.bgo);
        logo_image = findViewById(R.id.logo_image);
        logo_name = findViewById(R.id.logo_name);
        slogan_name = findViewById(R.id.slogan_name);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);


        bsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login.this, SignUp.class);

                Pair[] pairs = new Pair[7];

                pairs[0] = new Pair<View, String>(logo_image, "logo_image");
                pairs[1] = new Pair<View, String>(logo_name, "logo_text");
                pairs[2] = new Pair<View, String>(slogan_name, "slogan_text");
                pairs[3] = new Pair<View, String>(username, "username_trans");
                pairs[4] = new Pair<View, String>(password, "password_trans");
                pairs[5] = new Pair<View, String>(bgo, "go_trans");
                pairs[6] = new Pair<View, String>(bsignup, "signuplogin_trans");

                ActivityOptionsCompat optionsCompat = ActivityOptionsCompat.makeSceneTransitionAnimation(Login.this, pairs);
                startActivity(intent, optionsCompat.toBundle());
            }
        });
    }
}