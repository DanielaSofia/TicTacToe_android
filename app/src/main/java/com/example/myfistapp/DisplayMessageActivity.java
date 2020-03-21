package com.example.myfistapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class DisplayMessageActivity extends AppCompatActivity {

    int playersTurn =1;

    TextView edt3 = findViewById(R.id.textView5);
    TextView edt4 = findViewById(R.id.textView8);

    Button but16 = findViewById(R.id.button16);
    Button but23 =  findViewById(R.id.button23);
    Button but25 =  findViewById(R.id.button25);
    Button but22 =  findViewById(R.id.button22);
    Button but17 =  findViewById(R.id.button17);
    Button but2 =  findViewById(R.id.button2);
    Button but19 =  findViewById(R.id.button19);
    Button but18 = findViewById(R.id.button18);
    Button but20 = findViewById(R.id.button20);

    String p1 = edt3.getText().toString();
    String p2 = edt4.getText().toString();
    String but17s = but17.getText().toString();
    String but16s = but16.getText().toString();
    String but25s = but25.getText().toString();
    String but23s = but23.getText().toString();
    String but22s = but22.getText().toString();
    String but2s = but2.getText().toString();
    String but19s = but19.getText().toString();
    String but18s = but18.getText().toString();
    String but20s = but20.getText().toString();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        p1 = intent.getStringExtra("PLAYER1");
        p2 = intent.getStringExtra("PLAYER2");


        // Capture the layout's TextView and set the string as its text
        TextView textView2 = findViewById(R.id.textView2);
        TextView textView6 = findViewById(R.id.textView6);

        textView2.setText(p1);
        textView6.setText(p2);

    }

    public void somaPontos(String jog){
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(getApplicationContext(), jog + "ganhou!", duration);
        toast.show();
        Integer res = Integer.parseInt(jog)+1;
        String ts = Integer.toString(res);

        if(jog.equals(p1)) edt3.setText(ts);
        else edt4.setText(ts);
    }

    public void onPlay16(View view){

        if ((but16s.equals("X")) || but16s.equals("O")) {

            //Horizontal
            if (but23s.equals(but16s) && (but23s.equals(but25s))) {

                if (but16s.equals("X")) somaPontos(p1);
                else somaPontos(p2);
            }

            //vertical
            if (but16s.equals(but22s) && (but16s.equals(but2s))) {

                if (but16s.equals("X")) {
                    somaPontos(p1);
                } else  somaPontos(p2);

            }

            //Diagonal
            if (but16s.equals(but17s) && (but16s.equals(but19s))) {

                if (but16s.equals("X")) {
                    somaPontos(p1);
                } else {
                    if (but16s.equals("O")) {
                        somaPontos(p2);
                    }
                }
            }

        }else {
            if (playersTurn == 1) {
                but16.setText("X");
                playersTurn = 2;
            } else {
                but16.setText("O");
                playersTurn = 1;
            }
        }

    }


    public void onPlay23(View view) {


        if ((but23s.equals("X")) || but23s.equals("O")) {

            //Horizontal
            if (but23s.equals(but16s) && (but23s.equals(but25s))) {

                if (but23s.equals("X")) {
                    somaPontos(p1);
                } else {
                        somaPontos(p2);
                }
            }

            //vertical
            if (but23s.equals(but17s) && (but17s.equals(but18s))) {

                if (but23s.equals("X")) {
                    somaPontos(p1);
                } else {
                    if (but23s.equals("O")) {
                        somaPontos(p2);
                    }
                }
            }


        } else {
            if (playersTurn == 1) {
                but23.setText("X");
                playersTurn = 2;
            } else {
                but23.setText("O");
                playersTurn = 1;
            }
        }

    }

    public void onPlay25(View view) {


        if ((but25s.equals("X")) || but25s.equals("O")) {

            //Horizontal
            if (but25s.equals(but23s) && (but23s.equals(but16s))) {

                if (but25s.equals("X"))  somaPontos(p1);
                else somaPontos(p2);
            }
            //vertical
            if (but25s.equals(but20s) && (but20s.equals(but19s))) {
                if (but25s.equals("X")) somaPontos(p1);
                 else somaPontos(p2);
            }

            //Diagonal
            if (but25s.equals(but17s) && (but17s.equals(but2s))) {

                if (but25s.equals("X"))
                    somaPontos(p1);
                 else somaPontos(p2);
            }
        }else {
            if (playersTurn == 1) {
                but25.setText("X");
                playersTurn = 2;
            } else {
                but25.setText("O");
                playersTurn = 1;
            }

        }

    }

    public void onPlay22(View view){

        if((but22s.equals("X")) || but22s.equals("O")) {

            //Horizontal
            if (but22s.equals(but17s) && (but17s.equals(but20s))) {

                if (but22s.equals("X")) {
                    somaPontos(p1);
                } else {
                    if (but22s.equals("O")) {
                        somaPontos(p2);

                    }
                }
            }

            //vertical
            if (but22s.equals(but16s) && (but16s.equals(but2s))) {

                if (but22s.equals("X")) {
                    somaPontos(p1);
                } else {
                    if (but22s.equals("O")) {
                        somaPontos(p2);
                    }
                }
            }
        }else {
            if (playersTurn == 1) {
                but22.setText("X");
                playersTurn = 2;
            } else {
                but22.setText("O");
                playersTurn = 1;
            }
        }

    }


    public void onPlay17(View view){


        TextView edt3 = findViewById(R.id.textView5);
        TextView edt4 = findViewById(R.id.textView8);



        int duration = Toast.LENGTH_SHORT;

        if((but17s.equals("X")) || but17s.equals("O")) {

            //Horizontal
            if (but17s.equals(but22s) && (but22s.equals(but20s))) {

                if (but17s.equals("X")) {
                    somaPontos(p1);
                } else {
                    if (but17s.equals("O")) {
                        somaPontos(p2);
                    }
                }
            }

            //vertical
            if (but23s.equals(but17s) && (but17s.equals(but18s))) {

                if (but17s.equals("X")) {
                    somaPontos(p1);

                } else {
                    if (but17s.equals("O")) {
                        somaPontos(p2);

                    }
                }
            }

            //Diagonal esquerda
            if (but16s.equals(but17s) && (but16s.equals(but19s))) {

                if (but17s.equals("X")) {
                    Toast toast = Toast.makeText(getApplicationContext(), p1 + "ganhou!", duration);
                    toast.show();
                    int res = Integer.parseInt(p1)+1;
                    String ts=Integer.toString(res);
                    edt3.setText(ts);
                } else {
                    if (but17s.equals("O")) {
                        Toast toast = Toast.makeText(getApplicationContext(), p2 + "ganhou!", duration);
                        toast.show();
                        int res = Integer.parseInt(p2)+1;
                        String ts=Integer.toString(res);
                        edt4.setText(ts);
                    }
                }
            }

            //Diagonal direita
            if (but25s.equals(but17s) && (but17s.equals(but2s))) {

                if (but17s.equals("X")) {
                    Toast toast = Toast.makeText(getApplicationContext(), p1 + "ganhou!", duration);
                    toast.show();
                    int res = Integer.parseInt(p1)+1;
                    String ts=Integer.toString(res);
                    edt3.setText(ts);
                } else {
                    if (but17s.equals("O")) {
                        Toast toast = Toast.makeText(getApplicationContext(), p2 + "ganhou!", duration);
                        toast.show();
                        int res = Integer.parseInt(p2)+1;
                        String ts=Integer.toString(res);
                        edt4.setText(ts);
                    }
                }
            }
        }else {

            if (playersTurn == 1) {
                but17.setText("X");
                playersTurn = 2;
            } else {
                but17.setText("O");
                playersTurn = 1;
            }
        }

    }


    public void onPlay20(View view){


        TextView edt3 = findViewById(R.id.textView5);
        TextView edt4 = findViewById(R.id.textView8);

        int duration = Toast.LENGTH_SHORT;

        if((but20s.equals("X")) || but20s.equals("O")) {

            //Horizontal
            if (but20s.equals(but17s) && (but20s.equals(but22s))) {

                if (but20s.equals("X")) {
                    somaPontos(p1);

                } else {
                        somaPontos(p2);
                }
            }

            //vertical
            if (but20s.equals(but25s) && (but25s.equals(but19s))) {

                if (but20s.equals("X")) {
                    somaPontos(p1);

                } else {
                    if (but20s.equals("O")) {
                        somaPontos(p2);

                    }
                }
            }
        }else {
            if (playersTurn == 1) {
                but20.setText("X");
                playersTurn = 2;
            } else {
                but20.setText("O");
                playersTurn = 1;
            }
        }
    }


    public void onPlay2(View view){


        TextView edt3 = findViewById(R.id.textView5);
        TextView edt4 = findViewById(R.id.textView8);


        int duration = Toast.LENGTH_SHORT;

        if((but2s.equals("X")) || but2s.equals("O")) {

            //Horizontal
            if (but2s.equals(but18s) && (but18s.equals(but19s))) {

                if (but2s.equals("X")) {
                    Toast toast = Toast.makeText(getApplicationContext(), p1 + "ganhou!", duration);
                    toast.show();
                    int res = Integer.parseInt(p1)+1;
                    String ts=Integer.toString(res);
                    edt3.setText(ts);
                } else {
                    if (but2s.equals("O")) {
                        Toast toast = Toast.makeText(getApplicationContext(), p2 + "ganhou!", duration);
                        toast.show();
                        int res = Integer.parseInt(p2)+1;
                        String ts=Integer.toString(res);
                        edt4.setText(ts);
                    }
                }
            }

            //vertical
            if (but2s.equals(but22s) && (but22s.equals(but16s))) {

                if (but2s.equals("X")) {
                    Toast toast = Toast.makeText(getApplicationContext(), p1 + "ganhou!", duration);
                    toast.show();
                  //  int res = Integer.parseInt(p1)+1;
                   // String ts=Integer.toString(res);
                  //  edt3.setText(ts);
                } else {
                    if (but2s.equals("O")) {
                        Toast toast = Toast.makeText(getApplicationContext(), p2 + "ganhou!", duration);
                        toast.show();
                        int res = Integer.parseInt(p2)+1;
                        String ts=Integer.toString(res);
                        edt4.setText(ts);
                    }
                }
            }

            //Diagonal
            if (but25s.equals(but17s) && (but17s.equals(but2s))) {

                if (but2s.equals("X")) {
                    Toast toast = Toast.makeText(getApplicationContext(), p1 + "ganhou!", duration);
                    toast.show();
                    int res = Integer.parseInt(p1)+1;
                    String ts=Integer.toString(res);
                    edt3.setText(ts);
                } else {
                    if (but2s.equals("O")) {
                        Toast toast = Toast.makeText(getApplicationContext(), p2 + "ganhou!", duration);
                        toast.show();
                        int res = Integer.parseInt(p2)+1;
                        String ts=Integer.toString(res);
                        edt4.setText(ts);
                    }
                }
            }
        }else {
            if (playersTurn == 1) {
                but2.setText("X");
                playersTurn = 2;
            } else {
                but2.setText("O");
                playersTurn = 1;
            }
        }

    }


    public void onPlay18(View view){

        if((but18s.equals("X")) || but18s.equals("O")) {

            //Horizontal
            if (but2s.equals(but18s) && (but18s.equals(but19s))) {

                if (but18s.equals("X")) {
                    somaPontos(p1);

                } else {
                        somaPontos(p2);
                }
            }

            //vertical
            if (but23s.equals(but17s) && (but17s.equals(but18s))) {

                if (but18s.equals("X")) {
                    somaPontos(p1);

                } else {
                    if (but18s.equals("O")) {
                        somaPontos(p2);
                    }
                }
            }
        }else {
            if (playersTurn == 1) {
                but18.setText("X");
                playersTurn = 2;
            } else {
                but18.setText("O");
                playersTurn = 1;
            }
        }

    }


    public void onPlay19(View view){

        //Horizontal
        if((but19s.equals("X")) || but19s.equals("O")) {

            if (but2s.equals(but18s) && (but18s.equals(but19s))) {
                if (but19s.equals("X")) {
                    somaPontos(p1);
                } else   somaPontos(p2);
            }

            //vertical
            if (but19s.equals(but20s) && (but20s.equals(but25s))) {

                if (but19s.equals("X")) {
                    somaPontos(p1);
                } else {
                    if (but19s.equals("O")) {
                        somaPontos(p2);
                    }
                }
            }

            //Diagonal
            if (but19s.equals(but17s) && (but16s.equals(but19s))) {

                if (but19s.equals("X")) {
                    somaPontos(p1);
                } else {
                    if (but19s.equals("O")) {
                        somaPontos(p2);
                    }
                }
            }
        }else {
            if (playersTurn == 1) {
                but19.setText("X");
                playersTurn = 2;
            } else {
                but19.setText("O");
                playersTurn = 1;
            }

        }
    }


}

