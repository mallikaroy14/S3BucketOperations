package com.bajaj.validator;

public class AgeValidator implements NumberValidator {
    @Override
    public boolean validate(int age) {
        if( age > 0 ){ return true;
        }else return false;

    }
}
