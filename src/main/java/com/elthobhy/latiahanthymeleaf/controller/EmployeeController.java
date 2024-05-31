package com.elthobhy.latiahanthymeleaf.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.elthobhy.latiahanthymeleaf.viewmodel.EmployeeViewModel;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
    private final String apiUrl = "http://localhost:7000/api/employee";
    private RestTemplate restTemp = new RestTemplate();

    @GetMapping("")
    public ModelAndView index() {
        ModelAndView view = new ModelAndView("/employee/index");
        try {
            ResponseEntity<EmployeeViewModel[]> apiResponse = restTemp.getForEntity(apiUrl, EmployeeViewModel[].class);
            if (apiResponse.getStatusCode() == HttpStatus.OK) {
                EmployeeViewModel[] data = apiResponse.getBody();
                view.addObject("data", data);
            } else {
                throw new Exception(apiResponse.getStatusCode().toString() + ":" + apiResponse.getBody());
            }
        } catch (Exception e) {
            view.addObject("errorMessage", e.getMessage());
        }
        return view;
    }

}
