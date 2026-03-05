package com.norbjdk.piclab.model.ui;

public abstract class Presentable {
    protected abstract void initComponents();
    protected abstract void setupComponents();
    protected abstract void setupStyle();
    protected abstract void setupLayout();
    protected abstract void setupEventListeners();
    protected abstract void setupEventHandlers();

    public final void present() {
        initComponents();
        setupComponents();
        setupStyle();
        setupLayout();
        setupEventListeners();
        setupEventHandlers();
    }
}
