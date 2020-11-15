package com.example.aplikacja3;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

        public class MainActivity extends AppCompatActivity {
            EditText editText;
            int dlugosc;
            ImageView imageView;

            public void zmienObrazek(View view){
                dlugosc  = editText.getText().toString().length();
                int a;
                if (dlugosc != 0){
                    a = Integer.parseInt(editText.getText().toString());

                    switch (a){
                        case 1:
                            imageView.setImageDrawable(getDrawable(R.drawable.panda));
                            break;
                        case 2:
                            imageView.setImageDrawable(getDrawable(R.drawable.kot));
                            break;
                        default:
                            Toast.makeText(getApplicationContext(), "Podaj liczbę 1 lub 2", Toast.LENGTH_LONG).show();
                    }
                }else{
                    Toast.makeText(getApplicationContext(), "Podaj właściwą liczbę", Toast.LENGTH_LONG).show();
                }
            }

            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);

                editText  = findViewById(R.id.editTextNumber);
                imageView = findViewById(R.id.imageView2);
            }
        }