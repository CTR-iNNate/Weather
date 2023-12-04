package com.example.weather.Error;

public class InvalidDate extends RuntimeException {
    private static final String MESSAGE = "너무 과거 혹은 미래의 날짜입니다.";
    public InvalidDate() {
        super(MESSAGE); // 예외가 발생할때 해당 메세지와 같이 반환이 된다.
    }
}
