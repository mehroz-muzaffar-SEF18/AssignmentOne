package com.mypkg.alphabetsforkids;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ShowAlphabet extends AppCompatActivity {

    ImageView imgView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_alphabet);
        imgView=findViewById(R.id.LetterImage);
        imgView.setImageResource(getIntent().getExtras().getInt("imageId"));
    }

    public void RotateAnimation(View view) {
        view.animate().rotation(360).setDuration(500);
    }
}