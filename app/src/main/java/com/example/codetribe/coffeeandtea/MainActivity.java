package com.example.codetribe.coffeeandtea;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private Button btnEspresso, btnCappuccino, btnCaffeMocha, btnAmericano, btnSkinnyLatte, btnEnglishBreakfastTea, btnMintBlendTea, btnChamolmileTea, btnCancel;
    private double total = 0;
    private Dialog dialog;
    private AlertDialog.Builder builder;
    public ArrayList<String> dataname = new ArrayList<>();
    public static final String DATA = "data";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnEspresso = (Button) findViewById(R.id.btnEspresso);
        btnCappuccino = (Button) findViewById(R.id.btnCappuccino);
        btnCaffeMocha = (Button) findViewById(R.id.btnCaffeMocha);
        btnAmericano = (Button) findViewById(R.id.btnAmericano);
        btnSkinnyLatte = (Button) findViewById(R.id.btnSkinnyLAtte);
        btnEnglishBreakfastTea = (Button) findViewById(R.id.btnEnglishBreakfastTea);
        btnMintBlendTea = (Button) findViewById(R.id.btnMintBlendTea);
        btnChamolmileTea = (Button) findViewById(R.id.btnChamolmileTea);
        btnCancel = (Button) findViewById(R.id.btnCancel);


        btnEspresso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                dialog = new Dialog(MainActivity.this);
                builder = new AlertDialog.Builder(MainActivity.this);


                builder.setTitle("Order Your Espresso");
                builder.setMessage("R20.30");
                builder.setNegativeButton("Cancel", null);
                builder.setPositiveButton("Order", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        double price = 20.30;
                        total = total + price;

                        Toast.makeText(MainActivity.this, "you ordered espresso and Total is R" + total, Toast.LENGTH_LONG).show();
                        dataname.add("espresso");


                    }
                });

                dialog = builder.create();
                dialog.show();

            }
        });


        btnCappuccino.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dialog = new Dialog(MainActivity.this);
                builder = new AlertDialog.Builder(MainActivity.this);


                builder.setTitle("Order Your Cappuccino");
                builder.setMessage("R25.50");
                builder.setNegativeButton("Cancel", null);
                builder.setPositiveButton("Order", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        double price = 25.50;

                        total = total + price;

                        Toast.makeText(MainActivity.this, "you ordered Cappuccino and Total is R" + total, Toast.LENGTH_LONG).show();
                        dataname.add("Cappuccino");
                    }
                });

                dialog = builder.create();
                dialog.show();

            }
        });

        btnCaffeMocha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dialog = new Dialog(MainActivity.this);
                builder = new AlertDialog.Builder(MainActivity.this);


                builder.setTitle("Order Your Caffe Mocha");
                builder.setMessage("R18.80");
                builder.setNegativeButton("Cancel", null);
                builder.setPositiveButton("Order", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        double price = 18.80;
                        total = total + price;

                        Toast.makeText(MainActivity.this, "you ordered Caffe Mocha and Total is R" + total, Toast.LENGTH_LONG).show();
                        dataname.add("caffeMocha");

                    }
                });

                dialog = builder.create();
                dialog.show();

            }
        });

        btnAmericano.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dialog = new Dialog(MainActivity.this);
                builder = new AlertDialog.Builder(MainActivity.this);


                builder.setTitle("Order Your Americano");
                builder.setMessage("R22.00");
                builder.setNegativeButton("Cancel", null);
                builder.setPositiveButton("Order", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        double price = 22.00;
                        total = total + price;

                        Toast.makeText(MainActivity.this, "you ordered Americano and Total is R" + total, Toast.LENGTH_LONG).show();
                        dataname.add("Americano");

                    }
                });

                dialog = builder.create();
                dialog.show();

            }
        });

        btnSkinnyLatte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dialog = new Dialog(MainActivity.this);
                builder = new AlertDialog.Builder(MainActivity.this);


                builder.setTitle("Order Your Skinny Latte");
                builder.setMessage("R23.55");
                builder.setNegativeButton("Cancel", null);
                builder.setPositiveButton("Order", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        double price = 23.55;
                        total = total + price;

                        Toast.makeText(MainActivity.this, "you ordered skinny latte and Total is R" + total, Toast.LENGTH_LONG).show();
                        dataname.add("SkinnyLatte");

                    }
                });

                dialog = builder.create();
                dialog.show();

            }
        });

        btnEnglishBreakfastTea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dialog = new Dialog(MainActivity.this);
                builder = new AlertDialog.Builder(MainActivity.this);


                builder.setTitle("Order Your English Breakfast tea");
                builder.setMessage("R16.00");
                builder.setNegativeButton("Cancel", null);
                builder.setPositiveButton("Order", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        double price = 16.00;
                        total = total + price;

                        Toast.makeText(MainActivity.this, "you ordered english breakfast tea and Total is R" + total, Toast.LENGTH_LONG).show();
                        dataname.add("EnglishBreakfastTea");

                    }
                });

                dialog = builder.create();
                dialog.show();

            }
        });

        btnMintBlendTea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dialog = new Dialog(MainActivity.this);
                builder = new AlertDialog.Builder(MainActivity.this);


                builder.setTitle("Order Your Mint Blend Tea");
                builder.setMessage("R18.50");
                builder.setNegativeButton("Cancel", null);
                builder.setPositiveButton("Order", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        double price = 18.50;
                        total = total + price;

                        Toast.makeText(MainActivity.this, "you ordered mint blend tea and Total is R" + total, Toast.LENGTH_LONG).show();
                        dataname.add("MintBlendTea");

                    }
                });

                dialog = builder.create();
                dialog.show();

            }
        });

        btnChamolmileTea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dialog = new Dialog(MainActivity.this);
                builder = new AlertDialog.Builder(MainActivity.this);


                builder.setTitle("Order Your Chamolmile tea");
                builder.setMessage("R13.00");
                builder.setNegativeButton("Cancel", null);
                builder.setPositiveButton("Order", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        double price = 13.00;
                        total = total + price;

                        Toast.makeText(MainActivity.this, "you ordered Chamolmile tea and Total is R" + total, Toast.LENGTH_LONG).show();
                        dataname.add("ChamolmileTea");

                    }
                });

                dialog = builder.create();
                dialog.show();

            }
        });

        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, output.class);
                intent.putStringArrayListExtra(DATA, dataname);
                startActivity(intent);


            }
        });
    }
}
