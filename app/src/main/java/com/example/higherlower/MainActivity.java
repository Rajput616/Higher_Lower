package com.example.higherlower;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Random random = new Random();
    int random_number;
    public void generateRandomNumbers(){
        random_number = random.nextInt(49) + 1;
    }

    public void guessNumber(View view){

        EditText editText = findViewById(R.id.editTextNumber);
        int val = Integer.parseInt(editText.getText().toString());
        if(val < random_number){
            Toast.makeText(this, "Your No. is Lower!", Toast.LENGTH_SHORT).show();
        } else if(val > random_number){
            Toast.makeText(this, "Your No. is Higher!", Toast.LENGTH_SHORT).show();
        } else{
            Toast.makeText(this, "Congratulations !!  You found it", Toast.LENGTH_SHORT).show();
            generateRandomNumbers();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        generateRandomNumbers();

    }
}