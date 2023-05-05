package com.ui_katalogkit.common.PageControlPagesBase.enums;

public enum NumberClicks {
    ONE(1), TWO(2), THREE(3),
    FOUR(4), FIVE(5), SIX(6),
    SEVEN(7), EIGHT(8), NINE(9);

    private int number;

    NumberClicks(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}