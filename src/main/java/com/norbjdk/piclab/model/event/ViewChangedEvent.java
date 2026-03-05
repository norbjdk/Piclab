package com.norbjdk.piclab.model.event;

import com.norbjdk.piclab.model.dto.ViewResponse;
import com.norbjdk.piclab.model.ui.ViewContainer;

public class ViewChangedEvent <V extends ViewContainer> {
    private final ViewResponse<V> response;

    public ViewChangedEvent(ViewResponse<V> response) {
        this.response = response;
    }

    public ViewResponse<V> getResponse() {
        return response;
    }
}
