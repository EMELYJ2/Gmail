package com.example.correo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText etDireccion, etTema, etContenido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etDireccion=findViewById(R.id.etDireccion);
        etTema=findViewById(R.id.etTema);
        etContenido=findViewById(R.id.etContenido);
    }

    public void enviar (View view)
    {
        Intent intent=new Intent(Intent.ACTION_SENDTO);
        Intent setData = intent.setData(Uri.parse("mailto:"));
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{etDireccion.getText().toString()});
        intent.putExtra(Intent.EXTRA_SUBJECT, etTema.getText().toString());
        intent.putExtra(Intent.EXTRA_TEXT, etContenido.getText().toString());
        startActivity(intent);

    }
}