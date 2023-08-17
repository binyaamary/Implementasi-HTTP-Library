package com.example.perbanginganapi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ChooseTextActivity extends AppCompatActivity {
    private Button rt1,rt2,rt3,rt4,rt5,vt1,vt2,vt3,vt4,vt5,ht1,ht2,ht3,ht4,ht5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_text);

        rt1 = (Button) findViewById(R.id.rteks100);
        rt1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v){
                rteks1();
            }
        });

        rt2 = (Button) findViewById(R.id.rteks1000);
        rt2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v){
                rteks2();
            }
        });

        rt3 = (Button) findViewById(R.id.rteks10000);
        rt3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v){
                rteks3();
            }
        });

        rt4 = (Button) findViewById(R.id.rteks100000);
        rt4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v){
                rteks4();
            }
        });

        rt5 = (Button) findViewById(R.id.rteks1000000);
        rt5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v){
                rteks5();
            }
        });

        vt1 = (Button) findViewById(R.id.vteks100);
        vt1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v){
                vteks1();
            }
        });

        vt2 = (Button) findViewById(R.id.vteks1000);
        vt2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v){
                vteks2();
            }
        });

        vt3 = (Button) findViewById(R.id.vteks10000);
        vt3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v){
                vteks3();
            }
        });

        vt4 = (Button) findViewById(R.id.vteks100000);
        vt4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v){
                vteks4();
            }
        });

        vt5 = (Button) findViewById(R.id.vteks1000000);
        vt5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v){
                vteks5();
            }
        });

        ht1 = (Button) findViewById(R.id.hteks100);
        ht1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v){
                hteks1();
            }
        });

        ht2 = (Button) findViewById(R.id.hteks1000);
        ht2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v){
                hteks2();
            }
        });

        ht3 = (Button) findViewById(R.id.hteks10000);
        ht3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v){
                hteks3();
            }
        });

        ht4 = (Button) findViewById(R.id.hteks100000);
        ht4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v){
                hteks4();
            }
        });

        ht5 = (Button) findViewById(R.id.hteks1000000);
        ht5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v){
                hteks5();
            }
        });
    }


    public void rteks1(){
        Intent intent = new Intent(this, RetrofitTextActivity.class);
        intent.putExtra("quantity","100");
        startActivity(intent);
    }

    public void rteks2(){
        Intent intent = new Intent(this, RetrofitTextActivity.class);
        intent.putExtra("quantity","1000");
        startActivity(intent);
    }

    public void rteks3(){
        Intent intent = new Intent(this, RetrofitTextActivity.class);
        intent.putExtra("quantity","10000");
        startActivity(intent);
    }

    public void rteks4(){
        Intent intent = new Intent(this, RetrofitTextActivity.class);
        intent.putExtra("quantity","100000");
        startActivity(intent);
    }

    public void rteks5(){
        Intent intent = new Intent(this, RetrofitTextActivity.class);
        intent.putExtra("quantity","1000000");
        startActivity(intent);
    }

    public void vteks1(){
        Intent intent = new Intent(this, VolleyTextActivity.class);
        intent.putExtra("quantity","100");
        startActivity(intent);
    }

    public void vteks2(){
        Intent intent = new Intent(this, VolleyTextActivity.class);
        intent.putExtra("quantity","1000");
        startActivity(intent);
    }

    public void vteks3(){
        Intent intent = new Intent(this, VolleyTextActivity.class);
        intent.putExtra("quantity","10000");
        startActivity(intent);
    }

    public void vteks4(){
        Intent intent = new Intent(this, VolleyTextActivity.class);
        intent.putExtra("quantity","100000");
        startActivity(intent);
    }

    public void vteks5() {
        Intent intent = new Intent(this, VolleyTextActivity.class);
        intent.putExtra("quantity", "1000000");
        startActivity(intent);
    }

    public void hteks1(){
        Intent intent = new Intent(this, HttpTextActivity.class);
        intent.putExtra("quantity","100");
        startActivity(intent);
    }

    public void hteks2(){
        Intent intent = new Intent(this, HttpTextActivity.class);
        intent.putExtra("quantity","1000");
        startActivity(intent);
    }

    public void hteks3(){
        Intent intent = new Intent(this, HttpTextActivity.class);
        intent.putExtra("quantity","10000");
        startActivity(intent);
    }

    public void hteks4(){
        Intent intent = new Intent(this, HttpTextActivity.class);
        intent.putExtra("quantity","100000");
        startActivity(intent);
    }

    public void hteks5() {
        Intent intent = new Intent(this, HttpTextActivity.class);
        intent.putExtra("quantity", "1000000");
        startActivity(intent);
    }



}
