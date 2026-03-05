package com.norbjdk.piclab.model.dto;

import com.norbjdk.piclab.model.ui.ViewContainer;

public class ViewResponse <V extends ViewContainer> {
    private final V view;

    public ViewResponse(V view) {
        this.view = view;
    }

    public V getView() {
        return view;
    }
}
