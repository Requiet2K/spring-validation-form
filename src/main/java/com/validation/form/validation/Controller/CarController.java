package com.validation.form.validation.Controller;

import com.validation.form.validation.Car;
import jakarta.validation.Valid;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CarController {
    @InitBinder
    public void initBindir(WebDataBinder dataBinder){
        StringTrimmerEditor trimmer = new StringTrimmerEditor(true);
        dataBinder.registerCustomEditor(String.class, trimmer);
    }

    @GetMapping("/")
    public String showForm(Model theModel){
        theModel.addAttribute("car", new Car());
        return "car-form";
    }

    @PostMapping("/processForm")
    public String processForm(@Valid @ModelAttribute("car") Car theCar, BindingResult theBindingResult){
        if(theBindingResult.hasErrors()){
            return "car-form";
        }else{
            return "confirmation-page";
        }
    }
}
