package com.example.cl.ejercicio11javaandroidmodulo4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.cl.ejercicio11javaandroidmodulo4.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        binding = ActivityMainBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());


        initListener();





    }

    private void initListener() {

        binding.btnAvion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "Boton avion precionado", Toast.LENGTH_SHORT).show();
            }
        });

       binding.ActualizarBtn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Toast.makeText(getBaseContext(),"Boton Actualizar presionado",Toast.LENGTH_SHORT).show();
           }
       });

       binding.buttonPictureGallery.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Toast.makeText(getBaseContext(),"Boton Galeria Presionada",Toast.LENGTH_SHORT).show();
           }
       });

       binding.buttonUnlockedLevel5.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Toast.makeText(getBaseContext(),"Desbloqueado nivel 5",Toast.LENGTH_SHORT).show();
           }
       });

       binding.buttonLevel4.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Toast.makeText(getBaseContext(),"Boton nivel 4 presionado",Toast.LENGTH_SHORT).show();
           }
       });

       binding.buttonMusicPaused.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Toast.makeText(getBaseContext(),"Musica pausada",Toast.LENGTH_SHORT).show();
           }
       });
    }
}