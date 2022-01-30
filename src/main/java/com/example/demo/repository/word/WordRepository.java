package com.example.demo.repository.word;

import com.example.demo.data.word.Word;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WordRepository extends JpaRepository<Word, Integer> {

}
