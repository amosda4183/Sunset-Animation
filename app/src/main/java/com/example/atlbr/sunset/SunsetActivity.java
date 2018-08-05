package com.example.atlbr.sunset;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class SunsetActivity extends SingleFragmentActivity {

    @Override
    public SunsetFragment createFragment() {
        return SunsetFragment.newInstance();
    }
}

