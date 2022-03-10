package com.example.sampleconstraintlayout;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ActivityKedua extends AppCompatActivity{
   //Mendeklarasikan variable dengan tipe data Textview
   TextView txEmail,txPassword;

   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_kedua);

      //Menghubungkan variable txEmail dengan componen Textview pada layout
      txEmail = findViewById(R.id.tvEmail);

      //Menghubunhkan variabel txPassword dengan componen Textview pada layout
      txPassword = findViewById(R.id.tvPassword);

      //mendeklarasikan variabel bundle yang akan digunakan untuk mengambil
      //pesan yang dikirimkan melalui method intent
      Bundle bundle = getIntent().getExtras();

      //membuat variabel string yang digunakan untuk menyimpan data yang
      //dikirimkan dari activity sebelumnya dengan kunci "a"
      String email = bundle.getString("a");

      //membuat variabel string yang digunakan untuk menyimpan data yang
      //dikirimkan dari activity sebelumnya dengan kunci "a"
      String pass = bundle.getString("b");

      //menampilkan value dari variabel email kedalam txEmail
      txEmail.setText(email);

      //menampilkan value dari variabel pass kedalam txPassword
      txPassword.setText(pass);
   }
}
