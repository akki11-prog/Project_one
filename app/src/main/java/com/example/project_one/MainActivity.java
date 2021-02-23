package com.example.project_one;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText username, password, result;
    Button submit;
    Random Number;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Variables :

        Button higher_button = (Button) findViewById(R.id.higher);
        Button lower_button = (Button) findViewById(R.id.lower);
        TextView displayResult = (TextView) findViewById(R.id.result_view);
        ImageView user_diceImg= (ImageView) findViewById(R.id.user_dice);
        ImageView computer_diceImg = (ImageView) findViewById(R.id.computer_dice);

        //Higher Button Click event
        higher_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Number = new Random();
                int user_random_result = Number.nextInt(6);
                int computer_random_result = Number.nextInt(6);
                user_random_result = user_random_result + 1;
                computer_random_result = computer_random_result + 1;
                //1 is to specify that we want to perform higher functionality
                String result = compare_str(user_random_result, computer_random_result, 1);

                switch (user_random_result){
                    case 1:
                        //computer_diceImg.setImageResource();
                        user_diceImg.setImageResource(R.drawable.dice1);
                        break;
                    case 2:
                        user_diceImg.setImageResource(R.drawable.dice2);
                        break;
                    case 3:
                        user_diceImg.setImageResource(R.drawable.dice3);
                        break;
                    case 4:
                        user_diceImg.setImageResource(R.drawable.dice4);
                        break;
                    case 5:
                        user_diceImg.setImageResource(R.drawable.dice5);
                        break;
                    case 6:
                        user_diceImg.setImageResource(R.drawable.dice6);
                        break;

                }

                switch (computer_random_result){
                    case 1:
                        //computer_diceImg.setImageResource();
                        computer_diceImg.setImageResource(R.drawable.dice1);
                        break;
                    case 2:
                        computer_diceImg.setImageResource(R.drawable.dice2);
                        break;
                    case 3:
                        computer_diceImg.setImageResource(R.drawable.dice3);
                        break;
                    case 4:
                        computer_diceImg.setImageResource(R.drawable.dice4);
                        break;
                    case 5:
                        computer_diceImg.setImageResource(R.drawable.dice5);
                        break;
                    case 6:
                        computer_diceImg.setImageResource(R.drawable.dice6);
                        break;

                }
                String result_string = String.valueOf(user_random_result);
                displayResult.setText(result);
            }
        });

        //Lower Button click event
        lower_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Number = new Random();
                int user_random_result = Number.nextInt(6);
                int computer_random_result = Number.nextInt(6);
                user_random_result = user_random_result + 1;
                computer_random_result = computer_random_result + 1;
                String result = compare_str(user_random_result, computer_random_result, 2);
                switch (user_random_result){
                    case 1:
                        //computer_diceImg.setImageResource();
                        user_diceImg.setImageResource(R.drawable.dice1);
                        break;
                    case 2:
                        user_diceImg.setImageResource(R.drawable.dice2);
                        break;
                    case 3:
                        user_diceImg.setImageResource(R.drawable.dice3);
                        break;
                    case 4:
                        user_diceImg.setImageResource(R.drawable.dice4);
                        break;
                    case 5:
                        user_diceImg.setImageResource(R.drawable.dice5);
                        break;
                    case 6:
                        user_diceImg.setImageResource(R.drawable.dice6);
                        break;

                }

                switch (computer_random_result){
                    case 1:
                        //computer_diceImg.setImageResource();
                        computer_diceImg.setImageResource(R.drawable.dice1);
                        break;
                    case 2:
                        computer_diceImg.setImageResource(R.drawable.dice2);
                        break;
                    case 3:
                        computer_diceImg.setImageResource(R.drawable.dice3);
                        break;
                    case 4:
                        computer_diceImg.setImageResource(R.drawable.dice4);
                        break;
                    case 5:
                        computer_diceImg.setImageResource(R.drawable.dice5);
                        break;
                    case 6:
                        computer_diceImg.setImageResource(R.drawable.dice6);
                        break;

                }
                String result_string = String.valueOf(user_random_result);
                displayResult.setText(result);
            }
        });
    }

    public  String  compare_str(int user_dice, int computer_dice, int high_low){
        String final_result = "";
        if(high_low == 1){
            if(user_dice == computer_dice){
                //Tie
                final_result = "It’s a tie";
            }else if (user_dice < computer_dice){
                //loose
                final_result = "Computer Win!";
            }else {
                //Win
                final_result = "User Win!";
            }
        }
        if(high_low == 2){
            if(user_dice == computer_dice){
                //Tie
                final_result = "It’s a tie";
            }else if (user_dice > computer_dice){
                //loose
                final_result = "Computer Win!";
            }else {
                //Win
                final_result = "User Win!";
            }
        }
        return  final_result;
    }

}