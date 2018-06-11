package com.example.myfistapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view){
        //Do something in response to button
        Intent intent = new Intent(this, DisplayMessageActivity.class);

        EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString();

        EditText editText6 = (EditText) findViewById(R.id.editText2);
        String message6 = editText6.getText().toString();

        if(!message.equals("") && !message6.equals("")){
            intent.putExtra("PLAYER1", message);
            intent.putExtra("PLAYER2", message6);

            startActivity(intent);
        }

        else{
            Context context = getApplicationContext();
            CharSequence text = "Fill all players names!";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }



    }

}
