package com.example.perbanginganapi;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;

public class ChooseImageActivity extends AppCompatActivity {
    private Button rg1,rg2,rg3,rg4,rg5,vg1,vg2,vg3,vg4,vg5,hg1,hg2,hg3,hg4,hg5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_image);

        rg1 = (Button) findViewById(R.id.rgambar10);
        rg1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v){
                rgambar1();
            }
        });

        rg2 = (Button) findViewById(R.id.rgambar50);
        rg2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v){
                rgambar2();
            }
        });

        rg3 = (Button) findViewById(R.id.rgambar100);
        rg3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v){
                rgambar3();
            }
        });

        rg4 = (Button) findViewById(R.id.rgambar150);
        rg4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v){
                rgambar4();
            }
        });

        rg5 = (Button) findViewById(R.id.rgambar200);
        rg5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v){
                rgambar5();
            }
        });

        vg1 = (Button) findViewById(R.id.vgambar10);
        vg1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v){
                vgambar1();
            }
        });

        vg2 = (Button) findViewById(R.id.vgambar50);
        vg2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v){
                vgambar2();
            }
        });

        vg3 = (Button) findViewById(R.id.vgambar100);
        vg3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v){
                vgambar3();
            }
        });

        vg4 = (Button) findViewById(R.id.vgambar150);
        vg4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v){
                vgambar4();
            }
        });

        vg5 = (Button) findViewById(R.id.vgambar200);
        vg5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v){
                vgambar5();
            }
        });

        hg1 = (Button) findViewById(R.id.hgambar10);
        hg1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v){
                hgambar1();
            }
        });

        hg2 = (Button) findViewById(R.id.hgambar50);
        hg2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v){
                hgambar2();
            }
        });

        hg3 = (Button) findViewById(R.id.hgambar100);
        hg3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v){
                hgambar3();
            }
        });

        hg4 = (Button) findViewById(R.id.hgambar150);
        hg4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v){
                hgambar4();
            }
        });

        hg5 = (Button) findViewById(R.id.hgambar200);
        hg5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v){
                hgambar5();
            }
        });
    }

    public void rgambar1(){
        Intent intent = new Intent(this, RetrofitImageActivity.class);
        intent.putExtra("quantity","10");
        startActivity(intent);
    }

    public void rgambar2(){
        Intent intent = new Intent(this, RetrofitImageActivity.class);
        intent.putExtra("quantity","50");
        startActivity(intent);
    }

    public void rgambar3(){
        Intent intent = new Intent(this, RetrofitImageActivity.class);
        intent.putExtra("quantity","100");
        startActivity(intent);
    }

    public void rgambar4(){
        Intent intent = new Intent(this, RetrofitImageActivity.class);
        intent.putExtra("quantity","150");
        startActivity(intent);
    }

    public void rgambar5(){
        Intent intent = new Intent(this, RetrofitImageActivity.class);
        intent.putExtra("quantity","200");
        startActivity(intent);
    }

    public void vgambar1(){
        Intent intent = new Intent(this, VolleyImageActivity.class);
        intent.putExtra("quantity","10");
        startActivity(intent);
    }

    public void vgambar2(){
        Intent intent = new Intent(this, VolleyImageActivity.class);
        intent.putExtra("quantity","50");
        startActivity(intent);
    }

    public void vgambar3(){
        Intent intent = new Intent(this, VolleyImageActivity.class);
        intent.putExtra("quantity","100");
        startActivity(intent);
    }

    public void vgambar4(){
        Intent intent = new Intent(this, VolleyImageActivity.class);
        intent.putExtra("quantity","150");
        startActivity(intent);
    }

    public void vgambar5(){
        Intent intent = new Intent(this, VolleyImageActivity.class);
        intent.putExtra("quantity","200");
        startActivity(intent);
    }

    public void hgambar1(){
        Intent intent = new Intent(this, HttpImageActivity.class);
        intent.putExtra("quantity","10");
        startActivity(intent);
    }

    public void hgambar2(){
        Intent intent = new Intent(this, HttpImageActivity.class);
        intent.putExtra("quantity","50");
        startActivity(intent);
    }

    public void hgambar3(){
        Intent intent = new Intent(this, HttpImageActivity.class);
        intent.putExtra("quantity","100");
        startActivity(intent);
    }

    public void hgambar4(){
        Intent intent = new Intent(this, HttpImageActivity.class);
        intent.putExtra("quantity","150");
        startActivity(intent);
    }

    public void hgambar5(){
        Intent intent = new Intent(this, HttpImageActivity.class);
        intent.putExtra("quantity","200");
        startActivity(intent);
    }

}
