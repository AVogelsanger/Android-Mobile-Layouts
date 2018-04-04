package br.com.fiap.layouts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ExemploFrameLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exemplo_frame_layout);
    }

    public void abrirFrameLayout(View view) {
        Intent it = new Intent(this, ExemploFrameLayoutActivity.class);

        startActivity(it);
    }

    public void Login(View view) {
        finish();
    }
}
