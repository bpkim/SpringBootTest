package com.springboot.test.coltroller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JsonController {
    String [] names = {"kim", "lee", "park", "choi", "jo"};
    String [] mails = {"kim@tuuyano.com", "lee@flower", "park@yamda", "choi@happy", "jo@baseball"};

    @RequestMapping("/id/{id}")
    public DataObject in(@PathVariable int id){

        if(names.length <= id){
            return null;
        }
        return new DataObject(id, names[id], mails[id]);
    }

    class DataObject{
        private int id;
        private String name;
        private String value;

        public DataObject(int id, String name, String value) {
            this.id = id;
            this.name = name;
            this.value = value;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getValue() {
            return value;
        }

        public void setId(int id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }
}
