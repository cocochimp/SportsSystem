package com.yu.config;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 阿里云Oss配置文件
 */
@Configuration
public class OssConfig {

    @Bean
    public OSS ossClient(){
        String endpoint = "oss-cn-shenzhen.aliyuncs.com";
        String accessKeyId = "LTAI5t7rtwQwHL7S1SarTTma";
        String accessKeySecret = "AN3Q00XDABlCfpiU2WMovmWYDAzuUy";
        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);
        return ossClient;
    }
}
