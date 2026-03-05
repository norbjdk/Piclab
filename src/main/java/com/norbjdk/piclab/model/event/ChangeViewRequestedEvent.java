package com.norbjdk.piclab.model.event;

import com.norbjdk.piclab.model.dto.ViewRequest;

public class ChangeViewRequestedEvent {
    private final ViewRequest request;

    public ChangeViewRequestedEvent(ViewRequest request) {
        this.request = request;
    }

    public ViewRequest getRequest() {
        return request;
    }
}
