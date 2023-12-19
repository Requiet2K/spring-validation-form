package com.validation.form.validation;

import com.validation.form.validation.validation.PromotionCode;
import jakarta.validation.constraints.*;

public class Car {

    @NotNull(message="Required")
    @Size(min = 2, message = "At least 2 chars")
    private String brand;
    @NotNull(message="Required")
    @Size(min = 5, message = "At least 5 chars")
    private String model;
    @NotNull(message = "Required")
    @Min(value = 1975, message = "Min year is 1975")
    @Max(value = 2024, message = "Max year is 2024")
    private Integer year;
    @NotNull(message="Required")
    @Pattern(regexp = "^([_a-zA-Z0-9-]+(\\.[_a-zA-Z0-9-]+)*@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*(\\.[a-zA-Z]{1,6}))?$", message = "Invalid email")
    private String email;
    @PromotionCode
    private String promotionCode;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPromotionCode() {
        return promotionCode;
    }

    public void setPromotionCode(String promotionCode) {
        this.promotionCode = promotionCode;
    }
}
