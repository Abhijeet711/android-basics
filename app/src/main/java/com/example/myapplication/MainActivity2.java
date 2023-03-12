package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    EditText num;
    Button num1, num2, num3, num4, num5, num6, num7, num8, num9, num0;
    Button numdel, numclr, numeq, numdiv, nummul, numsub, numdec, numadd;
    Float v1, v2;
    Boolean ifadd, ifsub, ifmul, ifdiv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //num.setShowSoftInputOnFocus(false);
        num = findViewById(R.id.numin);
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        num3 = findViewById(R.id.num3);
        num4 = findViewById(R.id.num4);
        num5 = findViewById(R.id.num5);
        num6 = findViewById(R.id.num6);
        num7 = findViewById(R.id.num7);
        num8 = findViewById(R.id.num8);
        num9 = findViewById(R.id.num9);
        num0 = findViewById(R.id.num0);
        numclr = findViewById(R.id.numclr);
        numdel = findViewById(R.id.numdel);
        numeq = findViewById(R.id.numeq);
        numdec = findViewById(R.id.numdec);
        numadd = findViewById(R.id.numadd);
        numsub = findViewById(R.id.numsub);
        nummul = findViewById(R.id.nummul);
        numdiv = findViewById(R.id.numdiv);

        num1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num.setText(num.getText().toString() + "1");
            }
        });

        num2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num.setText(num.getText().toString() + "2");
            }
        });

        num3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num.setText(num.getText().toString() + "3");
            }
        });

        num4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num.setText(num.getText().toString() + "4");
            }
        });

        num5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num.setText(num.getText().toString() + "5");
            }
        });

        num6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num.setText(num.getText().toString() + "6");
            }
        });

        num7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num.setText(num.getText().toString() + "7");
            }
        });

        num8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num.setText(num.getText().toString() + "8");
            }
        });

        num9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num.setText(num.getText().toString() +  "9");
            }
        });

        num0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num.setText(num.getText().toString() + "0");
            }
        });

        numdec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num.setText(num.getText().toString() + ".");
            }
        });

        numclr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num.setText(null);
            }
        });

        numadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                v1 = Float.valueOf(num.getText()+"");
                ifadd=true;
                ifsub=false;
                ifdiv=false;
                ifmul=false;
                num.setText(null);
            }
        });

        numsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                v1 = Float.valueOf(num.getText()+"");
                ifsub=true;
                ifadd=false;
                ifdiv=false;
                ifmul=false;
                num.setText(null);
            }
        });

        nummul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                v1 = Float.valueOf(num.getText()+"");
                ifmul=true;
                ifadd=false;
                ifsub=false;
                ifdiv=false;
                num.setText(null);
            }
        });

        numdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                v1 = Float.valueOf(num.getText()+"");
                ifdiv=true;
                ifadd=false;
                ifsub=false;
                ifmul=false;
                num.setText(null);
            }
        });

        numeq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                v2 = Float.parseFloat(num.getText()+"");
                if(ifadd==true){
                    num.setText(v1 + v2 + "");
                    ifadd=false;
                    ifsub=false;
                    ifdiv=false;
                    ifmul=false;
                }
                if(ifsub==true){
                    num.setText(v1 - v2 + "");
                    ifsub=false;
                    ifadd=false;
                    ifdiv=false;
                    ifmul=false;
                }
                if(ifmul==true){
                    num.setText(v1 * v2 + "");
                    ifmul=false;
                    ifadd=false;
                    ifsub=false;
                    ifdiv=false;
                }
                if(ifdiv==true){
                    num.setText(v1 / v2 + "");
                    ifdiv=false;
                    ifadd=false;
                    ifsub=false;
                    ifmul=false;
                }
            }
        });

        numdel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String del=num.getText().toString();
                if (del.length()>0)
                {
                    del=del.substring(0,del.length()-1);
                    num.setText(del);
                }
            }
        });
    }
}