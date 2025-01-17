package com.example.calculatorapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView display;
    private String currentInput = "";
    private String operator = "";
    private double result = 0;
    private boolean isOperatorPressed = false;
    private String history = "";  // Store ongoing calculation steps

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = findViewById(R.id.display);

        // Number Button Click Listener
        View.OnClickListener numberListener = view -> {
            Button button = (Button) view;
            if (isOperatorPressed) {
                currentInput = ""; // Clear input for new number after an operator
                isOperatorPressed = false;
            }
            currentInput += button.getText().toString();
            history += button.getText().toString();  // Append to history
            display.setText(history); // Display ongoing calculation
        };

        // Assign Listener to Number Buttons
        findViewById(R.id.btn_0).setOnClickListener(numberListener);
        findViewById(R.id.btn_1).setOnClickListener(numberListener);
        findViewById(R.id.btn_2).setOnClickListener(numberListener);
        findViewById(R.id.btn_3).setOnClickListener(numberListener);
        findViewById(R.id.btn_4).setOnClickListener(numberListener);
        findViewById(R.id.btn_5).setOnClickListener(numberListener);
        findViewById(R.id.btn_6).setOnClickListener(numberListener);
        findViewById(R.id.btn_7).setOnClickListener(numberListener);
        findViewById(R.id.btn_8).setOnClickListener(numberListener);
        findViewById(R.id.btn_9).setOnClickListener(numberListener);

        // Operator Buttons
        findViewById(R.id.btn_add).setOnClickListener(view -> handleOperator("+"));
        findViewById(R.id.btn_subtract).setOnClickListener(view -> handleOperator("-"));
        findViewById(R.id.btn_multiply).setOnClickListener(view -> handleOperator("*"));
        findViewById(R.id.btn_divide).setOnClickListener(view -> handleOperator("/"));

        // Equals Button
        findViewById(R.id.btn_equals).setOnClickListener(view -> handleEquals());

        // Clear Button
        findViewById(R.id.btn_clear).setOnClickListener(view -> {
            currentInput = "";
            operator = "";
            result = 0;
            history = "";  // Reset history
            display.setText("0"); // Reset display
        });
    }

    private void handleOperator(String op) {
        if (!currentInput.isEmpty()) {
            double currentNumber = Double.parseDouble(currentInput);

            if (operator.isEmpty()) {
                result = currentNumber; // Set the initial number
            } else {
                calculate(currentNumber); // Perform the pending operation
            }

            operator = op; // Update the operator
            isOperatorPressed = true; // Indicate an operator was pressed

            // Append operator to history
            history += " " + operator + " ";
            display.setText(history); // Update display with ongoing calculation
        }
    }

    private void handleEquals() {
        if (!currentInput.isEmpty() && !operator.isEmpty()) {
            double currentNumber = Double.parseDouble(currentInput);
            calculate(currentNumber); // Perform the final operation

            display.setText(String.valueOf(result)); // Show only the result
            history = String.valueOf(result); // Update history with result
            currentInput = String.valueOf(result); // Prepare for next operation
            operator = ""; // Clear the operator
        }
    }

    private void calculate(double currentNumber) {
        switch (operator) {
            case "+":
                result += currentNumber;
                break;
            case "-":
                result -= currentNumber;
                break;
            case "*":
                result *= currentNumber;
                break;
            case "/":
                if (currentNumber != 0) {
                    result /= currentNumber;
                } else {
                    display.setText("Error");
                    currentInput = "";
                    operator = "";
                    history = "";
                }
                break;
        }
    }
}
