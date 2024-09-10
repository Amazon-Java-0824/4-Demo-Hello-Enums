package com.ironhack;

public class Tea {
    private TeaType teaType;
    private String origin;

    public Tea(TeaType teaType, String origin) {
        this.teaType = teaType;
        this.origin = origin;
    }

    public TeaType getTeaType() {
        return teaType;
    }

    public void setTeaType(TeaType teaType) {
        this.teaType = teaType;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }
}
