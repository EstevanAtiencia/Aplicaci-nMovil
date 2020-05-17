package com.example.myprimerapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText num1;
    private EditText num2;
    private TextView resultado;


    @Override
    protected void onCreate (Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_main);
        num1= (EditText)findViewById(R.id.num1) ;
        num2=(EditText)findViewById(R.id.num2);
        resultado=(TextView)findViewById(R.id.txsuma);
    }

    public void suma(View view){
        String valor1= num1.getText().toString();
        String valor2=num2.getText().toString();

        int suma=Integer.parseInt(valor1)+ Integer.parseInt(valor2);
        String result= suma+ "";
        resultado.setText(result);

    }

}
