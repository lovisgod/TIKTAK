package com.example.ayooluwa.tiktak;

import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class chooseBoardActivity extends AppCompatActivity {
    private Dialog dialog;
    Button deButton;
    String playername;
    String playername1;
    String playername2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_board);
        playername =(getIntent().getExtras().getString("EdiTtEXTvALUE1"));
        playername1 = (getIntent().getExtras().getString("EdiTtEXTvALUE"));
        playername2 = (getIntent().getExtras().getString("EdiTtEXTvALUE2"));
        Button darshboard = (Button) findViewById(R.id.chooseBoard);
        //set onclick listener to the view
        darshboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog = new Dialog(chooseBoardActivity.this);
                dialog.setContentView(R.layout.dialouge_box);
                dialog.setTitle("WHO'S GAT BRAIN");
                dialog.show();
            }
        });
    }
    public void deButton (View view){
        deButton = (Button)findViewById(R.id.three_board);
        Intent pi = new Intent(chooseBoardActivity.this,MainActivity.class);
        pi.putExtra("EdiTtEXTvALUE1", playername.toString());
        pi.putExtra ("EdiTtEXTvALUE",playername1.toString());
        pi.putExtra ("EdiTtEXTvALUE2",playername2.toString());
        startActivity(pi);
    }
    }

