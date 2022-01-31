package com.mypetproject.petproject.services;

import com.mypetproject.petproject.models.Record;
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

    @Autowired
    private final RecordRepository recordRepository;
    @Autowired
    private final TagRepository tagRepository;

    public RecordServiceImpl(RecordRepository recordRepository, TagRepository tagRepository) {
        this.recordRepository = recordRepository;
        this.tagRepository = tagRepository;
    }

    @Override
    public List<Record> findTagAndSave() {
        tagRepository.findAll();
//        String record = "Россия и Соединенные {123}  Штаты должны найти необходимые {+5.17} сферы сотрудничества," +
//                " {789 } заявила на брифинге {7-} официальный {56749} представитель госдепа Хизер {+55844} Науэрт, " +
//                "комментируя слова {-78914} российского премьер-министра {0.22356} Дмитрия Медведева об отношениях {ok} " +
//                "между Москвой и Вашингтоном. {4}";
//        String regEx = "(?<=[{+]|[\\{-]|[{])[0-9]+(?=[}])";
//        ArrayList result = new ArrayList<>();
//
//        Pattern p = Pattern.compile(regEx);
//        Matcher m = p.matcher(record);
//        while (m.find()) {
//            result.add(m.group());
//            System.out.println(result);
//        }
//        System.out.println("первый лист"+result);
//
//        ArrayList reRec = new ArrayList<>();
//        for (int i = 0; i <result.size(); i++) {
//            reRec.add(result.get(i));
//        }
//        System.out.println(record);
//        System.out.println("количество найденных тэгов: "+reRec.size());
//        System.out.println("результат для записи"+reRec);
        return null;
    }
}
