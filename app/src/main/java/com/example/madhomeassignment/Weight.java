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

public class Weight extends AppCompatActivity {

    EditText from;
    EditText to;
    TextView textfrom;
    TextView textto;
    Button convert;
    Button fform;
    Button tform;
    final String[] values = new String[]{
            "Kilogram",
            "Gram",
            "Exa Gram",
            "Peta Gram",
            "Tera Gram",
            "Giga Gram"
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
                    Toast.makeText( Weight.this,"Please Enter the values",Toast.LENGTH_LONG).show();
                }
                else if(textfrom.getText().equals("---") || textto.getText().equals("---"))
                {
                    Toast.makeText(Weight.this,"Please Select the Units",Toast.LENGTH_LONG).show();
                }
                else {
                    if (textfrom.getText().toString().equals(values[0])) {
                        if (textto.getText().toString().equals(values[0])) {
                            to.setText(tempInput);
                        } else if (textto.getText().toString().equals(values[1])) {
                            to.setText(kilogramToGram(Double.parseDouble(tempInput)));
                        } else if (textto.getText().toString().equals(values[2])) {
                            to.setText(kilogramToExaGram(Double.parseDouble(tempInput)));
                        } else if (textto.getText().toString().equals(values[3])) {
                            to.setText(kilogramToPetaGram(Double.parseDouble(tempInput)));
                        } else if (textto.getText().toString().equals(values[4])) {
                            to.setText(kilogramToTeraGram(Double.parseDouble(tempInput)));
                        } else if (textto.getText().toString().equals(values[5])) {
                            to.setText(kilogramToGigaGram(Double.parseDouble(tempInput)));
                        }
                    } else if (textfrom.getText().toString().equals(values[1])) {
                        if (textto.getText().toString().equals(values[0])) {
                            to.setText(gramToKiloGram(Double.parseDouble(tempInput)));
                        } else if (textto.getText().toString().equals(values[1])) {
                            to.setText(tempInput);
                        } else if (textto.getText().toString().equals(values[2])) {
                            to.setText(gramToExaGram(Double.parseDouble(tempInput)));
                        } else if (textto.getText().toString().equals(values[3])) {
                            to.setText(gramToPetaGram(Double.parseDouble(tempInput)));
                        } else if (textto.getText().toString().equals(values[4])) {
                            to.setText(gramToTeraGram(Double.parseDouble(tempInput)));
                        } else if (textto.getText().toString().equals(values[5])) {
                            to.setText(gramToGigaGram(Double.parseDouble(tempInput)));
                        }
                    } else if (textfrom.getText().toString().equals(values[2])) {
                        if (textto.getText().toString().equals(values[0])) {
                            to.setText(exaGramToKiloGram(Double.parseDouble(tempInput)));
                        } else if (textto.getText().toString().equals(values[1])) {
                            to.setText(exaGramToGram(Double.parseDouble(tempInput)));
                        } else if (textto.getText().toString().equals(values[2])) {
                            to.setText(tempInput);
                        } else if (textto.getText().toString().equals(values[3])) {
                            to.setText(exaGramToPetaGram(Double.parseDouble(tempInput)));
                        } else if (textto.getText().toString().equals(values[4])) {
                            to.setText(exaGramToTeraGram(Double.parseDouble(tempInput)));
                        } else if (textto.getText().toString().equals(values[5])) {
                            to.setText(exaGramToGigaGram(Double.parseDouble(tempInput)));
                        }
                    } else if (textfrom.getText().toString().equals(values[3])) {
                        if (textto.getText().toString().equals(values[0])) {
                            to.setText(petaGramToKiloGram(Double.parseDouble(tempInput)));
                        } else if (textto.getText().toString().equals(values[1])) {
                            to.setText(petaGramToExaGram(Double.parseDouble(tempInput)));
                        } else if (textto.getText().toString().equals(values[2])) {
                            to.setText(petaGramToExaGram(Double.parseDouble(tempInput)));
                        } else if (textto.getText().toString().equals(values[3])) {
                            to.setText(tempInput);
                        } else if (textto.getText().toString().equals(values[4])) {
                            to.setText(petaGramToTeraGram(Double.parseDouble(tempInput)));
                        } else if (textto.getText().toString().equals(values[5])) {
                            to.setText(petaGramToGigaGram(Double.parseDouble(tempInput)));
                        }
                    } else if (textfrom.getText().toString().equals(values[4])) {
                        if (textto.getText().toString().equals(values[0])) {
                            to.setText(teraGramToKiloGram(Double.parseDouble(tempInput)));
                        } else if (textto.getText().toString().equals(values[1])) {
                            to.setText(teraGramToGram(Double.parseDouble(tempInput)));
                        } else if (textto.getText().toString().equals(values[2])) {
                            to.setText(teraGramToExaGram(Double.parseDouble(tempInput)));
                        } else if (textto.getText().toString().equals(values[3])) {
                            to.setText(teraGramToPetaGram(Double.parseDouble(tempInput)));
                        } else if (textto.getText().toString().equals(values[4])) {
                            to.setText(tempInput);
                        } else if (textto.getText().toString().equals(values[5])) {
                            to.setText(teraGramToGigaGram(Double.parseDouble(tempInput)));
                        }
                    } else if (textfrom.getText().toString().equals(values[5])) {
                        if (textto.getText().toString().equals(values[0])) {
                            to.setText(gigaGramToKiloGram(Double.parseDouble(tempInput)));
                        } else if (textto.getText().toString().equals(values[1])) {
                            to.setText(gigaGramToGram(Double.parseDouble(tempInput)));
                        } else if (textto.getText().toString().equals(values[2])) {
                            to.setText(gigaGramToExaGram(Double.parseDouble(tempInput)));
                        } else if (textto.getText().toString().equals(values[3])) {
                            to.setText(gigaGramToPetaGram(Double.parseDouble(tempInput)));
                        } else if (textto.getText().toString().equals(values[4])) {
                            to.setText(gigaGramToTeraGram(Double.parseDouble(tempInput)));
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

                final AlertDialog.Builder builder = new AlertDialog.Builder(Weight.this);
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
                final AlertDialog.Builder builder = new AlertDialog.Builder(Weight.this);
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

    private String kilogramToGram(double kilogram) {
        double gram = kilogram * 1000;
        return String.valueOf(gram);
    }

    private String kilogramToExaGram(double kilogram) {
        double exaGram = kilogram * 1.0E-15;
        return String.valueOf(exaGram);
    }

    private String kilogramToPetaGram(double kilogram) {
        double petaGram = kilogram * 1.0E-12;
        return String.valueOf(petaGram);
    }

    private String kilogramToTeraGram(double kilogram) {
        double teraGram = kilogram * 1.0E-9;
        return String.valueOf(teraGram);
    }

    private String kilogramToGigaGram(double kilogram) {
        double gigaGram = kilogram / 1000000;
        return String.valueOf(gigaGram);
    }

    //Gram
    private String gramToExaGram(double gram) {
        double exaGram = gram * 1.0E-18;
        return String.valueOf(exaGram);
    }

    private String gramToPetaGram(double gram) {
        double petaGram = gram * 1.0E-15;
        return String.valueOf(petaGram);
    }

    private String gramToTeraGram(double gram) {
        double teraGram = gram * 1.0E-12;
        return String.valueOf(teraGram);
    }

    private String gramToGigaGram(double gram) {
        double gigaGram = gram * 1.0E-9;
        return String.valueOf(gigaGram);
    }

    private String gramToKiloGram(double gram) {
        double kiloGram = gram * 0.001;
        return String.valueOf(kiloGram);
    }

    //Exa Gram
    private String exaGramToPetaGram(double exaGram) {
        double petaGram = exaGram * 1000;
        return String.valueOf(petaGram);
    }

    private String exaGramToTeraGram(double exaGram) {
        double teraGram = exaGram * 1000000;
        return String.valueOf(teraGram);
    }

    private String exaGramToGigaGram(double exaGram) {
        double gigaGram = exaGram * 1e+9;
        return String.valueOf(gigaGram);
    }

    private String exaGramToKiloGram(double exaGram) {
        double kiloGram = exaGram * 1.0E+15;
        return String.valueOf(kiloGram);
    }

    private String exaGramToGram(double exaGram) {
        double gram = exaGram * 1.0E+18;
        return String.valueOf(gram);
    }

    //Peta Gram
    private String petaGramToTeraGram(double petaGram) {
        double teraGram = petaGram * 1000;
        return String.valueOf(teraGram);
    }

    private String petaGramToGigaGram(double petaGram) {
        double gigaGram = petaGram * 1e+6;
        return String.valueOf(gigaGram);
    }

    private String petaGramToKiloGram(double petaGram) {
        double kiloGram = petaGram * 1e+12;
        return String.valueOf(kiloGram);
    }

    private String petaGramToGram(double petaGram) {
        double Gram = petaGram * 1e+15;
        return String.valueOf(Gram);
    }

    private String petaGramToExaGram(double petaGram) {
        double exaGram = petaGram / 1000;
        return String.valueOf(exaGram);
    }

    //Tera Gram
    private String teraGramToGigaGram(double teraGram) {
        double gigaGram = teraGram * 1000;
        return String.valueOf(gigaGram);
    }

    private String teraGramToKiloGram(double teraGram) {
        double kiloGram = teraGram * 1e+9;
        return String.valueOf(kiloGram);
    }

    private String teraGramToGram(double teraGram) {
        double Gram = teraGram * 1e+12;
        return String.valueOf(Gram);
    }

    private String teraGramToExaGram(double teraGram) {
        double exaGram = teraGram / 1e+6;
        return String.valueOf(exaGram);
    }

    private String teraGramToPetaGram(double teraGram) {
        double petaGram = teraGram / 1000;
        return String.valueOf(petaGram);
    }

    //Giga Gram
    private String gigaGramToKiloGram(double gigaGram) {
        double kiloGram = gigaGram * 1e+6;
        return String.valueOf(kiloGram);
    }

    private String gigaGramToGram(double gigaGram) {
        double Gram = gigaGram * 1e+9;
        return String.valueOf(Gram);
    }

    private String gigaGramToExaGram(double gigaGram) {
        double exaGram = gigaGram / 1e+9;
        return String.valueOf(exaGram);
    }

    private String gigaGramToPetaGram(double gigaGram) {
        double petaGram = gigaGram / 1e+6;
        return String.valueOf(petaGram);
    }

    private String gigaGramToTeraGram(double gigaGram) {
        double teraGram = gigaGram / 1000;
        return String.valueOf(teraGram);
    }
}