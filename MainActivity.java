package com.example.user.calculator;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button ac;
    private Button del;
    private Button b00;
    private Button div;
    private Button mul;

    private Button sub;
    private Button add;
    private Button equal;
    private Button b9;
    private Button b8;

    private Button b7;
    private Button b6;
    private Button b5;
    private Button b4;
    private Button b3;

    private Button b2;
    private Button b1;
    private Button b0;
    private Button per;
    private Button dot;

    private TextView cal;
    private TextView res;

    private final char ADDITION='+';
    private final char SUBTRACTION='-';
    private final char MULTIPLICATION='*';
    private final char DIVISION='/';
    private final char EQU='=';

    private double val1=Double.NaN;
    private double val2;
    private char ACTION;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setval();

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cal.setText(cal.getText().toString()+"0");
            }
        });


        b00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cal.setText(cal.getText().toString()+"00");
            }
        });


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cal.setText(cal.getText().toString()+"1");
            }
        });


        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cal.setText(cal.getText().toString()+"2");
            }
        });


        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cal.setText(cal.getText().toString()+"3");
            }
        });


        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cal.setText(cal.getText().toString()+"3");
            }
        });


        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cal.setText(cal.getText().toString()+"4");
            }
        });


        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cal.setText(cal.getText().toString()+"5");
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cal.setText(cal.getText().toString()+"6");
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cal.setText(cal.getText().toString()+"7");
            }
        });


        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cal.setText(cal.getText().toString()+"8");
            }
        });


        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cal.setText(cal.getText().toString()+"9");
            }
        });


        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=cal.getText().toString();
                if(s.length()>0) {
                    if(s.charAt(s.length()-1)=='.' ||
                            s.charAt(s.length()-1)=='/' || s.charAt(s.length()-1)=='*' ||
                            s.charAt(s.length()-1)=='+' ||s.charAt(s.length()-1)=='-' )
                        cal.setText(cal.getText().toString());
                    else
                        cal.setText(cal.getText().toString()+".");
                }
            }
        });


        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cal.setText("");
            }
        });

        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=cal.getText().toString();
                if(s.length()>0) {
                    s = s.substring(0, s.length() - 1);
                    cal.setText(s);
                }
            }
        });


        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String s=cal.getText().toString();
                if(s.length()>0) {
                    if (s.charAt(s.length() - 1) == '/' || s.charAt(s.length() - 1) == '*' ||
                            s.charAt(s.length() - 1) == '+' || s.charAt(s.length() - 1) == '-' ||
                            s.charAt(s.length() - 1) == '.')
                        s = s.substring(0, s.length() - 1);

                    cal.setText(s + "/");
                }
            }
        });


        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String s=cal.getText().toString();
                if(s.length()>0) {
                    if (s.charAt(s.length() - 1) == '/' || s.charAt(s.length() - 1) == '*' ||
                            s.charAt(s.length() - 1) == '+' || s.charAt(s.length() - 1) == '-' ||
                            s.charAt(s.length() - 1) == '.')
                        s = s.substring(0, s.length() - 1);

                    cal.setText(s + "*");
                }
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String s=cal.getText().toString();
                if(s.length()>0) {
                    if (s.charAt(s.length() - 1) == '/' || s.charAt(s.length() - 1) == '*' ||
                            s.charAt(s.length() - 1) == '+' || s.charAt(s.length() - 1) == '-' ||
                            s.charAt(s.length() - 1) == '.')
                        s = s.substring(0, s.length() - 1);

                    cal.setText(s + "-");
                }
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String s=cal.getText().toString();
                if(s.length()>0) {
                    if (s.charAt(s.length() - 1) == '/' || s.charAt(s.length() - 1) == '*' ||
                            s.charAt(s.length() - 1) == '+' || s.charAt(s.length() - 1) == '-' ||
                            s.charAt(s.length() - 1) == '.')
                        s = s.substring(0, s.length() - 1);
                    cal.setText(s + "+");
                }
            }
        });

        per.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=cal.getText().toString();
                if(s.length()>0) {

                    if(s.charAt(s.length()-1)=='-' || s.charAt(s.length()-1)=='+'
                            || s.charAt(s.length()-1)=='*' || s.charAt(s.length()-1)=='/')
                    {
                        s=s.substring(0,s.length()-1);
                        cal.setText(s);
                    }
                    int l = s.length();
                    String w = "";
                    int i, f = 0;
                    for (i = l; i > 0; i--) {
                        if (s.charAt(i - 1) == '/' || s.charAt(i - 1) == '*' ||
                                s.charAt(i - 1) == '+' || s.charAt(i - 1) == '-') {
                            f = 1;
                            break;
                        }
                    }
                    if (f == 1) {
                        w = s.substring(i);
                        double a = Double.parseDouble(w);
                        a /= 100.0;
                        s = (cal.getText().toString().substring(0, (i))) + Double.toString(a);
                    } else {
                        double a = Double.parseDouble(s);
                        a /= 100.0;
                        s = Double.toString(a);
                    }
                    cal.setText(s);
                }
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String s=cal.getText().toString();
                if(s.length()>0) {
                    if(s.charAt(s.length()-1)=='-')
                    {
                       s=s.substring(0,s.length()-1);
                        cal.setText(s);
                    }
                    String anotherEquation = cal.getText().toString(); // 85
                    double another = computeAnother(anotherEquation);

                    res.setText(String.valueOf(another));
                }
            }
        });


    }
    public void setval(){
        ac=(Button)findViewById(R.id.bac);
        del=(Button)findViewById(R.id.bdel);
        b00=(Button)findViewById(R.id.b00);
        div=(Button)findViewById(R.id.bdiv);
        sub=(Button)findViewById(R.id.bsub);

        mul=(Button)findViewById(R.id.bmul);

        add=(Button)findViewById(R.id.badd);
        equal=(Button)findViewById(R.id.bequal);
        dot=(Button)findViewById(R.id.bdot);
        per=(Button)findViewById(R.id.bper);
        b9=(Button)findViewById(R.id.b9);

        b8=(Button)findViewById(R.id.b8);
        b7=(Button)findViewById(R.id.b7);
        b6=(Button)findViewById(R.id.b6);
        b5=(Button)findViewById(R.id.b5);
        b4=(Button)findViewById(R.id.b4);

        b3=(Button)findViewById(R.id.b3);
        b2=(Button)findViewById(R.id.b2);
        b1=(Button)findViewById(R.id.b1);
        b0=(Button)findViewById(R.id.b0);

        cal=(TextView)findViewById(R.id.cal);
        res=(TextView)findViewById(R.id.res);

    }

    static double computeAnother(String equation) {
        double result = 0.0;
        String noMinus = equation.replace("-", "+-");
        String[] byPluses = noMinus.split("\\+");

        for (String multipl : byPluses) {
            String[] byMultipl = multipl.split("\\*");
            double multiplResult = 1.0;
            for (String operand : byMultipl) {
                if (operand.contains("/")) {
                    String[] division = operand.split("\\/");
                    double divident = Double.parseDouble(division[0]);
                    for (int i = 1; i < division.length; i++) {
                        divident /= Double.parseDouble(division[i]);
                    }
                    multiplResult *= divident;
                } else {
                    multiplResult *= Double.parseDouble(operand);
                }
            }
            result += multiplResult;
        }

        return result;
    }

}
