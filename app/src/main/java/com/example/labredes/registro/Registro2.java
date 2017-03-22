package com.example.labredes.registro;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Registro2 extends AppCompatActivity {

    private TextView registro2;
    private Bundle b;
    private String aux, pnomb, snomb, papell, sapell, edad, sexo;
    private Resources res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro2);

        registro2 = (TextView)findViewById(R.id.txtRegistro2);
        b = getIntent().getExtras();
        pnomb = b.getString("Primer_Nombre");
        snomb = b.getString("Segundo_Nombre");
        papell = b.getString("Primer_Apellido");
        sapell = b.getString("Segundo_Apellido");
        edad = b.getString("Edad");
        sexo = b.getString("Sexo");
        res = this.getResources();

        aux = res.getString(R.string.parte_Registro)+" "+pnomb+" "+snomb+" "+papell+" "+sapell+" "+res.getString(R.string.parte_Registro2)+" "+edad+" "+res.getString(R.string.parte_Registro3)+" "+sexo;
        registro2.setText(aux);
    }
}
