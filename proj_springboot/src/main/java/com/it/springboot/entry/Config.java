package com.it.springboot.entry;

import groovy.transform.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author     ：zyx
 * @date       ：Created in 2020/11/5 16:46
 * @description：配置文件
 * @modified By：
 * @version:     $
 */
@Component
@ConfigurationProperties(prefix = "config-attributes")
@ToString
public class Config {
    private String value;
    private String[] valueArray;
    private List<String> valueList;
    private HashMap<String, String> valueMap;
    private List<Map<String, String>> valueMapList;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String[] getValueArray() {
        return valueArray;
    }

    public void setValueArray(String[] valueArray) {
        this.valueArray = valueArray;
    }

    public List<String> getValueList() {
        return valueList;
    }

    public void setValueList(List<String> valueList) {
        this.valueList = valueList;
    }

    public HashMap<String, String> getValueMap() {
        return valueMap;
    }

    public void setValueMap(HashMap<String, String> valueMap) {
        this.valueMap = valueMap;
    }

    public List<Map<String, String>> getValueMapList() {
        return valueMapList;
    }

    public void setValueMapList(List<Map<String, String>> valueMapList) {
        this.valueMapList = valueMapList;
    }
}
