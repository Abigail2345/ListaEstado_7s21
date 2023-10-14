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
    List<String> Milista = new ArrayList<>(Arrays.asList("Seleciona un estado","Aguascalientes","Baja California","Baja California Sur","Campeche","Coahuila","Colima","Chiapas","Chihuahua","Durango","Distrito Federal","Guanajuato","Guerro","Hidalgo","Jalisco","Estado de México","Michoacan","Morelos","Nayarit","Nuevo Leon","Oaxaca","Puebla","Queretaro","Quintana Roo","San luis Potesi","Sinaloa","Sonora","Tabasco","Tamaulipas","Tlaxcala","Veracruz","Yucatán","Zacatecas"));
    ArrayAdapter<String> adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        splista = findViewById(R.id.splista);

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
                    Glide.with(ivimagen).load("https://drive.google.com/uc?export=download&id=1mHLD3u4jRJ4wlErAx-Omri9zc3FYlvva").into(ivimagen);
                } else if (i == 2) {
                    Toast.makeText(PrincipalActivity.this, "Se selecciono:" + valor, Toast.LENGTH_SHORT).show();
                    Glide.with(ivimagen).load("https://drive.google.com/uc?export=download&id=1Ns-faO0v0iMzmdrDT2ibJ8qKFrIj0n83").into(ivimagen);
                } else if (i == 3) {
                    Toast.makeText(PrincipalActivity.this, "Se selecciono:" + valor, Toast.LENGTH_SHORT).show();
                    Glide.with(ivimagen).load("https://drive.google.com/uc?export=download&id=1kQTzhKCGtLRYBISRhSy168D3idoZB5Eh").into(ivimagen);
                } else if (i == 4) {
                    Toast.makeText(PrincipalActivity.this, "Se selecciono:" + valor, Toast.LENGTH_SHORT).show();
                    Glide.with(ivimagen).load("https://drive.google.com/uc?export=download&id=1tY-eN4PaRaa-98ILaW6hIR-ZwrGlAbhg").into(ivimagen);
                } else if (i == 5) {
                    Toast.makeText(PrincipalActivity.this, "Se selecciono:" + valor, Toast.LENGTH_SHORT).show();
                    Glide.with(ivimagen).load("https://drive.google.com/uc?export=download&id=1B-yT2yP-iIOAUYtNgQfvmEeAs-ypUZsF").into(ivimagen);
                } else if (i == 6) {
                    Toast.makeText(PrincipalActivity.this, "Se selecciono:" + valor, Toast.LENGTH_SHORT).show();
                    Glide.with(ivimagen).load("https://drive.google.com/uc?export=download&id=1c0wyPpr2U-6mMD6Q6YBDNeTTfiL2b3-f").into(ivimagen);
                } else if (i == 7) {
                    Toast.makeText(PrincipalActivity.this, "Se selecciono:" + valor, Toast.LENGTH_SHORT).show();
                    Glide.with(ivimagen).load("https://drive.google.com/uc?export=download&id=1tE4JPAoqVCZqc9XP0bKZbisMXeOUhaP2").into(ivimagen);
                }else if (i == 8) {
                    Toast.makeText(PrincipalActivity.this, "Se selecciono:" + valor, Toast.LENGTH_SHORT).show();
                    Glide.with(ivimagen).load("https://drive.google.com/uc?export=download&id=1tFlm5xKRCDyJGBMKTxP0CWHuvyp-8rU9").into(ivimagen);
                }else if (i == 9) {
                    Toast.makeText(PrincipalActivity.this, "Se selecciono:" + valor, Toast.LENGTH_SHORT).show();
                    Glide.with(ivimagen).load("https://drive.google.com/uc?export=download&id=1rmiw3vQpgWtuUllvNW0BMVx4e0vxtdSs").into(ivimagen);
                }else if (i == 10) {
                    Toast.makeText(PrincipalActivity.this, "Se selecciono:" + valor, Toast.LENGTH_SHORT).show();
                    Glide.with(ivimagen).load("https://drive.google.com/uc?export=download&id=1Nmj-diw38UR59NFn0fpwBm-DCYj4aVtH").into(ivimagen);
                }else if (i ==11) {
                    Toast.makeText(PrincipalActivity.this, "Se selecciono:" + valor, Toast.LENGTH_SHORT).show();
                    Glide.with(ivimagen).load("https://drive.google.com/uc?export=download&id=1QaX3LwCFggH0IF0zaOSSSaDZkT0Cpnfs").into(ivimagen);
                }else if (i == 12) {
                    Toast.makeText(PrincipalActivity.this, "Se selecciono:" + valor, Toast.LENGTH_SHORT).show();
                    Glide.with(ivimagen).load("https://drive.google.com/uc?export=download&id=1jlAiMs-rwqO9lBWKTK3HokTRtiwuJ-dk").into(ivimagen);
                }else if (i == 13) {
                    Toast.makeText(PrincipalActivity.this, "Se selecciono:" + valor, Toast.LENGTH_SHORT).show();
                    Glide.with(ivimagen).load("https://drive.google.com/uc?export=download&id=1mzfmh69UKW5XulsnpqxSy1t3mQQPgwkO").into(ivimagen);
                }else if (i == 14) {
                    Toast.makeText(PrincipalActivity.this, "Se selecciono:" + valor, Toast.LENGTH_SHORT).show();
                    Glide.with(ivimagen).load("https://drive.google.com/uc?export=download&id=1gs6gJVRQYFFungkFOsNAavLHBkj8oa_g").into(ivimagen);
                }else if (i == 15) {
                    Toast.makeText(PrincipalActivity.this, "Se selecciono:" + valor, Toast.LENGTH_SHORT).show();
                    Glide.with(ivimagen).load("https://drive.google.com/uc?export=download&id=1RX2qGqvbEuxSBVBsQmdF8fMCZMc5oxNe").into(ivimagen);
                }else if (i == 16) {
                    Toast.makeText(PrincipalActivity.this, "Se selecciono:" + valor, Toast.LENGTH_SHORT).show();
                    Glide.with(ivimagen).load("https://drive.google.com/uc?export=download&id=1UA1vYtzCckdAKewJ1gIdR2ZyKe2LL-gT").into(ivimagen);
                }else if (i == 17) {
                    Toast.makeText(PrincipalActivity.this, "Se selecciono:" + valor, Toast.LENGTH_SHORT).show();
                    Glide.with(ivimagen).load("https://drive.google.com/uc?export=download&id=1E6PAklKGnPRqaezuWhtuIZcuHJgey03e").into(ivimagen);
                }else if (i == 18) {
                    Toast.makeText(PrincipalActivity.this, "Se selecciono:" + valor, Toast.LENGTH_SHORT).show();
                    Glide.with(ivimagen).load("https://drive.google.com/uc?export=download&id=10xIJjgEb-pReLEodTf7iwuqrzUKhZttm").into(ivimagen);
                }else if (i == 19) {
                    Toast.makeText(PrincipalActivity.this, "Se selecciono:" + valor, Toast.LENGTH_SHORT).show();
                    Glide.with(ivimagen).load("https://drive.google.com/uc?export=download&id=1smNcwb5Cb_AiK4iInKIx0t-vCVUIOQXF").into(ivimagen);
                }else if (i == 20) {
                    Toast.makeText(PrincipalActivity.this, "Se selecciono:" + valor, Toast.LENGTH_SHORT).show();
                    Glide.with(ivimagen).load("https://drive.google.com/uc?export=download&id=1CLZUsS_eYf4dOfGtmjqzDb9UaOo9Ph1M").into(ivimagen);
                }else if (i == 21) {
                    Toast.makeText(PrincipalActivity.this, "Se selecciono:" + valor, Toast.LENGTH_SHORT).show();
                    Glide.with(ivimagen).load("https://drive.google.com/uc?export=download&id=1pxPNHC70_9u4V4pmZIY8geStc0ujhJpA").into(ivimagen);
                }else if (i == 22) {
                    Toast.makeText(PrincipalActivity.this, "Se selecciono:" + valor, Toast.LENGTH_SHORT).show();
                    Glide.with(ivimagen).load("https://drive.google.com/uc?export=download&id=1E3IyLLhSJeoM2tQss3DDEefzIsm9ADjz").into(ivimagen);
                }else if (i == 23) {
                    Toast.makeText(PrincipalActivity.this, "Se selecciono:" + valor, Toast.LENGTH_SHORT).show();
                    Glide.with(ivimagen).load("https://drive.google.com/uc?export=download&id=1TUzSdV-rQnZarr6CNMQt35mQcncX3Y0J").into(ivimagen);
                }else if (i == 24) {
                    Toast.makeText(PrincipalActivity.this, "Se selecciono:" + valor, Toast.LENGTH_SHORT).show();
                    Glide.with(ivimagen).load("https://drive.google.com/uc?export=download&id=1D7XcdCHd8d_T2yzVFY3F68S_DZNybBUe").into(ivimagen);
                }else if (i == 25) {
                    Toast.makeText(PrincipalActivity.this, "Se selecciono:" + valor, Toast.LENGTH_SHORT).show();
                    Glide.with(ivimagen).load("https://drive.google.com/uc?export=download&id=1c4ycPBoeZLtIn2CImqfOGVWni9eUr89l").into(ivimagen);
                }else if (i == 26) {
                    Toast.makeText(PrincipalActivity.this, "Se selecciono:" + valor, Toast.LENGTH_SHORT).show();
                    Glide.with(ivimagen).load("https://drive.google.com/uc?export=download&id=1ac7PvW187X6kwJN9B11jJm9AowemOLHG").into(ivimagen);
                }else if (i == 27) {
                    Toast.makeText(PrincipalActivity.this, "Se selecciono:" + valor, Toast.LENGTH_SHORT).show();
                    Glide.with(ivimagen).load("https://drive.google.com/uc?export=download&id=1CJ8RZgvWew-a5yBYKNXISN9pY2PhTT-L").into(ivimagen);
                }else if (i == 28) {
                    Toast.makeText(PrincipalActivity.this, "Se selecciono:" + valor, Toast.LENGTH_SHORT).show();
                    Glide.with(ivimagen).load("https://drive.google.com/uc?export=download&id=1wlA3V0SKqlgJiHquohTgvJRUKFyIwPCR").into(ivimagen);
                }else if (i == 29) {
                    Toast.makeText(PrincipalActivity.this, "Se selecciono:" + valor, Toast.LENGTH_SHORT).show();
                    Glide.with(ivimagen).load("https://drive.google.com/uc?export=download&id=1qfysTh-rE0m5hS8qFDqCV9Pvu8ohabfo").into(ivimagen);
                }else if (i == 30) {
                    Toast.makeText(PrincipalActivity.this, "Se selecciono:" + valor, Toast.LENGTH_SHORT).show();
                    Glide.with(ivimagen).load("https://drive.google.com/uc?export=download&id=1j45OL-lvHP9WgJLetU8mmBXDJNLuljVL").into(ivimagen);
                }else if (i == 31) {
                    Toast.makeText(PrincipalActivity.this, "Se selecciono:" + valor, Toast.LENGTH_SHORT).show();
                    Glide.with(ivimagen).load("https://drive.google.com/uc?export=download&id=1J6jeU1whenBZmJu4g2ByfBiPrchP3o50").into(ivimagen);
                }else if (i == 32) {
                    Toast.makeText(PrincipalActivity.this, "Se selecciono:" + valor, Toast.LENGTH_SHORT).show();
                    Glide.with(ivimagen).load("https://drive.google.com/uc?export=download&id=1L1WVWhLdWTIMdopCxra5joIYPq7neT7t").into(ivimagen);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}