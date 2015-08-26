package com.example.root.testprojectforgithub.Presenter;

import com.example.root.testprojectforgithub.View.IViewMain;

/**
 * Created by root on 26/08/15.
 */
public class MainPresenter {

    IViewMain mviewMain;

    public MainPresenter(IViewMain viewMain){
        this.mviewMain = viewMain;
    }

    public void showToast(){
        mviewMain.showToast();
    }

}
