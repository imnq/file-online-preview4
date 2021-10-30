package cn.keking.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
public class FilePathConfig {

    @Value("${file.ip}")
    private String fileIP;

    @Value("${file.port}")
    private String filePort;

    @Value("${file.url}")
    private String fileURL;

    @Value("${file.gofastdfsport}")
    private String goFastDFSPort;

}
