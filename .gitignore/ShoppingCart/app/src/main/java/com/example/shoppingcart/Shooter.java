package com.example.shoppingcart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Shooter extends AppCompatActivity {
    public Button CodButton;
    public Button fortniteButton;
    public Button csgoButton;
    public static final String extraCod = "com.example.android.ShoppingCart.extra.MESSAGE";
    public static final String extraFortnite= "com.example.android.ShoppingCart.extra.MESSAGE";
    public static final String extraCsgo = "com.example.android.ShoppingCart.extra.MESSAGE";
    public int callOfDuty = 0;
    public int fortnite = 0;
    public int csgo = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shooter);
       CodButton = (Button) findViewById(R.id.buyCodButton);
       fortniteButton = (Button) findViewById(R.id.buyFortniteButton);
       csgoButton = (Button) findViewById(R.id.buyCsgoButton);
    }
    public void add(View view){
        Intent intent = new Intent(this, ShoppingCart.class);
        intent.putExtra(extraCod, callOfDuty);
        intent.putExtra(extraFortnite, fortnite);
        intent.putExtra(extraCsgo, csgo);
    }
    public void buyCod(View view){
        callOfDuty++;
      add(view);
    }
    public void buyFortnite(View view){
        fortnite++;
        add(view);
    }
    public void buyCsgo(View view){
        csgo++;
        add(view);
    }
    public void returnValue(View view){
        Intent replyIntent = new Intent();
        replyIntent.putExtra(extraCod, callOfDuty);
        replyIntent.putExtra(extraFortnite, fortnite);
        replyIntent.putExtra(extraCsgo, csgo);
        setResult(RESULT_OK, replyIntent);
        finish();

    }
    public void goBack(View view){
        Intent intent = new Intent(this, MainActivity.class);

        startActivity(intent);
    }

}
