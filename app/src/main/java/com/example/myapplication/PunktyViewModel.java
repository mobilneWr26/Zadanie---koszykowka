package com.example.myapplication;

import androidx.lifecycle.ViewModel;

public class PunktyViewModel extends ViewModel {
    private int punkty;

    public void setPunkty(int punkty) {
        this.punkty = punkty;
    }

    public int getPunkty() {
        return punkty;
    }
    public void addPunkty(int p){
        punkty += p;
    }
}
