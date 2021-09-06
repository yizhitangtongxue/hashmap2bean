package com.example.modules.common.dto;

import java.util.Map;

public class Source {
    private Map<String, Object> map;

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public Source(Map<String, Object> map) {
        this.map = map;
    }
}
