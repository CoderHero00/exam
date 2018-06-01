package com.example.exam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@org.springframework.stereotype.Controller
public class Controller {
    @Autowired
    MyModel proMyModel;
    @RequestMapping(path = "/list/candi", method = RequestMethod.GET)
    public String ShowStudent(Model model) {
        model.addAttribute("candidate", proMyModel.findAll());
        return "CandidateList";
    }
}
