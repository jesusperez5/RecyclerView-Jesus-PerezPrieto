package com.example.recyclerview;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ArrayList<Contacto> contactos = new ArrayList<Contacto>(Arrays.asList(
                new Contacto("Asta", "Huerfano", R.drawable.asta, 666666666),
                new Contacto("Yuno", "Huerfano", R.drawable.yuno, 111111111),
                new Contacto("Yami", "Sukehiro", R.drawable.yami, 222222222),
                new Contacto("Magna", "Swing", R.drawable.magna, 333333333),
                new Contacto("Julius", "Nova Chrono", R.drawable.julius, 444444444),
                new Contacto("Mereoleona", "Vermillion", R.drawable.mereoleona, 555555555),
                new Contacto("Luck", "Voltia", R.drawable.luck, 777777777)
        ));

        ContactoAdapter contactoAdapter = new ContactoAdapter(contactos);

        RecyclerView rvContacto = findViewById(R.id.recyclerView);

        rvContacto.setLayoutManager(new LinearLayoutManager(this));

        rvContacto.setAdapter(contactoAdapter);
    }
}