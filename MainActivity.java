package com.example.yoroot.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edt1,edt2;
    //ImageButton ib [3][3] ={{ib1,ib2,ib3},{ib4,ib5,ib6},{ib7,ib8,ib9}};
    ImageButton ib1,ib2,ib3,ib4,ib5,ib6,ib7,ib8,ib9;
      Button bt1,bt2;
    static int player1=0,player2=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       edt1 = (EditText) findViewById(R.id.editText);
        edt2 = (EditText) findViewById(R.id.editText2);

        ib1 = (ImageButton) findViewById(R.id.imageButton1);
        ib2 = (ImageButton) findViewById(R.id.imageButton2);
        ib3 = (ImageButton) findViewById(R.id.imageButton3);
        ib4 = (ImageButton) findViewById(R.id.imageButton4);
        ib5 = (ImageButton) findViewById(R.id.imageButton5);
        ib6 = (ImageButton) findViewById(R.id.imageButton6);
        ib7 = (ImageButton) findViewById(R.id.imageButton7);
        ib8 = (ImageButton) findViewById(R.id.imageButton8);
        ib9 = (ImageButton) findViewById(R.id.imageButton9);

        bt1 = (Button) findViewById(R.id.button);
        bt2 = (Button) findViewById(R.id.button2);

        //ib1.setOnClickListener(new View.OnClickListener() {
        View.OnClickListener listener = new View.OnClickListener() {
            int count = 1;
            //int a[]={0,0,0,0,0,0,0,0,0};
            int a1 = 0, a2 = 0, a3 = 0, a4 = 0, a5 = 0, a6 = 0, a7 = 0, a8 = 0, a9 = 0;
            int b1 = 0, b2 = 0, b3 = 0, b4 = 0, b5 = 0, b6 = 0, b7 = 0, b8 = 0, b9 = 0;
            int res = 5;

            @Override
            public void onClick(View view) {
                if (count % 2 != 0) {

                    switch (view.getId()) {
                        case R.id.imageButton1:
                            ib1.setImageResource(R.drawable.xicon);
                            ib1.setEnabled(false);
                            count++;
                            a1 = res;
                            break;
                        case R.id.imageButton2:
                            ib2.setImageResource(R.drawable.xicon);
                            ib2.setEnabled(false);
                            count++;
                            a2 = res;
                            break;
                        case R.id.imageButton3:
                            ib3.setImageResource(R.drawable.xicon);
                            ib3.setEnabled(false);
                            count++;
                            a3 = res;
                            break;
                        case R.id.imageButton4:
                            ib4.setImageResource(R.drawable.xicon);
                            ib4.setEnabled(false);
                            count++;
                            a4 = res;
                            break;
                        case R.id.imageButton5:
                            ib5.setImageResource(R.drawable.xicon);
                            ib5.setEnabled(false);
                            count++;
                            a5 = res;
                            break;
                        case R.id.imageButton6:
                            ib6.setImageResource(R.drawable.xicon);
                            ib6.setEnabled(false);
                            count++;
                            a6 = res;
                            break;
                        case R.id.imageButton7:
                            ib7.setImageResource(R.drawable.xicon);
                            ib7.setEnabled(false);
                            count++;
                            a7 = res;
                            break;
                        case R.id.imageButton8:
                            ib8.setImageResource(R.drawable.xicon);
                            ib8.setEnabled(false);
                            count++;
                            a8 = res;
                            break;
                        case R.id.imageButton9:
                            ib9.setImageResource(R.drawable.xicon);
                            ib9.setEnabled(false);
                            count++;
                            a9 = res;
                            break;
                        case R.id.button:
                            player1=0;
                            player2=0;
                            edt1.setText(Integer.toString(player1));
                            edt2.setText(Integer.toString(player2));
                            recreate();
                            break;
                        case R.id.button2:
                            finish();
                            break;

                    }
                    if (a1 == 5 && a2 == 5 && a3 == 5) {

                        Toast.makeText(getApplicationContext(),
                                "Player 1 wins", Toast.LENGTH_SHORT).show();

                        player1++;
                        edt1.setText(Integer.toString(player1));
                        recreate();

                    }
                    if (a1 == 5 && a4 == 5 && a7 == 5) {

                        Toast.makeText(getApplicationContext(),
                                "Player 1 wins", Toast.LENGTH_SHORT).show();
                        player1++;
                        edt1.setText(Integer.toString(player1));
                        recreate();

                    }
                    if (a7 == 5 && a8 == 5 && a9 == 5) {

                        Toast.makeText(getApplicationContext(),
                                "Player 1 wins", Toast.LENGTH_SHORT).show();
                        player1++;
                        edt1.setText(Integer.toString(player1));

                        recreate();

                    }
                    if (a3 == 5 && a6 == 5 && a9 == 5) {

                        Toast.makeText(getApplicationContext(),
                                "Player 1 wins", Toast.LENGTH_SHORT).show();
                        player1++;
                        edt1.setText(Integer.toString(player1));

                        recreate();

                    }
                    if (a1 == 5 && a5 == 5 && a9 == 5) {

                        Toast.makeText(getApplicationContext(),
                                "Player 1 wins", Toast.LENGTH_SHORT).show();
                        player1++;
                        edt1.setText(Integer.toString(player1));

                        recreate();

                    }
                    if (a3 == 5 && a5 == 5 && a7 == 5) {

                        Toast.makeText(getApplicationContext(),
                                "Player 1 wins", Toast.LENGTH_SHORT).show();
                        player1++;
                        edt1.setText(Integer.toString(player1));

                        recreate();

                    }
                    if (a2 == 5 && a5 == 5 && a8 == 5) {

                        Toast.makeText(getApplicationContext(),
                                "Player 1 wins", Toast.LENGTH_SHORT).show();
                        player1++;
                        edt1.setText(Integer.toString(player1));

                        recreate();

                    }
                    if (a4 == 5 && a5 == 5 && a6 == 5) {

                        Toast.makeText(getApplicationContext(),
                                "Player 1 wins", Toast.LENGTH_SHORT).show();
                        player1++;
                        edt1.setText(Integer.toString(player1));

                        recreate();
                    }
                    if(count ==10){
                        Toast.makeText(getApplicationContext(),"Game Is Draw",Toast.LENGTH_SHORT).show();
                        recreate();

                    }
                }
                else {
                    switch (view.getId()) {
                        case R.id.imageButton1:
                            ib1.setImageResource(R.drawable.oicon);
                            ib1.setEnabled(false);
                            count++;
                            b1 = 1;
                            break;
                        case R.id.imageButton2:
                            ib2.setImageResource(R.drawable.oicon);
                            ib2.setEnabled(false);
                            count++;
                            b2 = 1;
                            break;
                        case R.id.imageButton3:
                            ib3.setImageResource(R.drawable.oicon);
                            ib3.setEnabled(false);
                            count++;
                            b3 = 1;
                            break;
                        case R.id.imageButton4:
                            ib4.setImageResource(R.drawable.oicon);
                            ib4.setEnabled(false);
                            count++;
                            b4 = 1;
                            break;
                        case R.id.imageButton5:
                            ib5.setImageResource(R.drawable.oicon);
                            ib5.setEnabled(false);
                            count++;
                            b5 = 1;
                            break;
                        case R.id.imageButton6:
                            ib6.setImageResource(R.drawable.oicon);
                            ib6.setEnabled(false);
                            count++;
                            b6 = 1;
                            break;
                        case R.id.imageButton7:
                            ib7.setImageResource(R.drawable.oicon);
                            ib7.setEnabled(false);
                            count++;
                            b7 = 1;
                            break;
                        case R.id.imageButton8:
                            ib8.setImageResource(R.drawable.oicon);
                            ib8.setEnabled(false);
                            count++;
                            b8 = 1;
                            break;
                        case R.id.imageButton9:
                            ib9.setImageResource(R.drawable.oicon);
                            ib9.setEnabled(false);
                            count++;
                            b9 = 1;
                            break;
                        case R.id.button:
                            player1=0;
                            player2=0;
                            edt1.setText(Integer.toString(player1));
                            edt2.setText(Integer.toString(player2));
                            recreate();
                            break;
                        case R.id.button2:
                            finish();
                            break;

                    }
                    if (b1 == 1 && b2 == 1 && b3 == 1) {

                        Toast.makeText(getApplicationContext(),
                                "Player 2 wins", Toast.LENGTH_SHORT).show();
                        player2++;
                        edt2.setText(Integer.toString(player2));
                        recreate();

                    }
                    if (b1 == 1 && b4 == 1 && b7 == 1) {

                        Toast.makeText(getApplicationContext(),
                                "Player 2 wins", Toast.LENGTH_SHORT).show();
                        player2++;
                        edt2.setText(Integer.toString(player2));
                        recreate();

                    }
                    if (b7 == 1 && b8 == 1 && a9 == 1) {

                        Toast.makeText(getApplicationContext(),
                                "Player 2 wins", Toast.LENGTH_SHORT).show();
                        player2++;
                        edt2.setText(Integer.toString(player2));
                        recreate();

                    }
                    if (b3 == 1 && b6 == 1 && b9 == 1) {

                        Toast.makeText(getApplicationContext(),
                                "Player 2 wins", Toast.LENGTH_SHORT).show();
                        player2++;
                        edt2.setText(Integer.toString(player2));
                        recreate();

                    }
                    if (b1 == 1 && b5 == 1 && b9 == 1) {

                        Toast.makeText(getApplicationContext(),
                                "Player 2 wins", Toast.LENGTH_SHORT).show();
                        player2++;
                        edt2.setText(Integer.toString(player2));
                        recreate();

                    }
                    if (b3 == 1 && b5 == 1 && b7 == 1) {

                        Toast.makeText(getApplicationContext(),
                                "Player 2 wins", Toast.LENGTH_SHORT).show();
                        player2++;
                        edt2.setText(Integer.toString(player2));
                        recreate();

                    }
                    if (b2 == 1 && b5 == 1 && b8 == 1) {

                        Toast.makeText(getApplicationContext(),
                                "Player 2 wins", Toast.LENGTH_SHORT).show();
                        player2++;
                        edt2.setText(Integer.toString(player2));
                        recreate();

                    }
                    if (b4 == 1 && b5 == 1 && b6 == 1) {

                        Toast.makeText(getApplicationContext(),
                                "Player 2 wins", Toast.LENGTH_SHORT).show();
                        player2++;
                        edt2.setText(Integer.toString(player2));
                        recreate();
                    }
                }
            }
        };

        ib1.setOnClickListener(listener);
        ib2.setOnClickListener(listener);
        ib3.setOnClickListener(listener);
        ib4.setOnClickListener(listener);
        ib5.setOnClickListener(listener);
        ib6.setOnClickListener(listener);
        ib7.setOnClickListener(listener);
        ib8.setOnClickListener(listener);
        ib9.setOnClickListener(listener);
        bt1.setOnClickListener(listener);
        bt2.setOnClickListener(listener);
    }
}
