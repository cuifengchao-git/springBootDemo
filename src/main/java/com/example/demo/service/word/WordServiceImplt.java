package com.example.demo.service.word;

import com.example.demo.data.word.Word;
import com.example.demo.dto.word.WordRequestDto;
import com.example.demo.repository.word.WordRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class WordServiceImplt implements WordService{

    private static Logger logger = LoggerFactory.getLogger(WordServiceImplt.class);

    @Autowired
    private WordRepository wordRepository;

    /**
     * Description: 添加单词
     * date: 2021/12/21
     * @param wordRequestDto 请求request
     * @return Word 词汇对象
     * @author cuifc
     * */
    @Override
    public Word saveWord(WordRequestDto wordRequestDto) {
        //整理数据
        Word word = arrangeDate(wordRequestDto);
        return wordRepository.save(word);
    }

    /**
     * Description: 获取全部词汇
     * date: 2021/12/21
     * @return List<Word> 词汇集合
     * @author cuifc
     * */
    @Override
    public List<Word> getAllWord() {
        List<Word> wordList= wordRepository.findAll();
        return wordList;
    }

    /**
     * Description: 更新词汇
     * date: 2021/12/23
     * @return int 更新条数
     * @author cuifc
     * */
    @Override
    public Word updateWord(WordRequestDto wordRequestDto) {
        //整理数据
        Word word = arrangeUpdatDate(wordRequestDto);
        return wordRepository.save(word);
    }

    /**
     * Description: 将wordRequestDto数据整理到word中
     * date: 2021/12/21
     * @param wordRequestDto 请求request
     * @return Word 词汇对象
     * @author cuifc
     * */
    private Word arrangeDate(WordRequestDto wordRequestDto){
        Word word = new Word();
        word.setcWord(wordRequestDto.getcWord());
        word.setjWord(wordRequestDto.getjWord());
        word.setlWord(wordRequestDto.getlWord());
        word.setnWord(wordRequestDto.getnWord());
        word.setwClass(wordRequestDto.getwClass());
        word.setIsEnabled("1");
        word.setCreateTime(new Date());
        return word;
    }

    /**
     * Description: 将wordRequestDto数据整理到word中(更新使用)
     * date: 2021/12/21
     * @param wordRequestDto 请求request
     * @return Word 词汇对象
     * @author cuifc
     * */
    private Word arrangeUpdatDate(WordRequestDto wordRequestDto){
        Word word = new Word();
        word.setId(Integer.valueOf(wordRequestDto.getId()));
        word.setcWord(wordRequestDto.getcWord());
        word.setjWord(wordRequestDto.getjWord());
        word.setlWord(wordRequestDto.getlWord());
        word.setnWord(wordRequestDto.getnWord());
        word.setwClass(wordRequestDto.getwClass());
        word.setIsEnabled("1");
        word.setCreateTime(new Date());
        return word;
    }

}
