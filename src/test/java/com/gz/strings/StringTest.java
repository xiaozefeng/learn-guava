package com.gz.strings;

import com.google.common.base.*;
import org.junit.Test;

/**
 * @author xiaozefeng
 */
public class StringTest {
    /**
     * 连接器
     */
    @Test
    public void testJoin() {
        Joiner joiner = Joiner.on(",").skipNulls();
        String result = joiner.join("Jack", null, "Rose", "Lucy", "");
        System.out.println(result);
    }


    /**
     * 拆分器
     */
    @Test
    public void testSplit(){
        Iterable<String> split = Splitter.on(',')
                // trim
                .trimResults()
                // 忽略空字符串
                .omitEmptyStrings()
                .split("foo,bar,,   jack");
        split.forEach(System.out::println);
    }


    @Test
    public void testCharMatch(){

    }

    /**
     * 字符集
     */
    @Test
    public void testCharsets(){
        String data = "jack,rose,lucy";
        byte[] bytes = data.getBytes(Charsets.UTF_8);
        String s = new String(bytes, Charsets.UTF_8);
        System.out.println(s);
    }

    @Test
    public void testCaseFormat(){
        String constantName = CaseFormat.UPPER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "CONSTANT_NAME");
        System.out.println(constantName);
    }


}
