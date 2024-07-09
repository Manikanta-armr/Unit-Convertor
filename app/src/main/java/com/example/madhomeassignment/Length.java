package com.example.madhomeassignment;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Arrays;

public class Length extends AppCompatActivity {

    EditText from;
    EditText to;
    TextView textfrom;
    TextView textto;
    Button convert;
    Button fform;
    Button tform;
    final String[] values = new String[]{
            "Meter",
            "Exa Meter",
            "Peta Meter",
            "Tera Meter",
            "Giga Meter",
            "Mega Meter"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_common);
        from=(EditText)findViewById(R.id.et_fromUnit);
        to=(EditText)findViewById(R.id.et_toUnit);
        textfrom=(TextView)findViewById(R.id.tv_fromUnit);
        textto=(TextView)findViewById(R.id.tv_toUnit);
        convert=(Button)findViewById(R.id.convert);
        fform=(Button)findViewById(R.id.from);
        tform=(Button)findViewById(R.id.to);

        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tempInput = from.getText().toString();
                if (tempInput.equals("") || tempInput == null) {
                    Toast.makeText( Length.this,"Please Enter the values",Toast.LENGTH_LONG).show();
                }
                else if(textfrom.getText().equals("---") || textto.getText().equals("---"))
                {
                    Toast.makeText(Length.this,"Please Select the Units",Toast.LENGTH_LONG).show();
                }
                else {
                    if (textfrom.getText().toString().equals(values[0])) {
                        if (textto.getText().toString().equals(values[0])) {
                            to.setText(tempInput);
                        } else if (textto.getText().toString().equals(values[1])) {
                            to.setText(celciusToFarenheit(Double.parseDouble(tempInput)));
                        } else if (textto.getText().toString().equals(values[2])) {
                            to.setText(celciusToKelvin(Double.parseDouble(tempInput)));
                        } else if (textto.getText().toString().equals(values[3])) {
                            to.setText(celciusToRankine(Double.parseDouble(tempInput)));
                        } else if (textto.getText().toString().equals(values[4])) {
                            to.setText(celciusToNewton(Double.parseDouble(tempInput)));
                        } else if (textto.getText().toString().equals(values[5])) {
                            to.setText(celciusToDelisle(Double.parseDouble(tempInput)));
                        }
                    } else if (textfrom.getText().toString().equals(values[1])) {
                        if (textto.getText().toString().equals(values[0])) {
                            to.setText(fahrenheitToCelcius(Double.parseDouble(tempInput)));
                        } else if (textto.getText().toString().equals(values[1])) {
                            to.setText(tempInput);
                        } else if (textto.getText().toString().equals(values[2])) {
                            to.setText(fahrenheitToKelvin(Double.parseDouble(tempInput)));
                        } else if (textto.getText().toString().equals(values[3])) {
                            to.setText(fahrenheitToRankine(Double.parseDouble(tempInput)));
                        } else if (textto.getText().toString().equals(values[4])) {
                            to.setText(fahrenheitToNewton(Double.parseDouble(tempInput)));
                        } else if (textto.getText().toString().equals(values[5])) {
                            to.setText(fahrenheitToDelisle(Double.parseDouble(tempInput)));
                        }
                    } else if (textfrom.getText().toString().equals(values[2])) {
                        if (textto.getText().toString().equals(values[0])) {
                            to.setText(kelvinToCelcius(Double.parseDouble(tempInput)));
                        } else if (textto.getText().toString().equals(values[1])) {
                            to.setText(kelvinToFahrenheit(Double.parseDouble(tempInput)));
                        } else if (textto.getText().toString().equals(values[2])) {
                            to.setText(tempInput);
                        } else if (textto.getText().toString().equals(values[3])) {
                            to.setText(kelvinToRankine(Double.parseDouble(tempInput)));
                        } else if (textto.getText().toString().equals(values[4])) {
                            to.setText(kelvinToNewton(Double.parseDouble(tempInput)));
                        } else if (textto.getText().toString().equals(values[5])) {
                            to.setText(kelvinToDelisle(Double.parseDouble(tempInput)));
                        }
                    } else if (textfrom.getText().toString().equals(values[3])) {
                        if (textto.getText().toString().equals(values[0])) {
                            to.setText(rankineToCelcius(Double.parseDouble(tempInput)));
                        } else if (textto.getText().toString().equals(values[1])) {
                            to.setText(rankineToFahrenheit(Double.parseDouble(tempInput)));
                        } else if (textto.getText().toString().equals(values[2])) {
                            to.setText(rankineToKelvin(Double.parseDouble(tempInput)));
                        } else if (textto.getText().toString().equals(values[3])) {
                            to.setText(tempInput);
                        } else if (textto.getText().toString().equals(values[4])) {
                            to.setText(rankineToNewton(Double.parseDouble(tempInput)));
                        } else if (textto.getText().toString().equals(values[5])) {
                            to.setText(rankineToDelisle(Double.parseDouble(tempInput)));
                        }
                    } else if (textfrom.getText().toString().equals(values[4])) {
                        if (textto.getText().toString().equals(values[0])) {
                            to.setText(newtonToCelcius(Double.parseDouble(tempInput)));
                        } else if (textto.getText().toString().equals(values[1])) {
                            to.setText(newtonToFahrenheit(Double.parseDouble(tempInput)));
                        } else if (textto.getText().toString().equals(values[2])) {
                            to.setText(newtonToKelvin(Double.parseDouble(tempInput)));
                        } else if (textto.getText().toString().equals(values[3])) {
                            to.setText(newtonToRankine(Double.parseDouble(tempInput)));
                        } else if (textto.getText().toString().equals(values[4])) {
                            to.setText(tempInput);
                        } else if (textto.getText().toString().equals(values[5])) {
                            to.setText(newtonToDelisle(Double.parseDouble(tempInput)));
                        }
                    } else if (textfrom.getText().toString().equals(values[5])) {
                        if (textto.getText().toString().equals(values[0])) {
                            to.setText(delisleToCelcius(Double.parseDouble(tempInput)));
                        } else if (textto.getText().toString().equals(values[1])) {
                            to.setText(delisleToFahrenheit(Double.parseDouble(tempInput)));
                        } else if (textto.getText().toString().equals(values[2])) {
                            to.setText(delisleToKelvin(Double.parseDouble(tempInput)));
                        } else if (textto.getText().toString().equals(values[3])) {
                            to.setText(delisleToRankine(Double.parseDouble(tempInput)));
                        } else if (textto.getText().toString().equals(values[4])) {
                            to.setText(delisleToNewton(Double.parseDouble(tempInput)));
                        } else if (textto.getText().toString().equals(values[5])) {
                            to.setText(tempInput);
                        }
                    }
                }
            }
        });

        fform.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final AlertDialog.Builder builder = new AlertDialog.Builder(Length.this);
                builder.setTitle("choose Unit");

                builder.setSingleChoiceItems(
                        values,
                        -1,
                        new DialogInterface.OnClickListener()
                        {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                String selectedItem = Arrays.asList(values).get(i);
                                textfrom.setText(selectedItem);

                            }
                        });

                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });

                AlertDialog dialog = builder.create();

                dialog.show();

            }
        });

        tform.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                to.setText("");
                textto.setText("---");
                final AlertDialog.Builder builder = new AlertDialog.Builder(Length.this);
                builder.setTitle("choose Unit");

                builder.setSingleChoiceItems(
                        values,
                        -1,
                        new DialogInterface.OnClickListener()
                        {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                String selectedItem = Arrays.asList(values).get(i);
                                textto.setText(selectedItem);

                            }
                        });

                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });

                AlertDialog dialog = builder.create();

                dialog.show();

            }
        });

    }

    private String celciusToKelvin(double celsius) {
        double kelvin = celsius / 1e+18;
        return String.valueOf(kelvin);
    }

    private String celciusToRankine(double celsius) {
        double rankine = celsius / 1e+15;
        return String.valueOf(rankine);
    }

    private String celciusToNewton(double celsius) {
        double newton = celsius / 1e+12;
        return String.valueOf(newton);
    }

    private String celciusToDelisle(double celsius) {
        double delisle = celsius / 1e+9;
        return String.valueOf(delisle);
    }

    private String celciusToFarenheit(double celsius) {
        double fahrenheit = celsius / 1e+6;
        return String.valueOf(fahrenheit);
    }

    //fahrenheit
    private String fahrenheitToKelvin(double fahrenheit) {
        double kelvin = fahrenheit * 1000;
        return String.valueOf(kelvin);
    }

    private String fahrenheitToRankine(double fahrenheit) {
        double rankine = fahrenheit * 1e+6;
        return String.valueOf(rankine);
    }

    private String fahrenheitToNewton(double fahrenheit) {
        double newton = fahrenheit * 1e+9;
        return String.valueOf(newton);
    }

    private String fahrenheitToDelisle(double fahrenheit) {
        double delisle = fahrenheit * 1e+12;
        return String.valueOf(delisle);
    }

    private String fahrenheitToCelcius(double fahrenheit) {
        double celcius = fahrenheit * 1e+18;
        return String.valueOf(celcius);
    }

    //Kelvin
    private String kelvinToRankine(double kelvin) {
        double rankine = kelvin * 1000;
        return String.valueOf(rankine);
    }

    private String kelvinToNewton(double kelvin) {
        double newton = kelvin * 1e+6;
        return String.valueOf(newton);
    }

    private String kelvinToDelisle(double kelvin) {
        double delisle = kelvin * 1e+9;
        return String.valueOf(delisle);
    }

    private String kelvinToCelcius(double kelvin) {
        double celcius = kelvin * 1e+15;
        return String.valueOf(celcius);
    }

    private String kelvinToFahrenheit(double kelvin) {
        double fahrenheit = kelvin / 1000;
        return String.valueOf(fahrenheit);
    }

    //Rankine
    private String rankineToNewton(double rankine) {
        double newton = rankine * 1000;
        return String.valueOf(newton);
    }

    private String rankineToDelisle(double rankine) {
        double delisle = rankine * 1e+6;
        return String.valueOf(delisle);
    }

    private String rankineToCelcius(double rankine) {
        double celcius = rankine * 1e+12;
        return String.valueOf(celcius);
    }

    private String rankineToFahrenheit(double rankine) {
        double fahrenheit = rankine / 1e+6;
        return String.valueOf(fahrenheit);
    }

    private String rankineToKelvin(double rankine) {
        double kelvin = rankine / 1000;
        return String.valueOf(kelvin);
    }

    //Newton
    private String newtonToDelisle(double newton) {
        double delisle = newton * 1000;
        return String.valueOf(delisle);
    }

    private String newtonToCelcius(double newton) {
        double celcius = newton * 1e+9;
        return String.valueOf(celcius);
    }

    private String newtonToFahrenheit(double newton) {
        double fahrenheit = newton / 1e+9;
        return String.valueOf(fahrenheit);
    }

    private String newtonToKelvin(double newton) {
        double kelvin = newton / 1e+6;
        return String.valueOf(kelvin);
    }

    private String newtonToRankine(double newton) {
        double rankine = newton * 1000;
        return String.valueOf(rankine);
    }

    //Delisle
    private String delisleToCelcius(double delisle) {
        double celcius = delisle * 1e+6;
        return String.valueOf(celcius);
    }

    private String delisleToFahrenheit(double delisle) {
        double fahrenheit = delisle / 1e+12;
        return String.valueOf(fahrenheit);
    }

    private String delisleToKelvin(double delisle) {
        double kelvin = delisle / 1e+9;
        return String.valueOf(kelvin);
    }

    private String delisleToRankine(double delisle) {
        double rankine = delisle / 1e+6;
        return String.valueOf(rankine);
    }

    private String delisleToNewton(double delisle) {
        double newton = delisle / 1000;
        return String.valueOf(newton);
    }
}