package com.example.shoppingcart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void launchShooterActivity(View view){
        Intent intent = new Intent(this, Shooter.class);
        startActivity(intent);
    }
    public void launchOpenWorldActivity(View view){
        Intent intent = new Intent(this, OpenWorld.class);
        startActivity(intent);
    }
    public void launchRPGActivity(View view){
        Intent intent = new Intent(this, RPG.class);
        startActivity(intent);
    }
    public void launchShoppingCartActivity(View view){
        Intent intent = new Intent(this, ShoppingCart.class);
        startActivity(intent);
    }
    public void onActivityResult(int requestCode,
                                 int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

}
}
