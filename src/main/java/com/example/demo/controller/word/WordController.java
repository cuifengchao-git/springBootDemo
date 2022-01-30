package com.example.demo.controller.word;

import com.example.demo.data.word.Word;
import com.example.demo.dto.ResponseDto;
import com.example.demo.dto.word.WordRequestDto;
import com.example.demo.service.word.WordService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class WordController {

    private final static Logger logger = LoggerFactory.getLogger(WordController.class);

    @Autowired
    WordService wordService;

    /**
     * Description: 添加单词
     * date: 2021/12/21
     * @param wordRequestDto 请求request
     * @return ResponseDto
     * @author cuifc
     * */
//    @RequestMapping(value = "/word/addWord", method = RequestMethod.POST)
    @PostMapping("/word/addword")
    @ResponseBody
    public ResponseDto addWord(@RequestBody WordRequestDto wordRequestDto){
        logger.debug("addWord-Param:{}", wordRequestDto.toString());

        Word word = wordService.saveWord(wordRequestDto);
        logger.debug("addWord-save:{}", word.toString());

        ResponseDto responseDto = new ResponseDto();
        if(word.getId() != null){
            responseDto.setSuccess(true);
            responseDto.setCode(1002);
            responseDto.setMessage("词汇保存成功");
        }else{
            responseDto.setSuccess(false);
            responseDto.setCode(1003);
            responseDto.setMessage("词汇保存失败");
        }
        return responseDto;
    }

    /**
     * Description: 获取全部单词
     * date: 2021/12/21
     * @return ResponseDto
     * @author cuifc
     * */
    @GetMapping("word/getallword")
    @ResponseBody
    public ResponseDto getAllWord(){
        ResponseDto responseDto = new ResponseDto();

        List<Word> wordList = wordService.getAllWord();

        if(wordList.size() != 0){
            responseDto.setSuccess(true);
            responseDto.setCode(1004);
            responseDto.setMessage("词汇获取成功");
            responseDto.setData(wordList);
        }else{
            responseDto.setSuccess(false);
            responseDto.setCode(1005);
            responseDto.setMessage("词汇获取失败");
        }

        return responseDto;
    }

    @PutMapping("/word/updateword")
    @ResponseBody
    public ResponseDto updateWord(@RequestBody WordRequestDto wordRequestDto){
        logger.debug("updateWord-Param:{}", wordRequestDto.toString());
        ResponseDto responseDto = new ResponseDto();

        Word word = wordService.updateWord(wordRequestDto);
        logger.debug("updateWord-update:{}", word.toString());

        responseDto.setSuccess(true);
        responseDto.setCode(1006);
        responseDto.setMessage("词汇更新成功");
        return responseDto;
    }

}
