package app.reproductor;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    MediaPlayer miReproductor;
    int posicion = 0;
    MediaPlayer vectormp [] = new MediaPlayer[6];
    ImageView iv;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button btnPlay = findViewById(R.id.btnPlay);
        final Button btnStop = findViewById(R.id.btnStop);
        final Button btnPause = findViewById(R.id.btnPause);
        final Button btnSiguiente = findViewById(R.id.btnSiguiente);
        final Button btnAnterior = findViewById(R.id.btnAnterior);
        final TextView txtTitulo = findViewById(R.id.txtTitulo);
        final TextView txtArtista = findViewById(R.id.txtArtista);
        iv = (ImageView)findViewById(R.id.imageView);
        vectormp [0] = MediaPlayer.create(this,R.raw.sound);
        vectormp [1] = MediaPlayer.create(this,R.raw.sound1);
        vectormp [2] = MediaPlayer.create(this,R.raw.sound2);
        vectormp [3] = MediaPlayer.create(this,R.raw.sound3);
        vectormp [4] = MediaPlayer.create(this,R.raw.sound4);
        vectormp [5] = MediaPlayer.create(this,R.raw.sound5);







        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast mensaje = Toast.makeText(getApplicationContext(),"REPRODUCIENDO",Toast.LENGTH_SHORT);
                mensaje.show();
                vectormp[posicion].start();

            }
        });

        btnStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast mensaje = Toast.makeText(getApplicationContext(),"DETENIDO",Toast.LENGTH_SHORT);
                mensaje.show();

                vectormp[posicion].stop();
                vectormp[posicion].release();
                vectormp[posicion] = MediaPlayer.create(MainActivity.this, R.raw.sound);



            }
        });

        btnPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast mensaje = Toast.makeText(getApplicationContext(),"PAUSA",Toast.LENGTH_SHORT);
                mensaje.show();

                vectormp[posicion].pause();
            }
        });

        btnSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (posicion < vectormp.length - 1){
                    if (vectormp[posicion].isPlaying()){
                        vectormp[posicion].stop();
                        posicion++;
                        vectormp[posicion].start();

                        if (posicion == 0){
                            txtTitulo.setText("Echame a mi la culpa");
                            txtArtista.setText("Luis Miguel");
                            iv.setImageResource(R.drawable.portada);

                        }else if (posicion == 1){
                            txtTitulo.setText("Y");
                            txtArtista.setText("Luis Miguel");
                            iv.setImageResource(R.drawable.portada1);

                        }else if (posicion == 2){
                            txtTitulo.setText("Llamarada");
                            txtArtista.setText("Luis Miguel");
                            iv.setImageResource(R.drawable.portada2);

                        }else if (posicion == 3){
                            txtTitulo.setText("Te necesito");
                            txtArtista.setText("Luis Miguel");
                            iv.setImageResource(R.drawable.portada3);

                        }else if (posicion == 4){
                            txtTitulo.setText("Motivos");
                            txtArtista.setText("Luis Miguel");
                            iv.setImageResource(R.drawable.portada4);

                        }else if (posicion == 5){
                            txtTitulo.setText("Sabor a mi");
                            txtArtista.setText("Luis Miguel");
                            iv.setImageResource(R.drawable.portada5);

                        }

                    }else{
                        posicion++;

                        if (posicion == 0){
                            txtTitulo.setText("Echame a mi la culpa");
                            txtArtista.setText("Luis Miguel");
                            iv.setImageResource(R.drawable.portada);

                        }else if (posicion == 1){
                            txtTitulo.setText("Y");
                            txtArtista.setText("Luis Miguel");
                            iv.setImageResource(R.drawable.portada1);

                        }else if (posicion == 2){
                            txtTitulo.setText("Llamarada");
                            txtArtista.setText("Luis Miguel");
                            iv.setImageResource(R.drawable.portada2);

                        }else if (posicion == 3){
                            txtTitulo.setText("Te necesito");
                            txtArtista.setText("Luis Miguel");
                            iv.setImageResource(R.drawable.portada3);

                        }else if (posicion == 4){
                            txtTitulo.setText("Motivos");
                            txtArtista.setText("Luis Miguel");
                            iv.setImageResource(R.drawable.portada4);

                        }else if (posicion == 5){
                            txtTitulo.setText("Sabor a mi");
                            txtArtista.setText("Luis Miguel");
                            iv.setImageResource(R.drawable.portada5);

                        }

                    }

                }else{
                    Toast mensaje = Toast.makeText(getApplicationContext(),"NO HAY MAS CANCIONES",Toast.LENGTH_SHORT);

                }
            }
        });

        btnAnterior.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (posicion >= 1){
                    if (vectormp[posicion].isPlaying()){
                        vectormp[posicion].stop();
                        vectormp [0] = MediaPlayer.create(MainActivity.this,R.raw.sound);
                        vectormp [1] = MediaPlayer.create(MainActivity.this,R.raw.sound1);
                        vectormp [2] = MediaPlayer.create(MainActivity.this,R.raw.sound2);
                        vectormp [3] = MediaPlayer.create(MainActivity.this,R.raw.sound3);
                        vectormp [4] = MediaPlayer.create(MainActivity.this,R.raw.sound4);
                        vectormp [5] = MediaPlayer.create(MainActivity.this,R.raw.sound5);
                        posicion--;
                        vectormp[posicion].start();

                        if (posicion == 0){
                            txtTitulo.setText("Echame a mi la culpa");
                            txtArtista.setText("Luis Miguel");
                            iv.setImageResource(R.drawable.portada);

                        }else if (posicion == 1){
                            txtTitulo.setText("Y");
                            txtArtista.setText("Luis Miguel");
                            iv.setImageResource(R.drawable.portada1);

                        }else if (posicion == 2){
                            txtTitulo.setText("Llamarada");
                            txtArtista.setText("Luis Miguel");
                            iv.setImageResource(R.drawable.portada2);

                        }else if (posicion == 3){
                            txtTitulo.setText("Te necesito");
                            txtArtista.setText("Luis Miguel");
                            iv.setImageResource(R.drawable.portada3);

                        }else if (posicion == 4){
                            txtTitulo.setText("Motivos");
                            txtArtista.setText("Luis Miguel");
                            iv.setImageResource(R.drawable.portada4);

                        }else if (posicion == 5){
                            txtTitulo.setText("Sabor a mi");
                            txtArtista.setText("Luis Miguel");
                            iv.setImageResource(R.drawable.portada5);

                        }



                    }else {
                        posicion--;

                        if (posicion == 0){
                            txtTitulo.setText("Echame a mi la culpa");
                            txtArtista.setText("Luis Miguel");
                            iv.setImageResource(R.drawable.portada);

                        }else if (posicion == 1){
                            txtTitulo.setText("Y");
                            txtArtista.setText("Luis Miguel");
                            iv.setImageResource(R.drawable.portada1);

                        }else if (posicion == 2){
                            txtTitulo.setText("Llamarada");
                            txtArtista.setText("Luis Miguel");
                            iv.setImageResource(R.drawable.portada2);

                        }else if (posicion == 3){
                            txtTitulo.setText("Te necesito");
                            txtArtista.setText("Luis Miguel");
                            iv.setImageResource(R.drawable.portada3);

                        }else if (posicion == 4){
                            txtTitulo.setText("Motivos");
                            txtArtista.setText("Luis Miguel");
                            iv.setImageResource(R.drawable.portada4);

                        }else if (posicion == 5){
                            txtTitulo.setText("Sabor a mi");
                            txtArtista.setText("Luis Miguel");
                            iv.setImageResource(R.drawable.portada5);

                        }
                    }

                }else {
                    Toast mensaje = Toast.makeText(getApplicationContext(),"NO HAY MAS CANCIONES",Toast.LENGTH_SHORT);
                }
            }
        });



    }


}
