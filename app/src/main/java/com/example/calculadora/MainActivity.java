package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity<valor> extends AppCompatActivity {
    Button btOne, btTwo, btThree, btFour, btFive, btSix, btSeven, btEight, btNine, btZero, btDot, btEqual, btPi, btMinus, btPlus, btSquare, btSquareRoot, btBack, btErase, btLeftBracket, btRightBracket, btSin, btCos, btTan, btLog, btLogN, btDivision, btInverse, btFact, btMultipla;
    TextView textNumber, viewOp;
    String pi = "3.14";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btOne =  findViewById(R.id.btOne);
        btTwo =  findViewById(R.id.btTwo);
        btThree =  findViewById(R.id.btThree);
        btFour =  findViewById(R.id.btFour);
        btFive =  findViewById(R.id.btFive);
        btSix =  findViewById(R.id.btSix);
        btSeven =  findViewById(R.id.btSeven);
        btEight =  findViewById(R.id.btEight);
        btNine =  findViewById(R.id.btNine);
        btZero =  findViewById(R.id.btZero);
        btBack =  findViewById(R.id.btBack);
        btErase = findViewById(R.id.btErase);
        btLeftBracket = findViewById(R.id.btLeftBracket);
        btRightBracket = findViewById(R.id.btRightBracket);
        btSin = findViewById(R.id.btSin);
        btCos = findViewById(R.id.btCos);
        btTan = findViewById(R.id.btTan);
        btLog = findViewById(R.id.btLog);
        btLogN = findViewById(R.id.btLogN);
        btFact = findViewById(R.id.btFact);
        btSquare = findViewById(R.id.btSquare);
        btSquareRoot = findViewById(R.id.btSquareRoot);
        btInverse = findViewById(R.id.btInverse);
        btDivision = findViewById(R.id.btDivision);
        btMultipla = findViewById(R.id.btMultipla);
        btMinus = findViewById(R.id.btMinus);
        btPlus = findViewById(R.id.btPlus);
        btEqual = findViewById(R.id.btEqual);
        btPi = findViewById(R.id.btPi);
        btDot = findViewById(R.id.btDot);

        textNumber = findViewById(R.id.textNumber);
        viewOp = findViewById(R.id.viewOp);

     // actions for buttons

       btOne.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               textNumber.setText(textNumber.getText()+ "1");
           }
       });

       btTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textNumber.setText(textNumber.getText()+ "2");
            }
        });

       btThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textNumber.setText(textNumber.getText()+ "3");
            }
        });

        btFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textNumber.setText(textNumber.getText()+ "4");
            }
        });

        btFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textNumber.setText(textNumber.getText()+ "5");
            }
        });

        btSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textNumber.setText(textNumber.getText()+ "6");
            }
        });

        btSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textNumber.setText(textNumber.getText()+ "7");
            }
        });

        btEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textNumber.setText(textNumber.getText()+ "8");
            }
        });

        btNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textNumber.setText(textNumber.getText()+ "9");
            }
        });

        btZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textNumber.setText(textNumber.getText()+ "0");
            }
        });

        btDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textNumber.setText(textNumber.getText()+ ".");
            }
        });

        btBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textNumber.setText("");
                viewOp.setText("");
            }
        });

        btErase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String valor = textNumber.getText().toString();
                valor = valor.substring(0, valor.length() - 1);
                textNumber.setText(valor);
            }
        });

        btPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String valor = textNumber.getText().toString();
                if (!valor.equals(""))
                {
                    textNumber.setText(valor+btPlus.getText().toString());
                }
            }
        });

        btMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String valor = textNumber.getText().toString();
                char last = valor.charAt(valor.length() -1);
                if (last!='-')
                {
                    textNumber.setText(valor+btMinus.getText().toString());
                }
            }
        });

        btMultipla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textNumber.setText(textNumber.getText()+ "x");
            }
        });
        btDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String valor = textNumber.getText().toString();
                if (!valor.equals(""))
                {
                    textNumber.setText(valor+btDivision.getText().toString());
                }
            }
        });

        btSquareRoot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String valor = textNumber.getText().toString();
                double root = Math.sqrt(Double.parseDouble(valor));
                String result = String.valueOf(root);
                textNumber.setText(String.valueOf(result));
            }
        });

        btLeftBracket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textNumber.setText(textNumber.getText()+ "(");
            }
        });

        btRightBracket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textNumber.setText(textNumber.getText()+ ")");
            }
        });

        btPi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewOp.setText(btPi.getText());
                textNumber.setText(textNumber.getText()+ pi);
            }
        });

        btSin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textNumber.setText(textNumber.getText()+ "sin");
            }
        });

        btCos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textNumber.setText(textNumber.getText()+ "cos");
            }
        });

        btTan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textNumber.setText(textNumber.getText()+ "tan");
            }
        });

        btInverse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textNumber.setText(textNumber.getText()+ "^"+ "(-1)");
            }
        });

        btFact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int valor = Integer.parseInt(textNumber.getText().toString());
                int fact = factorial(valor);
                textNumber.setText(String.valueOf(fact));
                viewOp.setText(valor + "!");
            }
        });
        btSquare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double number = Double.parseDouble(textNumber.getText().toString());
                double square = number*number;
                textNumber.setText(String.valueOf(square));
                viewOp.setText(number+"²");
            }
        });

        btLogN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textNumber.setText(textNumber.getText()+ "ln");
            }
        });

        btLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textNumber.setText(textNumber.getText()+ "log");
            }
        });

        btEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String valor = textNumber.getText().toString();
                String replacedString = valor.replace('÷','/').replace('×', '*');
                double result = eval(replacedString);
                String response = String.valueOf(result);
                textNumber.setText(response);
     // método para apresentar 5 equações no campo viewOp
                if (viewOp.getText().equals("")){
                    viewOp.setText(valor);
                } else{
                    viewOp.append("\n" + valor);
                }
            }
        });

    }

    // função fatorial
             int factorial(int number){
                 return (number == 1 || number == 0) ? 1 : number * factorial(number - 1);
            }
        // resultado final do cálculo

    public static double eval(final String str) {
        return new Object() {
            int pos = -1, ch;

            void nextChar() {
                ch = (++pos < str.length()) ? str.charAt(pos) : -1;
            }

            boolean eat(int charToEat) {
                while (ch == ' ') nextChar();
                if (ch == charToEat) {
                    nextChar();
                    return true;
                }
                return false;
            }

            double parse() {
                nextChar();
                double x = parseExpression();
                if (pos < str.length()) throw new RuntimeException("Unexpected: " + (char)ch);
                return x;
            }


            double parseExpression() {
                double x = parseTerm();
                for (;;) {
                    if      (eat('+')) x += parseTerm(); // adição
                    else if (eat('-')) x -= parseTerm(); // subtração
                    else return x;
                }
            }

            double parseTerm() {
                double x = parseFactor();
                for (;;) {
                    if      (eat('*')) x *= parseFactor(); // multiplicação
                    else if (eat('/')) x /= parseFactor(); // divisão
                    else return x;
                }
            }

            double parseFactor() {
                if (eat('+')) return parseFactor();
                if (eat('-')) return -parseFactor();

                double x;
                int startPos = this.pos;
                if (eat('(')) { // parentheses
                    x = parseExpression();
                    eat(')');
                } else if ((ch >= '0' && ch <= '9') || ch == '.') {
                    while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                    x = Double.parseDouble(str.substring(startPos, this.pos));
                } else if (ch >= 'a' && ch <= 'z') {
                    while (ch >= 'a' && ch <= 'z') nextChar();
                    String func = str.substring(startPos, this.pos);
                    x = parseFactor();
                    if (func.equals("squareRoot")) x = Math.sqrt(x);
                    else if (func.equals("sin")) x = Math.sin(Math.toRadians(x));
                    else if (func.equals("cos")) x = Math.cos(Math.toRadians(x));
                    else if (func.equals("tan")) x = Math.tan(Math.toRadians(x));
                    else throw new RuntimeException("Unknown function: " + func);
                } else {
                    throw new RuntimeException("Unexpected: " + (char)ch);
                }

                if (eat('^')) x = Math.pow(x, parseFactor()); // função exponencial

                return x;
            }
        } .parse();
    }
}