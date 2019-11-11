package com.thanhnam.bodyandhealthy.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.thanhnam.bodyandhealthy.R;

public class ManHinhChaoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_man_hinh_chao);

    final Thread thread = new Thread() {
        @Override
        public void run() {
            try {
                Thread.sleep(10000);
            } catch (Exception e) {
                Toast.makeText(ManHinhChaoActivity.this, "Error", Toast.LENGTH_SHORT).show();
            } finally {
                Intent intent = new Intent(ManHinhChaoActivity.this, ManHinhChinhActivity.class);
                startActivity(intent);
            }
        }
    };
        thread.start();
}

}
