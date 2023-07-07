package etu1847.framework;

import java.util.HashMap;

public class ModelView {
    HashMap<String,Object> data;

    public HashMap<String,Object> getData() {
        return this.data;
    }

    public void setData(HashMap<String,Object> data) {
        this.data = data;
    }

    public void addItem(String key,Object value){
        data.put(key, value);
    }


}
