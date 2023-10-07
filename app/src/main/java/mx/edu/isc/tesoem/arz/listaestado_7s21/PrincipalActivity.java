package mx.edu.isc.tesoem.arz.listaestado_7s21;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrincipalActivity extends AppCompatActivity {

    Spinner splista;
    ImageView ivimagen;
    List<String> Milista = new ArrayList<>(Arrays.asList("","Jaslico", "Zacatecas", "Guerrero", "Oaxaca", "Nayarit"));
    ArrayAdapter<String> adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        splista = findViewById(R.id.splista);
        Milista.add("Estado de Mexico");

        ivimagen = findViewById(R.id.ivimagen);

        adaptador = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,Milista);
        splista.setAdapter(adaptador);
        splista.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String valor = adapterView.getItemAtPosition(i).toString();
                //Toast.makeText(PrincipalActivity.this, "Se selecciono:" + valor, Toast.LENGTH_SHORT).show();
                //Glide.with(ivimagen).load("https://fastly.picsum.photos/id/237/536/354.jpg?hmac=i0yVXW1ORpyCZpQ-CknuyV-jbtU7_x9EBQVhvT5aRr0").into(ivimagen);
                if (i == 1) {
                    Toast.makeText(PrincipalActivity.this, "Se selecciono:" + valor, Toast.LENGTH_SHORT).show();
                    Glide.with(ivimagen).load("https://drive.google.com/uc?export=download&id=14hK-jNnhYds3r5Tz2n7YyOKTpxRDe_yX").into(ivimagen);
                } else if (i == 2) {
                    Toast.makeText(PrincipalActivity.this, "Se selecciono:" + valor, Toast.LENGTH_SHORT).show();
                    Glide.with(ivimagen).load("https://drive.google.com/uc?export=download&id=1urMh3vbNzfSz6A72FfMKd08fjktO5loO").into(ivimagen);
                } else if (i == 3) {
                    Toast.makeText(PrincipalActivity.this, "Se selecciono:" + valor, Toast.LENGTH_SHORT).show();
                    Glide.with(ivimagen).load("https://drive.google.com/uc?export=download&id=1R_zRPSbYEam9wOFS28elapq9bYYs1-0s").into(ivimagen);
                } else if (i == 4) {
                    Toast.makeText(PrincipalActivity.this, "Se selecciono:" + valor, Toast.LENGTH_SHORT).show();
                    Glide.with(ivimagen).load("https://drive.google.com/uc?export=download&id=1M3qJ5tKcvGlYMYAqJJ_Ggcj3TdVByX-w").into(ivimagen);
                } else if (i == 5) {
                    Toast.makeText(PrincipalActivity.this, "Se selecciono:" + valor, Toast.LENGTH_SHORT).show();
                    Glide.with(ivimagen).load("https://drive.google.com/uc?export=download&id=17wOaRIF6j8P4kv49LbZabAW-sUgqqaol").into(ivimagen);
                } else if (i == 6) {
                    Toast.makeText(PrincipalActivity.this, "Se selecciono:" + valor, Toast.LENGTH_SHORT).show();
                    Glide.with(ivimagen).load("https://drive.google.com/uc?export=download&id=1PAYhkiH379I36qMkQESOLQypjZgkMx_4").into(ivimagen);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}