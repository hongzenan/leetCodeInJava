package com.zenan.practices;


import com.github.kevinsawicki.http.HttpRequest;

import java.util.HashMap;
import java.util.Map;

public class httpRrequest {
    public static void main(String[] args) {
        String request = HttpRequest.get("http://www.baidu.com", true, 'q', "baseball gloves", "size", 100).body();

        System.out.println("response was: " + request);

        Map data = new HashMap();
        data.put("q", "baseball gloves");
        data.put("size", 100);
        String resp = HttpRequest.get("http://www.baidu.com").form(data).body();
        System.out.println("----------------------------------------------------");
        System.out.println("response parameter: " + resp);

        String str = null;
        System.out.println(str != null && str.length() > 0 ? str : "UTF-8");
        if (str != null && str.length() > 0) {
            System.out.println("a");
        } else {
            System.out.println("b");
        }
    }
}
