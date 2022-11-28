package com.example.restapi_2018076;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    TextView tanggal, jam, magnitude, kedalaman, wilayah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tanggal = findViewById(R.id.tanggal);
        jam = findViewById(R.id.jam);
        magnitude = findViewById(R.id.magnitude);
        kedalaman = findViewById(R.id.kedalaman);
        wilayah = findViewById(R.id.wilayah);


        getKabarGempa();
    }

    private void getKabarGempa() {
        Call<Results> call = RetrofitClient.getInstance().getMyApi().getKabarGempa();
        call.enqueue(new Callback<Results>() {
            @Override
            public void onResponse(Call<Results> call, Response<Results> response) {
                Log.d("RESPON", "onResponse: "+response.body());
                Results rs = response.body();
                tanggal.setText(rs.getData().getTanggal());
                jam.setText(rs.getData().getJam());
                magnitude.setText(rs.getData().getMagnitude());
                kedalaman.setText(rs.getData().getKedalaman());
                wilayah.setText(rs.getData().getWilayah());
            }

            @Override
            public void onFailure(Call<Results> call, Throwable t) {
                Log.d("ERRORR HEH", "onFailure: "+t.getMessage());
                Toast.makeText(getApplicationContext(), "An error has occured", Toast.LENGTH_LONG).show();
            }

        });
    }
}