package com.example.kushal.tictactoe;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b1, b2, b3, b4, b5, b6, b7, b8, b9;
    TextView res;
    public int x = 1;
    public int f[] = new int[10];

    public int changeTurn(int a) {
        return (a == 1) ? 2 : 1;
    }

    public int checkWin(int a[]) {
        int i,flag=0;
        for (i = 1; i <= 3; i++) {
            if (a[i] == a[i + 3] && a[i] == a[i + 6] && a[i] != 0)
                return 1;
        }
        for (i = 1; i <= 7; i = i + 3) {
            if (a[i] == a[i + 1] && a[i] == a[i + 2] && a[i] != 0)
                return 1;
        }
        if (a[1] == a[5] && a[1] == a[9] && a[1] != 0)
            return 1;
        else if (a[3] == a[5] && a[5] == a[7] && a[3] != 0)
            return 1;
        else
            return 0;
    }

    public String chToColor(int x)
    {
        return (x==1) ? "RED":"BLUE";
    }

    public void winCon()
    {
        b1.setEnabled(false);
        b2.setEnabled(false);
        b3.setEnabled(false);
        b4.setEnabled(false);
        b5.setEnabled(false);
        b6.setEnabled(false);
        b7.setEnabled(false);
        b8.setEnabled(false);
        b9.setEnabled(false);

    }

    public int drawCon(int a[])
    {
        int i,flag=0;
        for(i=1;i<10;i++)
        {
            if(f[i]!=0)
                flag++;
        }
        if(flag==9)
            return 1;
        else
            return 0;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button) findViewById(R.id.B1);
        b2 = (Button) findViewById(R.id.B2);
        b3 = (Button) findViewById(R.id.B3);
        b4 = (Button) findViewById(R.id.B4);
        b5 = (Button) findViewById(R.id.B5);
        b6 = (Button) findViewById(R.id.B6);
        b7 = (Button) findViewById(R.id.B7);
        b8 = (Button) findViewById(R.id.B8);
        b9 = (Button) findViewById(R.id.B9);
        res = (TextView) findViewById(R.id.result);


        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_IMMERSIVE
                        | View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN);

        for(int i:f)
            i = 0;



        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(x==1)
                {
                    b1.setBackgroundColor(Color.rgb(240,10,10));
                    b1.setText("X");
                }
                else
                {
                    b1.setBackgroundColor(Color.rgb(10,120,250));
                    b1.setText("O");
                }
                b1.setEnabled(false);
                f[1] = x;
                if(checkWin(f)==1)
                {
                    res.setText("The "+chToColor(x)+" Player has won");
                    winCon();
                }
                else if(drawCon(f)==1)
                    res.setText("DRAW");
                else
                    res.setText(chToColor(changeTurn(x))+" Player's Turn Next");
                x = changeTurn(x);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(x==1)
                {
                    b2.setBackgroundColor(Color.rgb(240,10,10));
                    b2.setText("X");
                }
                else
                {
                    b2.setBackgroundColor(Color.rgb(10,120,250));
                    b2.setText("O");
                }
                b2.setEnabled(false);
                f[2] = x;
                if(checkWin(f)==1)
                {
                    res.setText("The "+chToColor(x)+" Player has won");
                    winCon();
                }
                else if(drawCon(f)==1)
                    res.setText("DRAW");
                else
                    res.setText(chToColor(changeTurn(x))+" Player's Turn Next");
                x = changeTurn(x);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(x==1)
                {
                    b3.setBackgroundColor(Color.rgb(240,10,10));
                    b3.setText("X");
                }
                else
                {
                    b3.setBackgroundColor(Color.rgb(10,120,250));
                    b3.setText("O");
                }
                b3.setEnabled(false);
                f[3] = x;
                if(checkWin(f)==1)
                {
                    res.setText("The "+chToColor(x)+" Player has won");
                    winCon();
                }
                else if(drawCon(f)==1)
                    res.setText("DRAW");
                else
                    res.setText(chToColor(changeTurn(x))+" Player's Turn Next");
                x = changeTurn(x);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(x==1)
                {
                    b4.setBackgroundColor(Color.rgb(240,10,10));
                    b4.setText("X");
                }
                else
                {
                    b4.setBackgroundColor(Color.rgb(10,120,250));
                    b4.setText("O");
                }
                b4.setEnabled(false);
                f[4] = x;
                if(checkWin(f)==1)
                {
                    res.setText("The "+chToColor(x)+" Player has won");
                    winCon();
                }
                else if(drawCon(f)==1)
                    res.setText("DRAW");
                else
                    res.setText(chToColor(changeTurn(x))+" Player's Turn Next");
                x = changeTurn(x);
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(x==1)
                {
                    b5.setBackgroundColor(Color.rgb(240,10,10));
                    b5.setText("X");
                }
                else
                {
                    b5.setBackgroundColor(Color.rgb(10,120,250));
                    b5.setText("O");
                }
                b5.setEnabled(false);
                f[5] = x;
                if(checkWin(f)==1)
                {
                    res.setText("The "+chToColor(x)+" Player has won");
                    winCon();
                }
                else if(drawCon(f)==1)
                    res.setText("DRAW");
                else
                    res.setText(chToColor(changeTurn(x))+" Player's Turn Next");
                x = changeTurn(x);
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(x==1)
                {
                    b6.setBackgroundColor(Color.rgb(240,10,10));
                    b6.setText("X");
                }
                else
                {
                    b6.setBackgroundColor(Color.rgb(10,120,250));
                    b6.setText("O");
                }
                b6.setEnabled(false);
                f[6] = x;
                if(checkWin(f)==1)
                {
                    res.setText("The "+chToColor(x)+" Player has won");
                    winCon();
                }
                else if(drawCon(f)==1)
                    res.setText("DRAW");
                else
                    res.setText(chToColor(changeTurn(x))+" Player's Turn Next");
                x = changeTurn(x);
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(x==1)
                {
                    b7.setBackgroundColor(Color.rgb(240,10,10));
                    b7.setText("X");
                }
                else
                {
                    b7.setBackgroundColor(Color.rgb(10,120,250));
                    b7.setText("O");
                }
                b7.setEnabled(false);
                f[7] = x;
                if(checkWin(f)==1)
                {
                    res.setText("The "+chToColor(x)+" Player has won");
                    winCon();
                }
                else if(drawCon(f)==1)
                    res.setText("DRAW");
                else
                    res.setText(chToColor(changeTurn(x))+" Player's Turn Next");
                x = changeTurn(x);
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(x==1)
                {
                    b8.setBackgroundColor(Color.rgb(240,10,10));
                    b8.setText("X");
                }
                else
                {
                    b8.setBackgroundColor(Color.rgb(10,120,250));
                    b8.setText("O");
                }
                b8.setEnabled(false);
                f[8] = x;
                if(checkWin(f)==1)
                {
                    res.setText("The "+chToColor(x)+" Player has won");
                    winCon();
                }
                else if(drawCon(f)==1)
                    res.setText("DRAW");
                else
                    res.setText(chToColor(changeTurn(x))+" Player's Turn Next");
                x = changeTurn(x);
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(x==1)
                {
                    b9.setBackgroundColor(Color.rgb(240,10,10));
                    b9.setText("X");
                }
                else
                {
                    b9.setBackgroundColor(Color.rgb(10,120,250));
                    b9.setText("O");
                }
                b9.setEnabled(false);
                f[9] = x;
                if(checkWin(f)==1)
                {
                    res.setText("The "+chToColor(x)+" Player has won");
                    winCon();
                }
                else if(drawCon(f)==1)
                    res.setText("DRAW");
                else
                    res.setText(chToColor(changeTurn(x))+" Player's Turn Next");
                x = changeTurn(x);
            }
        });
    }
}