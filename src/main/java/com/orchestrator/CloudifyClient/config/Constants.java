package com.orchestrator.CloudifyClient.config;

import java.nio.charset.Charset;

public interface Constants {

    int SOCKET_TIME_OUT = 30000; // 30s

    int SOCKET_TIME_OUT_CODE = -1;
    
    String MANAGER_IP = "127.0.0.1";

    String CHAR_ENCODING = "UTF-8";
    Charset DEFAULT_CHAR_SET = Charset.forName(CHAR_ENCODING);

}
