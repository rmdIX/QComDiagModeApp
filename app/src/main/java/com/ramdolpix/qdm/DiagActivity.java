package com.ramdolpix.qdm;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.io.DataOutputStream;
import java.io.IOException;

public class DiagActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_diag);
    }

    public void onClickEnableDiag(View view) throws IOException, InterruptedException {
        Process p = Runtime.getRuntime().exec("su");
        DataOutputStream dos = new DataOutputStream(p.getOutputStream());
        dos.writeBytes("setprop sys.usb.config diag,adb\n");
        dos.writeBytes("exit\n");
        dos.flush();
        p.waitFor();
        Toast toastEnable = Toast.makeText(getApplicationContext(), "DiagPort Enabled", Toast.LENGTH_SHORT);
        toastEnable.show();
        //вывод тостика :D


    }

    public void onClickDisableDiag(View view) throws IOException, InterruptedException {
        Process p = Runtime.getRuntime().exec("su");
        DataOutputStream dos = new DataOutputStream(p.getOutputStream());
        dos.writeBytes("setprop sys.usb.config mtp,adb\n");
        dos.writeBytes("exit\n");
        dos.flush();
        p.waitFor();
        Toast toastEnable = Toast.makeText(getApplicationContext(), "DiagPort Disabled", Toast.LENGTH_SHORT);
        toastEnable.show();
        //все тоже самое что и первое,только в обратном порядке
    }
}
