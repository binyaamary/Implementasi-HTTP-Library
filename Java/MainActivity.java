package com.example.perbanginganapi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button teks,gambar;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        teks = (Button) findViewById(R.id.btteks);
        teks.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v){
                teksv();
            }
        });

        gambar = (Button) findViewById(R.id.btgambar);
        gambar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v){
                gambarv();
            }
        });
    }

    public void teksv(){
        Intent intent = new Intent(this, ChooseTextActivity.class);
        startActivity(intent);
    }

    public void gambarv(){
        Intent intent = new Intent(this, ChooseImageActivity.class);
        startActivity(intent);
    }

}
