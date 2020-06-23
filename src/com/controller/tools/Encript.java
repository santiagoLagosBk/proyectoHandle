package com.controller.tools;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

public class Encript {


    public String encode(String value) throws UnsupportedEncodingException {

        Base64.Encoder encoder=Base64.getEncoder();

        return encoder.encodeToString(value.getBytes("utf-8"));
    }

    public  String decode(String encrypted) throws UnsupportedEncodingException {

        byte[] array=Base64.getDecoder().decode(encrypted);
        return new String(array,"utf-8");

    }
}
