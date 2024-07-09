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

public class Area extends AppCompatActivity {

    EditText from;
    EditText to;
    TextView textfrom;
    TextView textto;
    Button convert;
    Button fform;
    Button tform;
    final String[] values = new String[]{
            "Square Meter",
            "Square Kilometer",
            "Square Hectometer",
            "Square Decameter",
            "Square Decimeter",
            "Square Centimeter"
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
                    Toast.makeText(Area.this,"Please Enter the values",Toast.LENGTH_LONG).show();
                }
                else if(textfrom.getText().equals("---") || textto.getText().equals("---"))
                {
                    Toast.makeText(Area.this,"Please Select the Units",Toast.LENGTH_LONG).show();
                }
                else {
                    if (textfrom.getText().toString().equals(values[0])) {
                        if (textto.getText().toString().equals(values[0])) {
                            to.setText(tempInput);
                        } else if (textto.getText().toString().equals(values[1])) {
                            to.setText(MetertoKilometer(Double.parseDouble(tempInput)));
                        } else if (textto.getText().toString().equals(values[2])) {
                            to.setText(MetertoHectometer(Double.parseDouble(tempInput)));
                        } else if (textto.getText().toString().equals(values[3])) {
                            to.setText(MetertoDecameter(Double.parseDouble(tempInput)));
                        } else if (textto.getText().toString().equals(values[4])) {
                            to.setText(MetertoDecimeter(Double.parseDouble(tempInput)));
                        } else if (textto.getText().toString().equals(values[5])) {
                            to.setText(MetertoCentimeter(Double.parseDouble(tempInput)));
                        }
                    } else if (textfrom.getText().toString().equals(values[1])) {
                        if (textto.getText().toString().equals(values[0])) {
                            to.setText(KilometertoMeter(Double.parseDouble(tempInput)));
                        } else if (textto.getText().toString().equals(values[1])) {
                            to.setText(tempInput);
                        } else if (textto.getText().toString().equals(values[2])) {
                            to.setText(KilometertoHectometer(Double.parseDouble(tempInput)));
                        } else if (textto.getText().toString().equals(values[3])) {
                            to.setText(KilometertoDecameter(Double.parseDouble(tempInput)));
                        } else if (textto.getText().toString().equals(values[4])) {
                            to.setText(KilometertoDecimeter(Double.parseDouble(tempInput)));
                        } else if (textto.getText().toString().equals(values[5])) {
                            to.setText(KilometertoCentimeter(Double.parseDouble(tempInput)));
                        }
                    } else if (textfrom.getText().toString().equals(values[2])) {
                        if (textto.getText().toString().equals(values[0])) {
                            to.setText(HectometertoMeter(Double.parseDouble(tempInput)));
                        } else if (textto.getText().toString().equals(values[1])) {
                            to.setText(HectometertoKilometer(Double.parseDouble(tempInput)));
                        } else if (textto.getText().toString().equals(values[2])) {
                            to.setText(tempInput);
                        } else if (textto.getText().toString().equals(values[3])) {
                            to.setText(HectometertoDecameter(Double.parseDouble(tempInput)));
                        } else if (textto.getText().toString().equals(values[4])) {
                            to.setText(HectometertoDecimeter(Double.parseDouble(tempInput)));
                        } else if (textto.getText().toString().equals(values[5])) {
                            to.setText(HectometertoCentimeter(Double.parseDouble(tempInput)));
                        }
                    } else if (textfrom.getText().toString().equals(values[3])) {
                        if (textto.getText().toString().equals(values[0])) {
                            to.setText(DecametertoMeter(Double.parseDouble(tempInput)));
                        } else if (textto.getText().toString().equals(values[1])) {
                            to.setText(DecametertoKilometer(Double.parseDouble(tempInput)));
                        } else if (textto.getText().toString().equals(values[2])) {
                            to.setText(DecametertoHectometer(Double.parseDouble(tempInput)));
                        } else if (textto.getText().toString().equals(values[3])) {
                            to.setText(tempInput);
                        } else if (textto.getText().toString().equals(values[4])) {
                            to.setText(DecametertoDecimeter(Double.parseDouble(tempInput)));
                        } else if (textto.getText().toString().equals(values[5])) {
                            to.setText(DecametertoCentimeter(Double.parseDouble(tempInput)));
                        }
                    } else if (textfrom.getText().toString().equals(values[4])) {
                        if (textto.getText().toString().equals(values[0])) {
                            to.setText(DecimetertoMeter(Double.parseDouble(tempInput)));
                        } else if (textto.getText().toString().equals(values[1])) {
                            to.setText(DecimetertoKilometer(Double.parseDouble(tempInput)));
                        } else if (textto.getText().toString().equals(values[2])) {
                            to.setText(DecimetertoHectometer(Double.parseDouble(tempInput)));
                        } else if (textto.getText().toString().equals(values[3])) {
                            to.setText(DecimetertoDecameter(Double.parseDouble(tempInput)));
                        } else if (textto.getText().toString().equals(values[4])) {
                            to.setText(tempInput);
                        } else if (textto.getText().toString().equals(values[5])) {
                            to.setText(DecimetertoCentimeter(Double.parseDouble(tempInput)));
                        }
                    } else if (textfrom.getText().toString().equals(values[5])) {
                        if (textto.getText().toString().equals(values[0])) {
                            to.setText(CentimetertoMeter(Double.parseDouble(tempInput)));
                        } else if (textto.getText().toString().equals(values[1])) {
                            to.setText(CentimetertoKilometer(Double.parseDouble(tempInput)));
                        } else if (textto.getText().toString().equals(values[2])) {
                            to.setText(CentimetertoHectometer(Double.parseDouble(tempInput)));
                        } else if (textto.getText().toString().equals(values[3])) {
                            to.setText(CentimetertoDecameter(Double.parseDouble(tempInput)));
                        } else if (textto.getText().toString().equals(values[4])) {
                            to.setText(CentimetertoDecimeter(Double.parseDouble(tempInput)));
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

                final AlertDialog.Builder builder = new AlertDialog.Builder(Area.this);
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
                final AlertDialog.Builder builder = new AlertDialog.Builder(Area.this);
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

    private String MetertoHectometer(double meter) {
        double hectometer = meter/1e+6;
        return String.valueOf(hectometer);
    }

    private String MetertoDecameter(double meter) {
        double decameter = meter /10000;
        return String.valueOf(decameter);
    }

    private String MetertoDecimeter(double meter) {
        double decimeter = meter /100;
        return String.valueOf(decimeter);
    }

    private String MetertoCentimeter(double meter) {
        double centimeter = meter*100;
        return String.valueOf(centimeter);
    }

    private String MetertoKilometer(double meter) {
        double kilometer = meter* 10000;
        return String.valueOf(kilometer);
    }

    private String KilometertoHectometer(double kilometer) {
        double hectometer = kilometer*100;
        return String.valueOf(hectometer);
    }

    private String KilometertoDecameter(double kilometer) {
        double decameter = kilometer* 10000;
        return String.valueOf(decameter);
    }

    private String KilometertoDecimeter(double kilometer) {
        double decimeter = kilometer*1e+8;
        return String.valueOf(decimeter);
    }

    private String KilometertoCentimeter(double kilometer) {
        double centimeter = kilometer*1e+10;
        return String.valueOf(centimeter);
    }

    private String KilometertoMeter(double kilometer) {
        double celcius = kilometer*1e+6;
        return String.valueOf(celcius);
    }

    private String HectometertoDecameter(double hectometer) {
        double decameter = hectometer * 100;
        return String.valueOf(decameter);
    }

    private String HectometertoDecimeter(double hectometer) {
        double decimeter = hectometer*1e+6;
        return String.valueOf(decimeter);
    }

    private String HectometertoCentimeter(double hectometer) {
        double centimeter = hectometer*1e+8;
        return String.valueOf(centimeter);
    }

    private String HectometertoMeter(double hectometer) {
        double celcius = hectometer* 10000;
        return String.valueOf(celcius);
    }

    private String HectometertoKilometer(double hectometer) {
        double kilometer = hectometer/100;
        return String.valueOf(kilometer);
    }

    private String DecametertoDecimeter(double decameter) {
        double decimeter = decameter*10000;
        return String.valueOf(decimeter);
    }

    private String DecametertoCentimeter(double decameter) {
        double centimeter = decameter*1e+6;
        return String.valueOf(centimeter);
    }

    private String DecametertoMeter(double decameter) {
        double celcius = decameter*100;
        return String.valueOf(celcius);
    }

    private String DecametertoKilometer(double decameter) {
        double kilometer = decameter /10000;
        return String.valueOf(kilometer);
    }

    private String DecametertoHectometer(double decameter) {
        double hectometer = decameter /100;
        return String.valueOf(hectometer);
    }

    //decimeter
    private String DecimetertoCentimeter(double decimeter) {
        double centimeter = decimeter*100;
        return String.valueOf(centimeter);
    }

    private String DecimetertoMeter(double decimeter) {
        double celcius = decimeter / 100 ;
        return String.valueOf(celcius);
    }

    private String DecimetertoKilometer(double decimeter) {
        double kilometer = decimeter /1e+8;
        return String.valueOf(kilometer);
    }

    private String DecimetertoHectometer(double decimeter) {
        double hectometer = decimeter/1e+6;
        return String.valueOf(hectometer);
    }

    private String DecimetertoDecameter(double decimeter) {
        double decameter = decimeter /10000;
        return String.valueOf(decameter);
    }


    private String CentimetertoMeter(double centimeter) {
        double celcius = centimeter/10000;
        return String.valueOf(celcius);
    }

    private String CentimetertoKilometer(double centimeter) {
        double kilometer = centimeter/1e+10;
        return String.valueOf(kilometer);
    }

    private String CentimetertoHectometer(double centimeter) {
        double hectometer = centimeter/1e+8;
        return String.valueOf(hectometer);
    }

    private String CentimetertoDecameter(double centimeter) {
        double decameter = centimeter/1e+6;
        return String.valueOf(decameter);
    }

    private String CentimetertoDecimeter(double centimeter) {
        double decimeter = centimeter/100;
        return String.valueOf(decimeter);
    }
}