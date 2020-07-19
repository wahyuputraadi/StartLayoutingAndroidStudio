 package com.example.startprojectlayouting;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

 public class MenuActivity2 extends AppCompatActivity {

     //  1. Kenalan - Buat Variabel
     Button btnLinear, btnRelative, btnFrame, btnConstrant ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu2);

    //   2. Sambungin - inisialisasi variabvel sesuai dengan id nya
         btnConstrant = findViewById(R.id.btn_constrant);
         btnFrame = findViewById(R.id.btn_frame);
         btnLinear = findViewById(R.id.btn_linear);
         btnRelative = findViewById(R.id.btn_relative);


    //   3. Ngapain - event handling
        btnLinear.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
//                 Toast.makeText(MenuActivity2.this, "Pesan Dikirim", Toast.LENGTH_SHORT).show();

//               Cara membuat link atau pindah ke halaman berikutnya
                 Intent pindahMainActivity = new Intent(MenuActivity2.this, MainActivity.class);
                 startActivity(pindahMainActivity);
             }
         });

        btnRelative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                komponen variabel = new Komponen()

//                context -> NamaActivity.this
                AlertDialog.Builder pesan = new AlertDialog.Builder(MenuActivity2.this);
                pesan.setTitle("Anda Belum Login");
                pesan.setMessage("Login Sekarang ?");
                pesan.setPositiveButton("OK", new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MenuActivity2.this, "Login Berhasil", Toast.LENGTH_SHORT).show();

//                      Cara membuat link atau pindah ke halaman berikutnya
                        Intent pindahRelativeActivity = new Intent(MenuActivity2.this, RelativeActivity2.class);
                        startActivity(pindahRelativeActivity);
                    }
                });

//                apabila tidak ingin ada aksi bisa berika null
                pesan.setNegativeButton("NO", null) ;
                pesan.show();

            }
        });

//        btnFrame
        btnFrame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahFrameActivity = new Intent(MenuActivity2.this, FrameActivity.class);
                startActivity(pindahFrameActivity);
            }
        });

//        btnConstrant
        btnConstrant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahConstraintActivity = new Intent(MenuActivity2.this, ConstraintActivity2.class);
                startActivity(pindahConstraintActivity);
            }
        });

//        Calender


    }
 }