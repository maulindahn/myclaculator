package com.example.hana.mycalculator;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    Button nol, satu, dua, tiga, empat, lima, enam, tujuh, delapan, sembilan,
            tambah, kurang, kali, bagi, koma, persen, kuadrat, akarkuadrat,
            kurungbuka, kurungtutup, hapus, hapussemua, hasil;
    EditText display;
    float numVal1, numVal2;
    double sqr, sqrt;
    boolean add, sub, mult, div, perc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nol = (Button)findViewById(R.id.nol);
        satu =(Button)findViewById(R.id.satu);
        dua = (Button)findViewById(R.id.dua);
        tiga = (Button)findViewById(R.id.tiga);
        empat = (Button)findViewById(R.id.empat);
        lima = (Button)findViewById(R.id.lima);
        enam = (Button)findViewById(R.id.enam);
        tujuh = (Button)findViewById(R.id.tujuh);
        delapan = (Button)findViewById(R.id.delapan);
        sembilan = (Button)findViewById(R.id.sembilan);
        tambah = (Button)findViewById(R.id.tambah);
        kurang = (Button)findViewById(R.id.kurang);
        kali = (Button)findViewById(R.id.kali);
        bagi = (Button)findViewById(R.id.bagi);
        koma = (Button)findViewById(R.id.koma);
        kurungbuka = (Button)findViewById(R.id.kurungbuka);
        kurungtutup = (Button)findViewById(R.id.kurungtutup);
        persen = (Button)findViewById(R.id.persen);
        kuadrat = (Button)findViewById(R.id.kuadrat);
        akarkuadrat = (Button)findViewById(R.id.akarkuadrat);
        hapus = (Button)findViewById(R.id.hapus);
        hapussemua = (Button)findViewById(R.id.hapussemua);
        hasil = (Button)findViewById(R.id.hasil);
        display = (EditText)findViewById(R.id.display);

        nol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText()+"0");
            }
        });

        satu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText()+"1");
            }
        });

        dua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText()+"2");
            }
        });

        tiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText()+"3");
            }
        });

        empat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText()+"4");
            }
        });

        lima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "5");
            }
        });

        enam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText()+"6");
            }
        });

        tujuh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText()+"7");
            }
        });

        delapan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText()+"8");
            }
        });

        sembilan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText()+"9");
            }
        });

        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (display == null){
                    display.setText("");
                } else {
                    numVal1 = Float.parseFloat(display.getText()+"");
                    add = true;
                    display.setText(null);
                }
            }
        });

        kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numVal1 = Float.parseFloat(display.getText()+"");
                sub = true;
                display.setText(null);
            }
        });

        kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numVal1 = Float.parseFloat(display.getText()+"");
                mult = true;
                display.setText(null);
            }
        });

        bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numVal1 = Float.parseFloat(display.getText()+"");
                div = true;
                display.setText(null);
            }
        });

        kuadrat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = display.getText().toString();
                sqr = Double.parseDouble(val.toString());
                sqr = Math.pow(sqr, 2);
                String result = Double.toString(sqr);
                display.setText(result);
            }
        });

        akarkuadrat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = display.getText().toString();
                sqrt = Double.parseDouble(val.toString());
                sqrt = Math.sqrt(sqrt);
                String result = Double.toString(sqrt);
                display.setText(result);
            }
        });

        persen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numVal1 = Float.parseFloat(display.getText()+"");
                perc = true;
                display.setText(null);
            }
        });

        koma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText()+".");
            }
        });

        kurungbuka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText()+"(");
            }
        });

        kurungtutup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText()+")");
            }
        });

        hapus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = display.getText().toString();
                text = text.substring(0,text.length()-1);
                display.setText(text);
            }
        });

        hapussemua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText("");
            }
        });

        hasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numVal2 = Float.parseFloat(display.getText()+"");

                if (add == true){
                    display.setText(numVal1 + numVal2 + "");
                    add = false;
                }
                if (sub == true){
                    display.setText(numVal1 - numVal2 + "");
                    sub = false;
                }
                if (mult == true){
                    display.setText(numVal1 * numVal2 + "");
                    mult = false;
                }
                if (div == true){
                    display.setText(numVal1 / numVal2 + "");
                    div = false;
                }
                if (perc == true){
                    display.setText(((numVal1/100)*numVal2)+"");
                    perc = false;
                }
            }
        });

        /**at initial start reset input text to 0
        stringInput=new StringBuilder("0");
        editText = (EditText)findViewById(R.id.editText);
        editText.setText(stringInput);
        //set listener on all buttons
        ViewGroup rootView = (ViewGroup)findViewById(R.id.activity_main);
        setAllListenerOnButton(rootView);
        //init variables
        numVal=0;**/
    }

    /**public void setAllListenerOnButton(ViewGroup parentView){
        int numChildViews=parentView.getChildCount();
        for (int i = 0; i < numChildViews; i++) {
            View childView = parentView.getChildAt(i);
            if(childView instanceof Button){
                Button genericButton = (Button) childView;
                genericButton.setOnClickListener(this);
            }
            else if(childView instanceof ViewGroup){
                setAllListenerOnButton((ViewGroup) childView);
            }
        }
    }

    public void displayResult(View v){
        Log.v(TAG, "Displayed");
        editText.setText("Result");
    }

    @Override
    public void onClick(View view) {
        numVal = Integer.parseInt(stringInput.toString());
        //before concatenating always read first from numeric values
        if(numVal==0){
            stringInput = new StringBuilder ("");
        }
        switch (view.getId())
        {
            case R.id.hapussemua:
                stringInput=new StringBuilder("0");
                editText.setText("0");
                Log.v(TAG, "clear text");
                break;
            case R.id.hapus:
                stringInput.deleteCharAt(stringInput.length()-1);
                Log.v(TAG, "current string: " + stringInput);
                editText.setText(stringInput);
                break;
            case R.id.kali:

                break;
            case R.id.bagi:
                break;
            case R.id.tambah:
                break;
            case R.id.kurang:
                break;
            case R.id.kuadrat:
                break;
            case R.id.akarkuadrat:
                break;
            case R.id.persen:
                break;
            case R.id.koma:
                break;
            case R.id.kurungbuka:
                break;
            case R.id.kurungtutup:
                break;
            case R.id.hasil:
                editText.setText("result");
                break;
            default:
                //handle multiple view click events
                Button numButton = (Button)view;
                String text = numButton.getText().toString();
                stringInput.append(text);
                //Log.v(TAG, "text: " + text);
                editText.setText(stringInput);
        }
    }**/
}
