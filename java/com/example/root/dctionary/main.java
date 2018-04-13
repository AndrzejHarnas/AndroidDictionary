package com.example.root.dctionary;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;
import java.util.HashMap;
import java.util.Map;

public class main extends AppCompatActivity {


    TextView t;
    Button przycisk;
    EditText x;
    String polishword;
    String solution="Cześć";
    Map<String,String> dictionary = new HashMap<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        przycisk = findViewById(R.id.button2);
        x=findViewById(R.id.write2);
        t=findViewById(R.id.desc1);


        dictionary.put("kot","cat");
        dictionary.put("pies","dog");
        dictionary.put("mama","mother");
        dictionary.put("tata","father");
        dictionary.put("mysz","mouse");
        dictionary.put("koń","horse");
        dictionary.put("słoń","elephant");
        dictionary.put("brat","brother");
        dictionary.put("siostra","sister");
        dictionary.put("dziadek","grandfather");
        dictionary.put("babcia","grandmother");
        dictionary.put("auto","car");
        dictionary.put("wujek","uncle");
        dictionary.put("ciotka","aunt");
        dictionary.put("mrówka","aint");
        dictionary.put("meżczyzna","man");
        dictionary.put("kobieta","woman");
        dictionary.put("żona","wife");
        dictionary.put("mąż","husband");
        dictionary.put("tygrys","tiger");
        dictionary.put("róża","rose");
        dictionary.put("tesciowa","mother in low");
        dictionary.put("ryba","fish");
        dictionary.put("szkoła","school");
        dictionary.put("klasa","class");
        dictionary.put("dom","home, house");
        dictionary.put("biurko","desk");
        dictionary.put("ekran","screen");
        dictionary.put("dziewczyna","girl");
        dictionary.put("chłopak","boy");
        dictionary.put("gra","game");
        dictionary.put("telewizor","TV");
        dictionary.put("noga","leg");
        dictionary.put("stopa","foot");
        dictionary.put("ręka","hand");
        dictionary.put("głowa","head");
        dictionary.put("szuja","neck");
        dictionary.put("palec","finger");





        przycisk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                polishword = x.getText().toString();

                t.setTextSize(35);


                if(dictionary.containsKey(polishword.toLowerCase())){

                    solution = ""+dictionary.get(polishword.toLowerCase());
                    t.setTextColor(Color.BLACK);

                } else

                {
                    solution="Nie ma takiego słowa w bazie aplikacji :(";
                    t.setTextColor(2);
                    t.setTextColor(Color.RED);

                }



                t.setText(solution);





            }
        });




    }
}
