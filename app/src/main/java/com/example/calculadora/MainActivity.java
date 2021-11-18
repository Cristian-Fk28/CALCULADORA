package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button1,buttonBorrar, button2, button3, button4, button5, button6, button7, button8, button9, button0, buttonPunto, buttonIgual,
            buttonSuma, buttonResta, buttonMultiplicacion,buttonDivision, buttonPorcentaje;
    TextView txtResultado;
    EditText txtproceso;
    double Num1, Num2, Resultado;
    String operador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button0 = (Button) findViewById(R.id.button0);
        buttonPunto = (Button) findViewById(R.id.buttonPunto);
        buttonSuma = (Button) findViewById(R.id.buttonSuma);
        buttonResta = (Button) findViewById(R.id.buttonResta);
        buttonBorrar= (Button) findViewById(R.id.buttonBorrar);
        buttonMultiplicacion = (Button) findViewById(R.id.buttonMultiplicacion);
        buttonDivision = (Button) findViewById(R.id.buttonDivision);
        buttonPorcentaje = (Button) findViewById(R.id.buttonPorcentaje);
        buttonIgual= (Button) findViewById(R.id.buttonIgual);
        txtproceso = (EditText) findViewById(R.id.EditText);
txtproceso.setFocusable(true);
txtproceso.setFocusableInTouchMode(true);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtResultado = (EditText) findViewById(R.id.EditText);
                txtproceso.setText(txtResultado.getText().toString()+"1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtResultado = (EditText) findViewById(R.id.EditText);
                txtproceso.setText(txtResultado.getText().toString()+"2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtResultado = (EditText) findViewById(R.id.EditText);
                txtproceso.setText(txtResultado.getText().toString()+"3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtResultado = (EditText) findViewById(R.id.EditText);
                txtproceso.setText(txtResultado.getText().toString()+"4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtResultado = (EditText) findViewById(R.id.EditText);
                txtproceso.setText(txtResultado.getText().toString()+"5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtResultado = (EditText) findViewById(R.id.EditText);
                txtproceso.setText(txtResultado.getText().toString()+"6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtResultado = (EditText) findViewById(R.id.EditText);
                txtproceso.setText(txtResultado.getText().toString()+"7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtResultado = (EditText) findViewById(R.id.EditText);
                txtproceso.setText(txtResultado.getText().toString()+"8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtResultado = (EditText) findViewById(R.id.EditText);
                txtproceso.setText(txtResultado.getText().toString()+"9");
            }
        });
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtResultado = (EditText) findViewById(R.id.EditText);
                txtproceso.setText(txtResultado.getText().toString()+"0");
            }
        });
        buttonPunto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtResultado = (EditText) findViewById(R.id.EditText);
                txtproceso.setText(txtResultado.getText().toString()+".");
            }
        });
        buttonIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtResultado = (EditText) findViewById(R.id.EditText);
                Num2 = Double.parseDouble(txtResultado.getText().toString());
                if (operador.equals("+")) {
                    txtproceso.setText("");
                    Resultado = Num1 + Num2;
                }
                if (operador.equals("-")) {
                    txtproceso.setText("");
                    Resultado = Num1 - Num2;
                }
                if (operador.equals("*")) {
                    txtproceso.setText("");
                    Resultado = Num1 * Num2;
                }
                if (operador.equals("/")) {
                    txtproceso.setText("");
                    if (Num1 != 0) {
                        Resultado = Num1 / Num2;
                    } else {
                        txtproceso.setText("INFINITO");
                    }
                }
                txtproceso.setText(String.valueOf(Resultado));
            }
        });
        buttonSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operador="+";
                txtResultado = (EditText) findViewById(R.id.EditText);
                Num1=Double.parseDouble(txtResultado.getText().toString());
                txtproceso.setText("");
            }
        });
        buttonResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operador="-";
                txtResultado = (EditText) findViewById(R.id.EditText);
                Num1=Double.parseDouble(txtResultado.getText().toString());
                txtproceso.setText("");
            }
        });
        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operador="/";
                txtResultado = (EditText) findViewById(R.id.EditText);
                Num1=Double.parseDouble(txtResultado.getText().toString());
                txtproceso.setText("");
            }
        });
        buttonMultiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operador="*";
                txtResultado = (EditText) findViewById(R.id.EditText);
                Num1=Double.parseDouble(txtResultado.getText().toString());
                txtproceso.setText("");
            }
        });

        buttonBorrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Num2 = 0;
                Num1 = 0;
                txtproceso.setText("");
            }
        });
        buttonPorcentaje.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               String textAnterior=txtproceso.getText().toString();
               if(textAnterior.length()>0){
              String    NuevaOperacion= textAnterior.substring(0, txtproceso.length()-1);
               txtproceso.setText(NuevaOperacion);
               }

            }
        });




    }


}