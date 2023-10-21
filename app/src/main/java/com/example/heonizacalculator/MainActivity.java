package com.example.heonizacalculator;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    TextView resultTv, solutionTv;
    MaterialButton buttonC, buttonBackOpen, buttonBackClose;
    MaterialButton buttonDivide, buttonMultiply, buttonPlus, buttonMinus, buttonEquals;
    MaterialButton button0, button1, button2, button3, button4, button5, button6, button7, button8, button9;
    MaterialButton buttonAC, buttonDot;
    MaterialButton buttonNegative, buttonExponent, buttonSquareRoot, buttonModulo, buttonLogarithmic;
    MaterialButton buttonReciprocal, buttonSquare, buttonPowerOfN, buttonRootsOfN;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultTv = findViewById(R.id.result_tv);
        solutionTv = findViewById(R.id.solution_tv);

        buttonC = findViewById(R.id.button_c);
        buttonBackOpen = findViewById(R.id.button_open_bracket);
        buttonBackClose = findViewById(R.id.button_close_bracket);
        buttonDivide = findViewById(R.id.button_divide);
        buttonMultiply = findViewById(R.id.button_multiply);
        buttonPlus = findViewById(R.id.button_plus);
        buttonMinus = findViewById(R.id.button_minus);
        buttonEquals = findViewById(R.id.button_equals);
        button0 = findViewById(R.id.button_0);
        button1 = findViewById(R.id.button_1);
        button2 = findViewById(R.id.button_2);
        button3 = findViewById(R.id.button_3);
        button4 = findViewById(R.id.button_4);
        button5 = findViewById(R.id.button_5);
        button6 = findViewById(R.id.button_6);
        button7 = findViewById(R.id.button_7);
        button8 = findViewById(R.id.button_8);
        button9 = findViewById(R.id.button_9);
        buttonAC = findViewById(R.id.button_ac);
        buttonDot = findViewById(R.id.button_dot);
        buttonNegative = findViewById(R.id.button_Negative);
        buttonExponent = findViewById(R.id.button_Exponent);
        buttonSquareRoot = findViewById(R.id.button_Square_Root);
        buttonModulo = findViewById(R.id.button_Modulo);
        buttonLogarithmic = findViewById(R.id.button_Logarithmic);
        buttonReciprocal = findViewById(R.id.button_Reciprocal);
        buttonSquare = findViewById(R.id.button_Square);
        buttonPowerOfN = findViewById(R.id.button_Power_Of_N);
        buttonRootsOfN = findViewById(R.id.button_Roots_Of_N);

        setClickListeners();
    }

    void setClickListeners() {
        buttonC.setOnClickListener(this);
        buttonBackOpen.setOnClickListener(this);
        buttonBackClose.setOnClickListener(this);
        buttonDivide.setOnClickListener(this);
        buttonMultiply.setOnClickListener(this);
        buttonPlus.setOnClickListener(this);
        buttonMinus.setOnClickListener(this);
        buttonEquals.setOnClickListener(this);
        button0.setOnClickListener(this);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        buttonAC.setOnClickListener(this);
        buttonDot.setOnClickListener(this);
        buttonNegative.setOnClickListener(this);
        buttonExponent.setOnClickListener(this);
        buttonSquareRoot.setOnClickListener(this);
        buttonModulo.setOnClickListener(this);
        buttonLogarithmic.setOnClickListener(this);
        buttonReciprocal.setOnClickListener(this);
        buttonSquare.setOnClickListener(this);
        buttonPowerOfN.setOnClickListener(this);
        buttonRootsOfN.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        MaterialButton button = (MaterialButton) view;
        String buttonText = button.getText().toString();
        String dataToCalculate = solutionTv.getText().toString();

        if (buttonText.equals("AC")) {
            solutionTv.setText("");
            resultTv.setText("0");
            return;
        }
        if (buttonText.equals("=")) {
            solutionTv.setText(resultTv.getText());
            return;
        }
        if (buttonText.equals("C")) {
            if (dataToCalculate.length() > 0) {
                dataToCalculate = dataToCalculate.substring(0, dataToCalculate.length() - 1);
            }
        } else {
            dataToCalculate = dataToCalculate + buttonText;
        }
        solutionTv.setText(dataToCalculate);

        String finalResult = getResult();

        if (!finalResult.equals("Err")) {
            resultTv.setText(finalResult);
        }
    }

    String getResult() {
        try {
            // Your scriptable and result logic here
            return "0"; // Replace with your actual result
        } catch (Exception e) {
            return "Err";
        }
    }
}
