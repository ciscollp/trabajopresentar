package com.example.labredes.registro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Registro extends AppCompatActivity {

    private EditText cajaPrimerNomb;
    private EditText cajaSegundoNomb;
    private EditText cajaPrimerApell;
    private EditText cajaSegundoApell;
    private EditText cajaEdad;
    private EditText cajaSexo;
    private Intent i;
    private Bundle b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        cajaPrimerNomb = (EditText)findViewById(R.id.txtPrimerNomb);
        cajaSegundoNomb = (EditText)findViewById(R.id.txtSegundoNomb);
        cajaPrimerApell = (EditText)findViewById(R.id.txtPrimerApell);
        cajaSegundoApell = (EditText)findViewById(R.id.txtSegundoApell);
        cajaEdad = (EditText)findViewById(R.id.txtEdad);
        cajaSexo = (EditText)findViewById(R.id.txtSexo);

        i = new Intent(this,Registro2.class);
        b = new Bundle();
    }

    public void mostrar(View v) { //Hacer boton.
        String pnomb, snomb, papell, sapell, edad, sexo;
        if(validar()) {
            //Tomo el valor que la persona ingresó tanto en nombre como en apellido.
            pnomb = cajaPrimerNomb.getText().toString();//Traer texto.
            snomb = cajaSegundoNomb.getText().toString();//Traer texto.
            papell = cajaPrimerApell.getText().toString();//Traer texto.
            sapell = cajaSegundoApell.getText().toString();//Traer texto.
            edad = cajaEdad.getText().toString();//Traer texto.
            sexo = cajaSexo.getText().toString();//Traer texto.
            //Encapsulo los valores previamente tomados.
            b.putString("Primer_Nombre", pnomb);//Meter en la capsula.
            b.putString("Segundo_Nombre", snomb);//Meter en la capsula.
            b.putString("Primer_Apellido", papell);//Meter en la capsula.
            b.putString("Segundo_Apellido", sapell);//Meter en la capsula.
            b.putString("Edad", edad);//Meter en la capsula.
            b.putString("Sexo", sexo);//Meter en la capsula.
            //Le paso al Intent todos los datos en forma encapsulada con el Bundle.
            i.putExtras(b);//Pasar la capsula.
            //Arranco la actividad que el Intent me diga.
            startActivity(i);//Pasa a la actividad que dijo el Intent.
        }
    }

    public boolean validar(){
        if(cajaPrimerNomb.getText().toString().isEmpty()){
            cajaPrimerNomb.setError(getResources().getString(R.string.error_1));
            return false;
        }
        if(cajaSegundoNomb.getText().toString().isEmpty()){
            cajaSegundoNomb.setError(getResources().getString(R.string.error_2));
            return false;
        }
        if(cajaPrimerApell.getText().toString().isEmpty()){
            cajaPrimerApell.setError(getResources().getString(R.string.error_3));
            return false;
        }
        if(cajaSegundoApell.getText().toString().isEmpty()){
            cajaSegundoApell.setError(getResources().getString(R.string.error_4));
            return false;
        }
        if(cajaEdad.getText().toString().isEmpty()){
            cajaEdad.setError(getResources().getString(R.string.error_5));
            return false;
        }
        if(cajaSexo.getText().toString().isEmpty()){
            cajaSexo.setError(getResources().getString(R.string.error_6));
            return false;
        }
        return true;
    }

    public void borrar(View b){
        cajaPrimerNomb.setText("");
        cajaPrimerNomb.requestFocus();
        cajaSegundoNomb.setText("");
        cajaPrimerApell.setText("");
        cajaSegundoApell.setText("");
        cajaEdad.setText("");
        cajaSexo.setText("");
    }
}
