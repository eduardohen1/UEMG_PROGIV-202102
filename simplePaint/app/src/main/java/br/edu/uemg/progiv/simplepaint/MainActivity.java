package br.edu.uemg.progiv.simplepaint;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private ViewCanvas viewCanvas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewCanvas = findViewById(R.id.area_desenho);
    }

    public void limparDesenho(View view){
        viewCanvas.limparCanvas();
    }

    public void corVerde(View view){
        viewCanvas.limparCanvas();
        viewCanvas.inicializaObjetosVerde();
    }

    public void corVermelha(View view){
        viewCanvas.limparCanvas();
        viewCanvas.inicializaObjetosVermelho();
    }
}