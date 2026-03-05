package com.norbjdk.piclab.model.dto;

import com.norbjdk.piclab.model.ui.ViewName;

public class ViewRequest {
    private final ViewName viewName;

    public ViewRequest(ViewName viewName) {
        this.viewName = viewName;
    }

    public ViewName getViewName() {
        return viewName;
    }
}
