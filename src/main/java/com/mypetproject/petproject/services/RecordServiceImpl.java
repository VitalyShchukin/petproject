package com.mypetproject.petproject.services;

import com.mypetproject.petproject.models.Record;
import com.mypetproject.petproject.repository.RecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class RecordServiceImpl implements RecordService {

    @Autowired
    private final RecordRepository recordRepository;

    public RecordServiceImpl(RecordRepository recordRepository) {
        this.recordRepository = recordRepository;
    }

    @Override
    public List<Record> findAll() {
        return recordRepository.findAll();
    }

    public String findAllTags(){
        return "";
    }
//    String body = "коля дошел в сильный мороз до магазина";
//    String regEx = "[а-я]+";
//    ArrayList founded=new ArrayList<>();
//
//    Pattern p = Pattern.compile(regEx);
//    Matcher m = p.matcher(body);
//        while (m.find()) {
//        founded.add(m.group());
//        System.out.println(founded);
//    }
//        System.out.println(founded);


}
