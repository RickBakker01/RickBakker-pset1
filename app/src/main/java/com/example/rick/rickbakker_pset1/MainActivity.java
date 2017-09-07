package com.example.rick.rickbakker_pset1;

import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    CheckBox cb1, cb2, cb3, cb4, cb5, cb6, cb7, cb8, cb9, cb10;
    ImageView iv1, iv2, iv3, iv4, iv5, iv6, iv7, iv8, iv9, iv10;
    private static final String ALL_VISIBILITIES = "all_visibilities";
    private static final int BODY_PARTS = 10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cb1 = (CheckBox) findViewById(R.id.checkBoxEars);
        cb2 = (CheckBox) findViewById(R.id.checkBoxArms);
        cb3 = (CheckBox) findViewById(R.id.checkBoxEyebrows);
        cb4 = (CheckBox) findViewById(R.id.checkBoxEyes);
        cb5 = (CheckBox) findViewById(R.id.checkBoxGlasses);
        cb6 = (CheckBox) findViewById(R.id.checkBoxHat);
        cb7 = (CheckBox) findViewById(R.id.checkBoxMouth);
        cb8 = (CheckBox) findViewById(R.id.checkBoxMoustache);
        cb9 = (CheckBox) findViewById(R.id.checkBoxNose);
        cb10 = (CheckBox) findViewById(R.id.checkBoxShoes);
        iv1 = (ImageView) findViewById(R.id.Ears);
        iv2 = (ImageView) findViewById(R.id.Arms);
        iv3 = (ImageView) findViewById(R.id.Eyebrows);
        iv4 = (ImageView) findViewById(R.id.Eyes);
        iv5 = (ImageView) findViewById(R.id.Glasses);
        iv6 = (ImageView) findViewById(R.id.Hat);
        iv7 = (ImageView) findViewById(R.id.Mouth);
        iv8 = (ImageView) findViewById(R.id.Moustache);
        iv9 = (ImageView) findViewById(R.id.Nose);
        iv10 = (ImageView) findViewById(R.id.Shoes);
    }

    public void Ears(View v) {
        if (cb1.isChecked()) {
            iv1.setVisibility(View.VISIBLE);
        } else {
            iv1.setVisibility(View.INVISIBLE);
        }
    }

    public void Arms(View v) {
        if (cb2.isChecked()) {
            iv2.setVisibility(View.VISIBLE);
        } else {
            iv2.setVisibility(View.INVISIBLE);
        }
    }

    public void Eyebrows(View v) {
        if (cb3.isChecked()) {
            iv3.setVisibility(View.VISIBLE);
        } else {
            iv3.setVisibility(View.INVISIBLE);
        }
    }

    public void Eyes(View v) {
        if (cb4.isChecked()) {
            iv4.setVisibility(View.VISIBLE);
        } else {
            iv4.setVisibility(View.INVISIBLE);
        }
    }

    public void Glasses(View v) {
        if (cb5.isChecked()) {
            iv5.setVisibility(View.VISIBLE);
        } else {
            iv5.setVisibility(View.INVISIBLE);
        }
    }

    public void Hat(View v) {
        if (cb6.isChecked()) {
            iv6.setVisibility(View.VISIBLE);
        } else {
            iv6.setVisibility(View.INVISIBLE);
        }
    }

    public void Mouth(View v) {
        if (cb7.isChecked()) {
            iv7.setVisibility(View.VISIBLE);
        } else {
            iv7.setVisibility(View.INVISIBLE);
        }
    }

    public void Moustache(View v) {
        if (cb8.isChecked()) {
            iv8.setVisibility(View.VISIBLE);
        } else {
            iv8.setVisibility(View.INVISIBLE);
        }
    }

    public void Nose(View v) {
        if (cb9.isChecked()) {
            iv9.setVisibility(View.VISIBLE);
        } else {
            iv9.setVisibility(View.INVISIBLE);
        }
    }

    public void Shoes(View v) {
        if (cb10.isChecked()) {
            iv10.setVisibility(View.VISIBLE);
        } else {
            iv10.setVisibility(View.INVISIBLE);
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        if (iv1.getVisibility() == View.VISIBLE) {
            outState.putInt("iv1", 1);
        }

        if (iv2.getVisibility() == View.VISIBLE) {
            outState.putInt("iv2", 1);
        }

        if (iv3.getVisibility() == View.VISIBLE) {
            outState.putInt("iv3", 1);
        }

        if (iv4.getVisibility() == View.VISIBLE) {
            outState.putInt("iv4", 1);
        }

        if (iv5.getVisibility() == View.VISIBLE) {
            outState.putInt("iv5", 1);
        }

        if (iv6.getVisibility() == View.VISIBLE) {
            outState.putInt("iv6", 1);
        }

        if (iv7.getVisibility() == View.VISIBLE) {
            outState.putInt("iv7", 1);
        }

        if (iv8.getVisibility() == View.VISIBLE) {
            outState.putInt("iv8", 1);
        }

        if (iv9.getVisibility() == View.VISIBLE) {
            outState.putInt("iv9", 1);
        }


        if (iv10.getVisibility() == View.VISIBLE) {
            outState.putInt("iv10", 1);
        }


    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        int iv1r = savedInstanceState.getInt("iv1", 0);
        if (iv1r == 1) {
            iv1.setVisibility(View.VISIBLE);
        } else {
            iv1.setVisibility(View.INVISIBLE);
        }

        int iv2r = savedInstanceState.getInt("iv2", 0);
        if (iv2r == 1) {
            iv2.setVisibility(View.VISIBLE);
        } else {
            iv2.setVisibility(View.INVISIBLE);
        }

        int iv3r = savedInstanceState.getInt("iv3", 0);
        if (iv3r == 1) {
            iv3.setVisibility(View.VISIBLE);
        } else {
            iv3.setVisibility(View.INVISIBLE);
        }

        int iv4r = savedInstanceState.getInt("iv4", 0);
        if (iv4r == 1) {
            iv4.setVisibility(View.VISIBLE);
        } else {
            iv4.setVisibility(View.INVISIBLE);
        }


        int iv5r = savedInstanceState.getInt("iv5", 0);
        if (iv5r == 1) {
            iv5.setVisibility(View.VISIBLE);
        } else {
            iv5.setVisibility(View.INVISIBLE);
        }

        int iv6r = savedInstanceState.getInt("iv6", 0);
        if (iv6r == 1) {
            iv6.setVisibility(View.VISIBLE);
        } else {
            iv6.setVisibility(View.INVISIBLE);
        }

        int iv7r = savedInstanceState.getInt("iv7", 0);
        if (iv7r == 1) {
            iv7.setVisibility(View.VISIBLE);
        } else {
            iv7.setVisibility(View.INVISIBLE);
        }

        int iv8r = savedInstanceState.getInt("iv8", 0);
        if (iv8r == 1) {
            iv8.setVisibility(View.VISIBLE);
        } else {
            iv8.setVisibility(View.INVISIBLE);
        }

        int iv9r = savedInstanceState.getInt("iv9", 0);
        if (iv9r == 1) {
            iv9.setVisibility(View.VISIBLE);
        } else {
            iv9.setVisibility(View.INVISIBLE);
        }

        int iv10r = savedInstanceState.getInt("iv10", 0);
        if (iv10r == 1) {
            iv10.setVisibility(View.VISIBLE);
        } else {
            iv10.setVisibility(View.INVISIBLE);
        }

    }
}





