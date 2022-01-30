package com.example.demo.data.word;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.hibernate.annotations.Proxy;
import org.springframework.data.util.Lazy;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Proxy(lazy=false)
public class Word {

    /**
     * Description: @GeneratedValue: 为实体类生成一个唯一的主键
     *              1.生成策略的分类
     *                1.1.strategy：
     *                  1.1.1：TABLE：使用一个特定的数据库表格来保存主键
     *                         SEQUENCE：根据底层数据库的序列来生成主键，条件是数据库支持序列
     *                         IDENTITY：主键由数据库自动生成（主要是自动增长型）
     *                         AUTO：主键由程序控制
     *                  1.1.2：例子：@GeneratedValue(strategy = GenerationType.TABLE, generator="payablemoney_gen")
     *                1.2.generator：
     * */
    @Id
    @GeneratedValue
    private Integer id;
    //汉字
    private String cWord;
    //日文
    private String jWord;
    //罗马音
    private String lWord;
    //注译
    private String nWord;
    //创建时间
    @JsonFormat(pattern = "YYYY-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;
    //答对次数
    private Integer rightCount;
    //答错次数
    private Integer wrongCount;
    //是否有效
    private String isEnabled;
    //词汇类型
    private String wClass;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getRightCount() {
        return rightCount;
    }

    public void setRightCount(Integer rightCount) {
        this.rightCount = rightCount;
    }

    public Integer getWrongCount() {
        return wrongCount;
    }

    public void setWrongCount(Integer wrongCount) {
        this.wrongCount = wrongCount;
    }

    public String getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(String isEnabled) {
        this.isEnabled = isEnabled;
    }

    public String getwClass() {
        return wClass;
    }

    public void setwClass(String wClass) {
        this.wClass = wClass;
    }

    @Override
    public String toString(){
        return ReflectionToStringBuilder.toString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

}
