package com.norbjdk.piclab.manager;

import com.norbjdk.piclab.model.dto.ViewRequest;

public class AppManager {
    private static AppManager instance;
    private final ViewManager viewManager;

    private AppManager() {
        viewManager = ViewManager.getInstance();
    }

    public AppManager getInstance() {
        if (instance == null) {
            instance = new AppManager();
        }

        return instance;
    }

    public void changeView(ViewRequest request) {
        viewManager.changeView(request);
    }
}
