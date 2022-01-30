package com.example.demo.dto.word;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class WordRequestDto {

    private String id;
    //汉字
    private String cWord;
    //汉字
    private String jWord;
    //罗马音
    private String lWord;
    //注译
    private String nWord;
    //词汇类型
    private String wClass;

    public String getcWord() {
        return cWord;
    }

    public void setcWord(String cWord) {
        this.cWord = cWord;
    }

    public String getjWord() {
        return jWord;
    }

    public void setjWord(String jWord) {
        this.jWord = jWord;
    }

    public String getlWord() {
        return lWord;
    }

    public void setlWord(String lWord) {
        this.lWord = lWord;
    }

    public String getnWord() {
        return nWord;
    }

    public void setnWord(String nWord) {
        this.nWord = nWord;
    }

    public String getwClass() {
        return wClass;
    }

    public void setwClass(String wClass) {
        this.wClass = wClass;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * Description: 1.利用ReflectionToStringBuilder 编写toString
     *
     *              2.ToStringStyle
     *               2.1.字符串格式控制类
     *               2.2.具体取值：
     *                 2.2.1.ToStringStyle DEFAULT_STYLE
     *                       common.lang.User@7a5d5033[age=12,username=yaomy]
     *                 2.2.2.ToStringStyle MULTI_LINE_STYLE
     *                       common.lang.User@7a5d5033[
     *                         age=12
     *                         username=yaomy
     *                       ]
     *                 2.2.3.ToStringStyle SHORT_PREFIX_STYLE
     *                       User[age=12,username=yaomy]
     *                 2.2.4.ToStringStyle SIMPLE_STYLE
     *                       12,yaomy
     *                 2.2.5.ToStringStyle NO_CLASS_NAME_STYLE
     *                       [age=12,username=yaomy]
     *                 2.2.6.ToStringStyle JSON_STYLE
     *                       {"age":12,"username":"yaomy"}
     *
     *              3.如果想要排除某些字段
     *               3.1.ReflectionToStringBuilder.toStringExclude(this, "salt", "password");
     * */
    @Override
    public String toString(){
        return ReflectionToStringBuilder.toString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

}
