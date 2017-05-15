package com.example.windows7.demoandroidapp;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class SettingActivity extends AppCompatActivity {

    Switch sw;
    Button btnApply;
    TextView txtTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//
//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
        txtTitle = (TextView) findViewById(R.id.txtSettings);
        sw = (Switch) findViewById(R.id.swLanguage);
        btnApply = (Button) findViewById(R.id.btnApply);

        btnApply.setOnClickListener(clickListener);
    }

    Locale locale = Locale.ENGLISH;
    View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (view.getId()== R.id.btnApply){

                Configuration configuration = getBaseContext().getResources().getConfiguration();
                if (!sw.isChecked()){
                    locale= new Locale("en");
                    Toast.makeText(getApplication(), "Tiếng Anh", Toast.LENGTH_LONG).show();
                }else {
                    locale = new Locale("vi");
                    Toast.makeText(getApplication(), "Tiếng Việt", Toast.LENGTH_LONG).show();
                }
//                configuration.getLocales().get(0);
                configuration.setLocale(locale);
//                getApplicationContext().createConfigurationContext(configuration);
                getBaseContext().getResources().updateConfiguration(configuration, getBaseContext().getResources().getDisplayMetrics());
                Intent i = new Intent(SettingActivity.this, MainActivity.class);
                startActivity(i);
            }
        }
    };

}
