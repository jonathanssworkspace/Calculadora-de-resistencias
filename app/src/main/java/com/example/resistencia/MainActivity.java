package com.example.resistencia;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    double band1,band2,band3,band4,band5;
    int status;
    String bd1;
    ChipGroup banda1Group, banda2Group, banda3Group, banda4Group, banda5Group;
    View band1image, band2image, band3image, band4image;
    Chip Home;
    TextView Resp, BandInf;
    FrameLayout Resistencia;
    RadioGroup bandGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        banda1Group = findViewById(R.id.banda1Group);
        banda2Group = findViewById(R.id.banda2Group);
        banda3Group = findViewById(R.id.banda3Group);
        Home = findViewById(R.id.Inicio);
        banda4Group = findViewById(R.id.banda4Group);
        band1image = findViewById(R.id.band1Overlay);
        band2image = findViewById(R.id.band2Overlay);
        band3image = findViewById(R.id.band3Overlay);
        band4image = findViewById(R.id.band4Overlay);
        banda5Group = findViewById(R.id.banda5Group);
        Resp = findViewById(R.id.Res);
        BandInf = findViewById(R.id.BandsInfo);
        Resistencia = findViewById(R.id.resContainer);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        bandGroup = findViewById(R.id.bands);
        bandGroup.setOnCheckedChangeListener((group, checkedId) -> {
            if(checkedId == R.id.fourBands){
                banda1Group.setVisibility(View.VISIBLE);
                BandInf.setVisibility(View.VISIBLE);
                bd1 = "Banda 1";
                BandInf.setText(bd1);
                status = 4;
                Resistencia.setVisibility(View.VISIBLE);
                bandGroup.setVisibility(View.GONE);
            }else if(checkedId == R.id.fiveBands) {
                banda1Group.setVisibility(View.VISIBLE);
                BandInf.setVisibility(View.VISIBLE);
                String bd1 = "Banda 1";
                BandInf.setText(bd1);
                status = 5;
                Resistencia.setVisibility(View.VISIBLE);
                bandGroup.setVisibility(View.GONE);
            }
        });

        banda1Group.setOnCheckedStateChangeListener(((chipGroup, checkedIds) -> {
            if(checkedIds == null || checkedIds.isEmpty()) return;

            int selectedId = checkedIds.get(0);


            if(selectedId == R.id.chipNegro){
                band1 = 0;
                band1image.setBackgroundColor(getColor(R.color.negro));
                banda1Group.setVisibility(View.GONE);
                banda2Group.setVisibility(View.VISIBLE);
                bd1 = "Banda 2";
                BandInf.setText(bd1);
            }else if (selectedId == R.id.chipCafe){
                band1 = 1;
                band1image.setBackgroundColor(getColor(R.color.cafe));
                banda1Group.setVisibility(View.GONE);
                banda2Group.setVisibility(View.VISIBLE);
                bd1 = "Banda 2";
                BandInf.setText(bd1);
            }else if (selectedId == R.id.chipRojo){
                band1 = 2;
                band1image.setBackgroundColor(getColor(R.color.rojo));
                banda1Group.setVisibility(View.GONE);
                banda2Group.setVisibility(View.VISIBLE);
                bd1 = "Banda 2";
                BandInf.setText(bd1);
            }else if (selectedId == R.id.chipNaranja){
                band1 = 3;
                band1image.setBackgroundColor(getColor(R.color.naranja));
                banda1Group.setVisibility(View.GONE);
                banda2Group.setVisibility(View.VISIBLE);
                bd1 = "Banda 2";
                BandInf.setText(bd1);
            }else if (selectedId == R.id.chipAmarillo){
                band1 = 4;
                band1image.setBackgroundColor(getColor(R.color.amarillo));
                banda1Group.setVisibility(View.GONE);
                banda2Group.setVisibility(View.VISIBLE);
                bd1 = "Banda 2";
                BandInf.setText(bd1);
            }else if (selectedId == R.id.chipVerde){
                band1 = 5;
                band1image.setBackgroundColor(getColor(R.color.verde));
                banda1Group.setVisibility(View.GONE);
                banda2Group.setVisibility(View.VISIBLE);
                bd1 = "Banda 2";
                BandInf.setText(bd1);
            }else if (selectedId == R.id.chipAzul){
                band1 = 6;
                band1image.setBackgroundColor(getColor(R.color.azul));
                banda1Group.setVisibility(View.GONE);
                banda2Group.setVisibility(View.VISIBLE);
                bd1 = "Banda 2";
                BandInf.setText(bd1);
            }else if (selectedId == R.id.chipMorado){
                band1 = 7;
                band1image.setBackgroundColor(getColor(R.color.morado));
                banda1Group.setVisibility(View.GONE);
                banda2Group.setVisibility(View.VISIBLE);
                bd1 = "Banda 2";
                BandInf.setText(bd1);
            }else if (selectedId == R.id.chipGris){
                band1 = 8;
                band1image.setBackgroundColor(getColor(R.color.gris));
                banda1Group.setVisibility(View.GONE);
                banda2Group.setVisibility(View.VISIBLE);
                bd1 = "Banda 2";
                BandInf.setText(bd1);
            }else if (selectedId == R.id.chipBlanco){
                band1 = 9;
                band1image.setBackgroundColor(getColor(R.color.blanco));
                banda1Group.setVisibility(View.GONE);
                banda2Group.setVisibility(View.VISIBLE);
                bd1 = "Banda 2";
                BandInf.setText(bd1);
            }else if (selectedId == R.id.chipReturnMain){

                bandGroup.clearCheck();
                bandGroup.setVisibility(View.VISIBLE);
                banda1Group.setVisibility(View.GONE);
                BandInf.setVisibility(View.GONE);
                Resistencia.setVisibility(View.GONE);
            }
        }));
        banda2Group.setOnCheckedStateChangeListener(((chipGroup, checkedIds) -> {
            if(checkedIds == null || checkedIds.isEmpty()) return;

            int selectedId = checkedIds.get(0);


            if(selectedId == R.id.chipNegro2){
                band2 = 0;
                band2image.setBackgroundColor(getColor(R.color.negro));
                banda2Group.setVisibility(View.GONE);
                bd1 = "Banda 3";
                BandInf.setText(bd1);
                if(status == 4) {
                    banda3Group.setVisibility(View.VISIBLE);
                }else {
                    banda5Group.setVisibility(View.VISIBLE);
                }
            }else if (selectedId == R.id.chipCafe2){
                band2 = 1;
                band2image.setBackgroundColor(getColor(R.color.cafe));
                banda2Group.setVisibility(View.GONE);
                bd1 = "Banda 3";
                BandInf.setText(bd1);
                if(status == 4) {
                    banda3Group.setVisibility(View.VISIBLE);
                }else {
                    banda5Group.setVisibility(View.VISIBLE);
                }
            }else if (selectedId == R.id.chipRojo2){
                band2 = 2;
                band2image.setBackgroundColor(getColor(R.color.rojo));
                banda2Group.setVisibility(View.GONE);
                bd1 = "Banda 3";
                BandInf.setText(bd1);
                if(status == 4) {
                    banda3Group.setVisibility(View.VISIBLE);
                }else {
                    banda5Group.setVisibility(View.VISIBLE);
                }
            }else if (selectedId == R.id.chipNaranja2){
                band2 = 3;
                band2image.setBackgroundColor(getColor(R.color.naranja));
                banda2Group.setVisibility(View.GONE);
                bd1 = "Banda 3";
                BandInf.setText(bd1);
                if(status == 4) {
                    banda3Group.setVisibility(View.VISIBLE);
                }else {
                    banda5Group.setVisibility(View.VISIBLE);
                }
            }else if (selectedId == R.id.chipAmarillo2){
                band2 = 4;
                band2image.setBackgroundColor(getColor(R.color.amarillo));
                banda2Group.setVisibility(View.GONE);
                bd1 = "Banda 3";
                BandInf.setText(bd1);
                if(status == 4) {
                    banda3Group.setVisibility(View.VISIBLE);
                }else {
                    banda5Group.setVisibility(View.VISIBLE);
                }
            }else if (selectedId == R.id.chipVerde2){
                band2 = 5;
                band2image.setBackgroundColor(getColor(R.color.verde));
                banda2Group.setVisibility(View.GONE);
                bd1 = "Banda 3";
                BandInf.setText(bd1);
                if(status == 4) {
                    banda3Group.setVisibility(View.VISIBLE);
                }else {
                    banda5Group.setVisibility(View.VISIBLE);
                }
            }else if (selectedId == R.id.chipAzul2){
                band2 = 6;
                band2image.setBackgroundColor(getColor(R.color.azul));
                banda2Group.setVisibility(View.GONE);
                bd1 = "Banda 3";
                BandInf.setText(bd1);
                if(status == 4) {
                    banda3Group.setVisibility(View.VISIBLE);
                }else {
                    banda5Group.setVisibility(View.VISIBLE);
                }
            }else if (selectedId == R.id.chipMorado2){
                band2 = 7;
                band2image.setBackgroundColor(getColor(R.color.morado));
                banda2Group.setVisibility(View.GONE);
                bd1 = "Banda 3";
                BandInf.setText(bd1);
                if(status == 4) {
                    banda3Group.setVisibility(View.VISIBLE);
                }else {
                    banda5Group.setVisibility(View.VISIBLE);
                }
            }else if (selectedId == R.id.chipGris2){
                band2 = 8;
                band2image.setBackgroundColor(getColor(R.color.gris));
                banda2Group.setVisibility(View.GONE);
                bd1 = "Banda 3";
                BandInf.setText(bd1);
                if(status == 4) {
                    banda3Group.setVisibility(View.VISIBLE);
                }else {
                    banda5Group.setVisibility(View.VISIBLE);
                }
            }else if (selectedId == R.id.chipBlanco2){
                band2 = 9;
                band2image.setBackgroundColor(getColor(R.color.blanco));
                banda2Group.setVisibility(View.GONE);
                bd1 = "Banda 3";
                BandInf.setText(bd1);
                if(status == 4) {
                    banda3Group.setVisibility(View.VISIBLE);
                }else {
                    banda5Group.setVisibility(View.VISIBLE);
                }
            }else if (selectedId == R.id.chipReturn){
                band1 = 0;
                bd1 = "Banda 1";
                BandInf.setText(bd1);
                band1image.setBackgroundColor(getColor(R.color.transparent));
                band2image.setBackgroundColor(getColor(R.color.transparent));
                banda1Group.setVisibility(View.VISIBLE);
                banda2Group.setVisibility(View.GONE);
            }
        }));

        banda5Group.setOnCheckedStateChangeListener(((chipGroup, checkedIds) -> {
            if(checkedIds == null || checkedIds.isEmpty()) return;

            int selectedId = checkedIds.get(0);


            if(selectedId == R.id.chipNegro5){
                band3 = 0;
                band3image.setBackgroundColor(getColor(R.color.negro));
                banda5Group.setVisibility(View.GONE);
                bd1 = "Banda 4";
                BandInf.setText(bd1);
                banda3Group.setVisibility(View.VISIBLE);
            }else if (selectedId == R.id.chipCafe5){
                band3 = 1;
                band3image.setBackgroundColor(getColor(R.color.cafe));
                banda5Group.setVisibility(View.GONE);
                bd1 = "Banda 4";
                BandInf.setText(bd1);
                banda3Group.setVisibility(View.VISIBLE);
            }else if (selectedId == R.id.chipRojo5){
                band3 = 2;
                band3image.setBackgroundColor(getColor(R.color.rojo));
                banda5Group.setVisibility(View.GONE);
                bd1 = "Banda 4";
                banda3Group.setVisibility(View.VISIBLE);
                BandInf.setText(bd1);
            }else if (selectedId == R.id.chipNaranja5){
                band3 = 3;
                band3image.setBackgroundColor(getColor(R.color.naranja));
                banda5Group.setVisibility(View.GONE);
                bd1 = "Banda 4";
                BandInf.setText(bd1);
                banda3Group.setVisibility(View.VISIBLE);
            }else if (selectedId == R.id.chipAmarillo5){
                band3 = 4;
                band3image.setBackgroundColor(getColor(R.color.amarillo));
                banda5Group.setVisibility(View.GONE);
                bd1 = "Banda 4";
                BandInf.setText(bd1);
                banda3Group.setVisibility(View.VISIBLE);
            }else if (selectedId == R.id.chipVerde5){
                band3 = 5;
                band3image.setBackgroundColor(getColor(R.color.verde));
                banda5Group.setVisibility(View.GONE);
                bd1 = "Banda 4";
                BandInf.setText(bd1);
                banda3Group.setVisibility(View.VISIBLE);
            }else if (selectedId == R.id.chipAzul5){
                band3 = 6;
                band3image.setBackgroundColor(getColor(R.color.azul));
                banda5Group.setVisibility(View.GONE);
                bd1 = "Banda 4";
                BandInf.setText(bd1);
                banda3Group.setVisibility(View.VISIBLE);
            }else if (selectedId == R.id.chipMorado5){
                band3 = 7;
                band3image.setBackgroundColor(getColor(R.color.morado));
                banda5Group.setVisibility(View.GONE);
                bd1 = "Banda 4";
                BandInf.setText(bd1);
                banda3Group.setVisibility(View.VISIBLE);
            }else if (selectedId == R.id.chipGris5){
                band3 = 8;
                band3image.setBackgroundColor(getColor(R.color.gris));
                banda5Group.setVisibility(View.GONE);
                bd1 = "Banda 4";
                BandInf.setText(bd1);
                banda3Group.setVisibility(View.VISIBLE);
            }else if (selectedId == R.id.chipBlanco5){
                band3 = 9;
                band3image.setBackgroundColor(getColor(R.color.blanco));
                banda5Group.setVisibility(View.GONE);
                bd1 = "Banda 4";
                BandInf.setText(bd1);
                banda3Group.setVisibility(View.VISIBLE);
            }else if (selectedId == R.id.chipReturn4){
                band2 = 0;
                bd1 = "Banda 2";
                BandInf.setText(bd1);
                band2image.setBackgroundColor(getColor(R.color.transparent));
                band3image.setBackgroundColor(getColor(R.color.transparent));
                banda2Group.setVisibility(View.VISIBLE);
                banda5Group.setVisibility(View.GONE);
            }
        }));

        banda3Group.setOnCheckedStateChangeListener(((chipGroup, checkedIds) -> {
            if(checkedIds == null || checkedIds.isEmpty()) return;

            int selectedId = checkedIds.get(0);

            if(selectedId == R.id.chipNegro3){
                banda3Group.setVisibility(View.GONE);
                if(status == 4){
                    band3image.setBackgroundColor(getColor(R.color.negro));
                    band3 = 1;
                    banda4Group.setVisibility(View.VISIBLE);
                    bd1 = "Banda 4";
                    BandInf.setText(bd1);
                }else {
                    band4 = 1;
                    band4image.setBackgroundColor(getColor(R.color.negro));
                    banda4Group.setVisibility(View.VISIBLE);
                    bd1 = "Banda 5";
                    BandInf.setText(bd1);
                }
            }else if (selectedId == R.id.chipCafe3){
                banda3Group.setVisibility(View.GONE);
                if(status == 4){
                    band3image.setBackgroundColor(getColor(R.color.cafe));
                    band3 = 10;
                    banda4Group.setVisibility(View.VISIBLE);
                    bd1 = "Banda 4";
                    BandInf.setText(bd1);
                }else {
                    band4 = 10;
                    band4image.setBackgroundColor(getColor(R.color.cafe));
                    banda4Group.setVisibility(View.VISIBLE);
                    bd1 = "Banda 5";
                    BandInf.setText(bd1);
                }
            }else if (selectedId == R.id.chipRojo3){
                banda3Group.setVisibility(View.GONE);
                if(status == 4){
                    band3image.setBackgroundColor(getColor(R.color.rojo));
                    band3 = 100;
                    banda4Group.setVisibility(View.VISIBLE);
                    bd1 = "Banda 4";
                    BandInf.setText(bd1);
                }else {
                    band4 = 100;
                    band4image.setBackgroundColor(getColor(R.color.rojo));
                    banda4Group.setVisibility(View.VISIBLE);
                    bd1 = "Banda 5";
                    BandInf.setText(bd1);
                }
            }else if (selectedId == R.id.chipNaranja3){

                banda3Group.setVisibility(View.GONE);
                if(status == 4){
                    band3image.setBackgroundColor(getColor(R.color.naranja));
                    band3 = 1000;
                    banda4Group.setVisibility(View.VISIBLE);
                    bd1 = "Banda 4";
                    BandInf.setText(bd1);
                }else {
                    band4 = 1000;
                    band4image.setBackgroundColor(getColor(R.color.naranja));
                    banda4Group.setVisibility(View.VISIBLE);
                    bd1 = "Banda 5";
                    BandInf.setText(bd1);
                }
            }else if (selectedId == R.id.chipAmarillo3){
                banda3Group.setVisibility(View.GONE);
                if(status == 4){
                    band3image.setBackgroundColor(getColor(R.color.amarillo));
                    band3 = 10000;
                    banda4Group.setVisibility(View.VISIBLE);
                    bd1 = "Banda 4";
                    BandInf.setText(bd1);
                }else {
                    band4 = 10000;
                    band4image.setBackgroundColor(getColor(R.color.amarillo));
                    banda4Group.setVisibility(View.VISIBLE);
                    bd1 = "Banda 5";
                    BandInf.setText(bd1);
                }
            }else if (selectedId == R.id.chipVerde3){
                banda3Group.setVisibility(View.GONE);
                if(status == 4){
                    band3image.setBackgroundColor(getColor(R.color.verde));
                    band3 = 100000;
                    banda4Group.setVisibility(View.VISIBLE);
                    bd1 = "Banda 4";
                    BandInf.setText(bd1);
                }else {
                    band4 = 100000;
                    band4image.setBackgroundColor(getColor(R.color.verde));
                    banda4Group.setVisibility(View.VISIBLE);
                    bd1 = "Banda 5";
                    BandInf.setText(bd1);
                }
            }else if (selectedId == R.id.chipAzul3){
                banda3Group.setVisibility(View.GONE);
                if(status == 4){
                    band3image.setBackgroundColor(getColor(R.color.azul));
                    band3 = 1000000;
                    banda4Group.setVisibility(View.VISIBLE);
                    bd1 = "Banda 4";
                    BandInf.setText(bd1);
                }else {
                    band4 = 1000000;
                    band4image.setBackgroundColor(getColor(R.color.azul));
                    banda4Group.setVisibility(View.VISIBLE);
                    bd1 = "Banda 5";
                    BandInf.setText(bd1);
                }
            }else if (selectedId == R.id.chipMorado3){
                banda3Group.setVisibility(View.GONE);
                if(status == 4){
                    band3image.setBackgroundColor(getColor(R.color.morado));
                    band3 = 10000000;
                    banda4Group.setVisibility(View.VISIBLE);
                    bd1 = "Banda 4";
                    BandInf.setText(bd1);
                }else {
                    band4 = 10000000;
                    band4image.setBackgroundColor(getColor(R.color.morado));
                    banda4Group.setVisibility(View.VISIBLE);
                    bd1 = "Banda 5";
                    BandInf.setText(bd1);
                }
            }else if (selectedId == R.id.chipGris3){
                banda3Group.setVisibility(View.GONE);
                if(status == 4){
                    band3image.setBackgroundColor(getColor(R.color.gris));
                    band3 = 100000000;
                    banda4Group.setVisibility(View.VISIBLE);
                    bd1 = "Banda 4";
                    BandInf.setText(bd1);
                }else {
                    band4 = 100000000;
                    band4image.setBackgroundColor(getColor(R.color.gris));
                    banda4Group.setVisibility(View.VISIBLE);
                    bd1 = "Banda 5";
                    BandInf.setText(bd1);
                }
            }else if (selectedId == R.id.chipBlanco3) {
                banda3Group.setVisibility(View.GONE);
                if(status == 4){
                    band3image.setBackgroundColor(getColor(R.color.blanco));
                    band3 = 1000000000;
                    banda4Group.setVisibility(View.VISIBLE);
                    bd1 = "Banda 4";
                    BandInf.setText(bd1);
                }else {
                    band4 = 1000000000;
                    band4image.setBackgroundColor(getColor(R.color.blanco));
                    banda4Group.setVisibility(View.VISIBLE);
                    bd1 = "Banda 5";
                    BandInf.setText(bd1);
                }
            }else if (selectedId == R.id.chipOro){
                banda3Group.setVisibility(View.GONE);
                if(status == 4){
                    band3image.setBackgroundColor(getColor(R.color.oro));
                    band3 = 0.1;
                    banda4Group.setVisibility(View.VISIBLE);
                    bd1 = "Banda 4";
                    BandInf.setText(bd1);
                }else {
                    band4 = 0.1;
                    band4image.setBackgroundColor(getColor(R.color.oro));
                    banda4Group.setVisibility(View.VISIBLE);
                    bd1 = "Banda 5";
                    BandInf.setText(bd1);
                }
            }else if (selectedId == R.id.chipPlata){
                banda3Group.setVisibility(View.GONE);
                if(status == 4){
                    band3image.setBackgroundColor(getColor(R.color.plateado));
                    band3 = 0.01;
                    banda4Group.setVisibility(View.VISIBLE);
                    bd1 = "Banda 4";
                    BandInf.setText(bd1);
                }else {
                    band4 = 0.01;
                    band4image.setBackgroundColor(getColor(R.color.plateado));
                    banda4Group.setVisibility(View.VISIBLE);
                    bd1 = "Banda 5";
                    BandInf.setText(bd1);
                }
            }else if (selectedId == R.id.chipReturn2){
                if (status == 4) {
                    band2 = 0;
                    bd1 = "Banda 2";
                    BandInf.setText(bd1);
                    band2image.setBackgroundColor(getColor(R.color.transparent));
                    band3image.setBackgroundColor(getColor(R.color.transparent));
                    banda2Group.setVisibility(View.VISIBLE);
                    banda3Group.setVisibility(View.GONE);
                }else{
                    band3 = 0;
                    bd1 = "Banda 3";
                    BandInf.setText(bd1);
                    band3image.setBackgroundColor(getColor(R.color.transparent));
                    band4image.setBackgroundColor(getColor(R.color.transparent));
                    band4image.setBackgroundColor(getColor(R.color.transparent));
                    banda5Group.setVisibility(View.VISIBLE);
                    banda3Group.setVisibility(View.GONE);
                }
            }
        }));

        banda4Group.setOnCheckedStateChangeListener(((chipGroup, checkedIds) -> {
            if(checkedIds == null || checkedIds.isEmpty()) return;

            int selectedId = checkedIds.get(0);

            if (selectedId == R.id.chipCafe4){
                if(status == 4) {
                    band4 = 1;
                    band4image.setBackgroundColor(getColor(R.color.cafe));
                }else{
                    band5 = 1;
                }
                CalcularResistencia();
                Home.setVisibility(View.VISIBLE);
            }else if (selectedId == R.id.chipRojo4){
                if(status == 4) {
                    band4 = 2;
                    band4image.setBackgroundColor(getColor(R.color.rojo));
                }else{
                    band5 = 2;
                }
                CalcularResistencia();
                Home.setVisibility(View.VISIBLE);
            }else if (selectedId == R.id.chipOro2){
                if(status == 4) {
                    band4 = 5;
                    band4image.setBackgroundColor(getColor(R.color.oro));
                }else{
                    band5 = 5;
                }
                CalcularResistencia();
                Home.setVisibility(View.VISIBLE);
            }else if (selectedId == R.id.chipPlata2){
                if(status == 4) {
                    band4 = 10;
                    band4image.setBackgroundColor(getColor(R.color.plateado));
                }else{
                    band5 = 10;
                }
                CalcularResistencia();
                Home.setVisibility(View.VISIBLE);
            }else if (selectedId == R.id.chipReturn3){
                if (status == 5){
                    band4 = 0;
                    bd1 = "Banda 4";
                    BandInf.setText(bd1);
                    banda3Group.setVisibility(View.VISIBLE);
                    banda4Group.setVisibility(View.GONE);
                    band4image.setBackgroundColor(getColor(R.color.transparent));
                }else {
                    bd1 = "Banda 3";
                    BandInf.setText(bd1);
                    band3 = 0;
                    band3image.setBackgroundColor(getColor(R.color.transparent));
                    band4image.setBackgroundColor(getColor(R.color.transparent));
                    banda3Group.setVisibility(View.VISIBLE);
                    banda4Group.setVisibility(View.GONE);
                }
            }
        }));

        Home.setOnClickListener(v -> resetAll());
    }

    private void resetAll() {
        band1 = band2 = band3 = band4 = band5 = 0;
        status = 0;

        band1image.setBackgroundColor(getColor(R.color.transparent));
        band2image.setBackgroundColor(getColor(R.color.transparent));
        band3image.setBackgroundColor(getColor(R.color.transparent));
        band4image.setBackgroundColor(getColor(R.color.transparent));
        bandGroup.clearCheck();
        bandGroup.setVisibility(View.VISIBLE);
        banda1Group.setVisibility(View.GONE);
        banda2Group.setVisibility(View.GONE);
        banda3Group.setVisibility(View.GONE);
        banda4Group.setVisibility(View.GONE);
        banda5Group.setVisibility(View.GONE);
        banda1Group.clearCheck();
        banda2Group.clearCheck();
        banda3Group.clearCheck();
        banda4Group.clearCheck();
        Resistencia.setVisibility(View.GONE);
        BandInf.setVisibility(View.GONE);
        Resp.setVisibility(View.GONE);
        Resp.setText("");
        Home.setVisibility(View.GONE);
    }

    private String ValorConvertido(double Resp){
        String RespuestaSufijo;
        if(Resp >= 1000 && Resp < 1000000){
            Resp = Resp / 1000;
            RespuestaSufijo = Resp + "K Ohms";
        } else if (Resp >= 1000000 && Resp < 1000000000) {
            Resp = Resp / 1000000;
            RespuestaSufijo = Resp + "M Ohms";
        } else if (Resp >= 1000000000) {
            Resp = Resp / 1000000000;
            RespuestaSufijo = Resp + "G Ohms";
        }else {
            RespuestaSufijo = Resp + " Ohms";
        }
        return RespuestaSufijo;
    }
    private void CalcularResistencia(){
        double Resultado;
        if(status == 4){
            banda4Group.setVisibility(View.GONE);
            Resultado = ((band1 * 10) + band2) * band3;
            Resp.setVisibility(View.VISIBLE);
            String Sufijo = ValorConvertido(Resultado);
            Resp.setText(Sufijo + "\n Tolerancia: " + band4 + "%");
        }else{
            banda4Group.setVisibility(View.GONE);
            Resultado = ((band1 * 100) + (band2 * 10) + band3) * band4;
            Resp.setVisibility(View.VISIBLE);
            String Sufijo = ValorConvertido(Resultado);
            Resp.setText(Sufijo + "\n Tolerancia: " + band5 + "%");
        }

    }
}