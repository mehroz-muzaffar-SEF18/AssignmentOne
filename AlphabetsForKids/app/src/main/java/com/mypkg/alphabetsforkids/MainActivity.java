package com.mypkg.alphabetsforkids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ShowAlphabet(View view) {
        Intent intent=new Intent(this,ShowAlphabet.class);
        int imageId=R.drawable.aa;
        if(view.getId()==R.id.buttonA)
        {
            imageId=R.drawable.aa;
        }
        else if(view.getId()==R.id.buttonB)
        {
            imageId=R.drawable.bb;
        }
        else if(view.getId()==R.id.buttonC)
        {
            imageId=R.drawable.cc;
        }
        else if(view.getId()==R.id.buttonD)
        {
            imageId=R.drawable.dd;
        }
        else if(view.getId()==R.id.buttonE)
        {
            imageId=R.drawable.ee;
        }
        else if(view.getId()==R.id.buttonF)
        {
            imageId=R.drawable.ff;
        }
        else if(view.getId()==R.id.buttonG)
        {
            imageId=R.drawable.gg;
        }
        else if(view.getId()==R.id.buttonH)
        {
            imageId=R.drawable.hh;
        }
        else if(view.getId()==R.id.buttonI)
        {
            imageId=R.drawable.ii;
        }
        else if(view.getId()==R.id.buttonJ)
        {
            imageId=R.drawable.jj;
        }
        else if(view.getId()==R.id.buttonK)
        {
            imageId=R.drawable.kk;
        }
        else if(view.getId()==R.id.buttonL)
        {
            imageId=R.drawable.ll;
        }
        else if(view.getId()==R.id.buttonM)
        {
            imageId=R.drawable.mm;
        }
        else if(view.getId()==R.id.buttonN)
        {
            imageId=R.drawable.nn;
        }
        else if(view.getId()==R.id.buttonO)
        {
            imageId=R.drawable.oo;
        }
        else if(view.getId()==R.id.buttonP)
        {
            imageId=R.drawable.pp;
        }
        else if(view.getId()==R.id.buttonQ)
        {
            imageId=R.drawable.qq;
        }
        else if(view.getId()==R.id.buttonR)
        {
            imageId=R.drawable.rr;
        }
        else if(view.getId()==R.id.buttonS)
        {
            imageId=R.drawable.ss;
        }
        else if(view.getId()==R.id.buttonT)
        {
            imageId=R.drawable.tt;
        }
        else if(view.getId()==R.id.buttonU)
        {
            imageId=R.drawable.uu;
        }
        else if(view.getId()==R.id.buttonV)
        {
            imageId=R.drawable.vv;
        }
        else if(view.getId()==R.id.buttonW)
        {
            imageId=R.drawable.ww;
        }
        else if(view.getId()==R.id.buttonX)
        {
            imageId=R.drawable.xx;
        }
        else if(view.getId()==R.id.buttonY)
        {
            imageId=R.drawable.yy;
        }
        else if(view.getId()==R.id.buttonZ)
        {
            imageId=R.drawable.zz;
        }
        intent.putExtra("imageId",imageId);
        startActivity(intent);
    }
}