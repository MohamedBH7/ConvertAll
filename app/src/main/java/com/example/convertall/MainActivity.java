package com.example.convertall;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText inputEditText;
    TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputEditText = findViewById(R.id.inputEditText);
        resultTextView = findViewById(R.id.resultTextView);
    }

    public void convert(View view) {
        double inputValue = Double.parseDouble(inputEditText.getText().toString());
        double resultValue = 0;

        if (view.getId() == R.id.btnMileToKm) {
            resultValue = inputValue * 1.60934;
        } else if (view.getId() == R.id.btnKmToMile) {
            resultValue = inputValue / 1.60934;
        } else if (view.getId() == R.id.btnPoundToKg) {
            resultValue = inputValue * 0.453592;
        } else if (view.getId() == R.id.btnKgToPound) {
            resultValue = inputValue / 0.453592;
        } else if (view.getId() == R.id.btnInchToCm) {
            resultValue = inputValue * 2.54;
        } else if (view.getId() == R.id.btnCmToInch) {
            resultValue = inputValue / 2.54;
        }

        resultTextView.setText(String.valueOf(resultValue));
    }

}