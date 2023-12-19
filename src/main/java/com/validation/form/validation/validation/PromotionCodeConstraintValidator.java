package com.validation.form.validation.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class PromotionCodeConstraintValidator implements ConstraintValidator<PromotionCode, String> {
    private String promotionCodePrefix;

    @Override
    public void initialize(PromotionCode thePromotionCode) {
        promotionCodePrefix = thePromotionCode.value();
    }

    @Override
    public boolean isValid(String theCode, ConstraintValidatorContext theConstraintValidatorContext) {
        boolean result;
        if(theCode != null){
            result = theCode.startsWith(promotionCodePrefix);
        }
        else{  // optional it can be empty
            result = true;
        }
        return result;
    }
}
