package ru.savimar.notification.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.savimar.notification.entity.Letter;

@Repository
public interface LetterRepository  extends JpaRepository<Letter, Integer> {
}
