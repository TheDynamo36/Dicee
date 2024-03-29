package pro.dicee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollButton = findViewById(R.id.rollButton);
        final ImageView leftDice = findViewById(R.id.left_dice);
        final ImageView rightDice = findViewById(R.id.right_dice);
        final int diceArray[] = {
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6
        };

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Dicee", "Button Pressed");
                Random randmonNumber = new Random();
                int number = randmonNumber.nextInt(6);
                Log.d("Dicee", number+"");

                leftDice.setImageResource(diceArray[number]);
                number = randmonNumber.nextInt(6);
                rightDice.setImageResource(diceArray[number]);
            }
        });
    }
}
