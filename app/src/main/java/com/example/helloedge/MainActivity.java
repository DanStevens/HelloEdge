package com.example.helloedge;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.samsung.android.sdk.SsdkUnsupportedException;
import com.samsung.android.sdk.look.Slook;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (this.InitializeEdgeSupport()) {
        } else {
            setContentView(R.layout.activity_main);
        }
    }

    public boolean InitializeEdgeSupport() {

        Slook slook = new Slook();
        try {
            slook.initialize(this);
        } catch (SsdkUnsupportedException e) {
            // Device not supported
            return false;
        }

        // COCKTAIL_PANEL specific to Edge Single Plus mode
        return slook.isFeatureEnabled(Slook.COCKTAIL_PANEL);
    }

}