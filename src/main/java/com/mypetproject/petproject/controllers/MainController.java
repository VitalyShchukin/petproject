package com.mypetproject.petproject.controllers;

import com.mypetproject.petproject.models.Record;
import com.mypetproject.petproject.models.Tag;
import com.mypetproject.petproject.repository.RecordRepository;
import com.mypetproject.petproject.repository.TagRepository;
import com.mypetproject.petproject.services.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Controller
public class MainController {

    @Autowired
    private RecordRepository recordRepository;
    @Autowired
    private TagRepository tagRepository;
    @Autowired
    private RecordService recordService;

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
    public String recordPostAdd(@RequestParam String recordTitle,
                                @RequestParam String recordBody,
                                Model model) {
        Record record = new Record(recordTitle, recordBody);
        recordRepository.save(record);

        List<Tag> tags = new ArrayList<Tag>();

        List<String> findedTags = new ArrayList<>();
        String regEx = "(?<=[{+]|[\\{-]|[{])[0-9]+(?=[}])";
        Pattern p = Pattern.compile(regEx);
        Matcher m = p.matcher(recordBody);
        while (m.find()) {
            findedTags.add(m.group());
        }

        for (int i = 0; i < findedTags.size(); i++) {
            Tag tag = new Tag(findedTags.get(i), record);
            tags.add(tag);
        }
        tagRepository.saveAll(tags);
        return "redirect:/records";
    }

    @GetMapping("/tags")
    public String tagsList(Model model) {
        List<Tag> tag = tagRepository.findAll();
        model.addAttribute("tag", tag);
        return "tags";
    }

    @PostMapping("/records/{id}/remove")
    public String recordDelete(@PathVariable(value = "id") long id, Model model) {
        Record rec = recordRepository.findById(id).orElseThrow();
        recordRepository.delete(rec);
        return "redirect:/records";
    }
}
