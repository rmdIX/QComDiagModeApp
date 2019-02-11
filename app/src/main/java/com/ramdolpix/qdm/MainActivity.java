package com.ramdolpix.qdm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.io.DataOutputStream;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onClickDMode(View view) {
        Intent diagModeIntent = new Intent(MainActivity.this,DiagActivity.class);
        startActivity(diagModeIntent);
        //Активити DiagMode.Отдельное окно с Diag кнопками.
    }

    public void onClickReboot(View view) {
        Intent rebootIntent = new Intent(MainActivity.this,RebootActivity.class);
        startActivity(rebootIntent);
        //переход на активити перезагрузки
    }
}

