package ru.savimar.notification.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import ru.savimar.notification.entity.Letter;
import ru.savimar.notification.repository.LetterRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class LetterService {
    @Autowired
    private LetterRepository repository;

    public List<Letter> findAll(){
        List<Letter> result = repository.findAll();
        if(result.size() > 0) {
            return result;
        } else {
            return new ArrayList<Letter>();
        }
    }


    public void delete(Integer id){
        repository.deleteById(id);
    }

    public Letter save(Letter letter){
        return repository.save(letter);
    }


    public Letter getBillById(Integer id) {
        return repository.findById(id).orElseThrow();
    }

    @KafkaListener(topics = "messages", groupId = "message_group_id")
    public void consume(Letter letter){
       repository.save(letter);
    }
}
