package com.norbjdk.piclab.manager;

import com.norbjdk.piclab.model.dto.ViewRequest;
import com.norbjdk.piclab.model.dto.ViewResponse;
import com.norbjdk.piclab.model.event.ViewChangedEvent;
import com.norbjdk.piclab.model.ui.ViewContainer;
import com.norbjdk.piclab.model.ui.ViewName;
import com.norbjdk.piclab.view.EditorView;
import com.norbjdk.piclab.view.HomeView;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ViewManager {
    private static ViewManager instance;
    private final Map<ViewName, ViewContainer> views;
    private ViewContainer currentView;

    private ViewManager() {
        views = new ConcurrentHashMap<>();

        initViews();
    }

    protected static ViewManager getInstance() {
        if (instance == null) {
            instance = new ViewManager();
        }

        return instance;
    }

    protected <V extends ViewContainer> void changeView(ViewRequest request){
        @SuppressWarnings("unckecked")
        final V newView = (V) views.get(request.getViewName());

        if (newView != null) {
            currentView = newView;

            final ViewResponse<V> response = new ViewResponse<>(newView);

            EventBus.getInstance().publish(new ViewChangedEvent<>(response));
        }
    }

    private void initViews() {
        addView(ViewName.HOME, new HomeView());
        addView(ViewName.EDITOR, new EditorView());
    }

    private <V extends ViewContainer> void addView(ViewName name, V view) {
        if (view != null && !views.containsKey(name)) {
            views.put(name, view);
        }
    }
}
