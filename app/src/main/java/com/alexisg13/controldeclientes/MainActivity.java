package com.alexisg13.controldeclientes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button entry_btn;
    private Button exit_btn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        entry_btn = findViewById(R.id.btn_entrada);
        entry_btn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                int n_entrada;
                String str_entrada;
                TextView numero1=findViewById(R.id.entran);
                n_entrada = Integer.parseInt(numero1.getText().toString());
                n_entrada+=1;
                str_entrada=Integer.toString(n_entrada);
                numero1.setText(str_entrada);
            }
        });

        exit_btn= findViewById(R.id.btn_salida);
        exit_btn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                int n_salida;
                String str_salida;
                TextView numero2=findViewById(R.id.salen);
                n_salida = Integer.parseInt(numero2.getText().toString());
                n_salida+=1;
                str_salida=Integer.toString(n_salida);
                numero2.setText(str_salida);
            }
        });

    }
}
