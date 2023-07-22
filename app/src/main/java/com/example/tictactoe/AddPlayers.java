package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddPlayers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_players);

        EditText player1 = findViewById(R.id.player1);
        EditText player2 = findViewById(R.id.player2);
        Button startGame = findViewById(R.id.startGame);

        startGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String getPLayer1Name = player1.getText().toString();
                String getPLayer2Name = player2.getText().toString();

                if(getPLayer1Name.isEmpty() || getPLayer2Name.isEmpty()){
                    Toast.makeText(AddPlayers.this, "Please Enter Player Name", Toast.LENGTH_SHORT).show();
                }
                else{
                    Intent intent = new Intent(AddPlayers.this, MainActivity.class);
                    intent.putExtra("player1",getPLayer1Name);
                    intent.putExtra("player2",getPLayer2Name);
                    startActivity(intent);
                }

            }
        });
    }
}