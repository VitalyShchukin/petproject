package com.mypetproject.petproject.controllers;

import com.mypetproject.petproject.models.Record;
import com.mypetproject.petproject.repository.RecordRepository;
import com.mypetproject.petproject.services.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class RecordController {

    @Autowired
    private RecordRepository recordRepository;


    @GetMapping("/records")
    public String recordsList(Model model) {
        List<Record> record = recordRepository.findAll();
        model.addAttribute("rec", record);
        return "records";
    }

    @GetMapping("/record/add")
    public String recordAdd(Model model) {
        return "record-add";
    }

    @PostMapping("/record/add")
    public String recordPostAdd(@RequestParam String title,
                                @RequestParam String record,
                                Model model) {
        Record rec = new Record(title, record);
        recordRepository.save(rec);
        return "redirect:/records";
    }

    @PostMapping("/records/{id}/remove")
    public String recordDelete(@PathVariable(value = "id") long id, Model model) {
        Record rec = recordRepository.findById(id).orElseThrow();
        recordRepository.delete(rec);
        return "redirect:/records";
    }
}
