package com.example.biodata;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.content.ActivityNotFoundException;
import android.os.Bundle;
import android.view.View;
import android.net.Uri;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void panggil(View view) {
        String nomor = "085227958708" ;
        Intent panggil = new Intent(Intent. ACTION_DIAL);
        panggil.setData(Uri. fromParts("tel",nomor,null));
        startActivity(panggil);
    }

    public void email(View view){
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_EMAIL, new String[] {"maharanishivania12@gmail.com"});

        try {
            startActivity(Intent.createChooser(intent, "Ingin Mengirim Email ?"));
        } catch (ActivityNotFoundException ex) {
            //do something else
        }
    }

    public void maps (View view) {
        Uri uri = Uri.parse("geo:-6.904567, 111.033753");
        Intent it = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(it);
    }

}