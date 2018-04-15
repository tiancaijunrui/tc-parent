package com.zcj.tc.model.uc;

public enum BindTypeEnum {
    ALI("阿里巴巴、支付宝"), TENCENT("qq、微信");

    private String text;

    private BindTypeEnum(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
