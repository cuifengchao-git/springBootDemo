package com.example.demo.service.word;

import com.example.demo.data.word.Word;
import com.example.demo.dto.word.WordRequestDto;

import java.util.List;

public interface WordService {

    /**
     * Description: 添加单词
     * date: 2021/12/21
     * @param wordRequestDto 请求request
     * @return Word 词汇对象
     * @author cuifc
     * */
    public Word saveWord(WordRequestDto wordRequestDto);

    /**
     * Description: 获取全部词汇
     * date: 2021/12/21
     * @return List<Word> 词汇集合
     * @author cuifc
     * */
    public List<Word> getAllWord();

    /**
     * Description: 更新词汇
     * date: 2021/12/23
     * @return int 更新条数
     * @author cuifc
     * */
    public Word updateWord(WordRequestDto wordRequestDto);

}
