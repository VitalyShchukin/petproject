package com.mypetproject.petproject.services;

import com.mypetproject.petproject.repository.RecordRepository;
import com.mypetproject.petproject.repository.TagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class RecordServiceImpl implements RecordService {

    public List<String> findTag(String recordBody) {

            List<String> findedTags = new ArrayList<>();
            String regEx = "(?<=[{+]|[\\{-]|[{])[0-9]+(?=[}])";
            Pattern p = Pattern.compile(regEx);
            Matcher m = p.matcher(recordBody);
            while (m.find()) {
                findedTags.add(m.group());
            }
        return findedTags;
    }
}
