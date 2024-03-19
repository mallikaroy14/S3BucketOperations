package com.bajaj.validator;

public class NameValidator implements TextValidator {

    @Override
    public boolean validate(String name) {
       if(name!= null){
          return true;
       } return false;
    }
}
