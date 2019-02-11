package com.ramdolpix.qdm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.io.DataOutputStream;
import java.io.IOException;

public class RebootActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reboot);
    }


    public void onClickReboot(View view) throws IOException, InterruptedException {
        Process p = Runtime.getRuntime().exec("su");
        DataOutputStream dos = new DataOutputStream(p.getOutputStream());
        dos.writeBytes("reboot\n");
        dos.writeBytes("exit\n");
        dos.flush();
        p.waitFor();
    }

    public void onClickRebootRecovery(View view) throws IOException, InterruptedException {
        Process p = Runtime.getRuntime().exec("su");
        DataOutputStream dos = new DataOutputStream(p.getOutputStream());
        dos.writeBytes("reboot recovery\n");
        dos.writeBytes("exit\n");
        dos.flush();
        p.waitFor();
    }

    public void onClickRebootBootloader(View view) throws IOException, InterruptedException {
        Process p = Runtime.getRuntime().exec("su");
        DataOutputStream dos = new DataOutputStream(p.getOutputStream());
        dos.writeBytes("reboot bootloader\n");
        dos.writeBytes("exit\n");
        dos.flush();
        p.waitFor();
    }

    public void onClickRebootEDL(View view) throws IOException, InterruptedException {
        Process p = Runtime.getRuntime().exec("su");
        DataOutputStream dos = new DataOutputStream(p.getOutputStream());
        dos.writeBytes("reboot edl\n");
        dos.writeBytes("exit\n");
        dos.flush();
        p.waitFor();
    }
}
