package com.zcj.tc.model.uc;

public enum GenderEnum {
    MAN("男"), FEMININE("女");
    private String text;

    private GenderEnum(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
