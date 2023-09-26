package com.example.version_2_escuchar_eventos;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    EditText etNum1, etNum2, etNum3;
    Button btnCalcular;
    TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNum1 = findViewById(R.id.etNum1);
        etNum2 = findViewById(R.id.etNum2);
        etNum3 = findViewById(R.id.etNum3);
        btnCalcular = findViewById(R.id.btnCalculate);
        tvResultado = findViewById(R.id.tvResult);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calcularNumeroMasGrande();
            }
        });
    }

    private void calcularNumeroMasGrande() {
        String str1 = etNum1.getText().toString();
        String str2 = etNum2.getText().toString();
        String str3 = etNum3.getText().toString();

        try {
            double num1 = Double.parseDouble(str1);
            double num2 = Double.parseDouble(str2);
            double num3 = Double.parseDouble(str3);

            double mayor = Math.max(Math.max(num1, num2), num3);

            tvResultado.setText("El número más grande es: " + mayor);
        } catch (NumberFormatException e) {
            Toast.makeText(MainActivity.this, "Por favor, ingrese números válidos.", Toast.LENGTH_SHORT).show();
        }
    }
}
