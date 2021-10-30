package cn.keking.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.Date;

public class FileInfo implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 主键
     */
    private String uuid;

    /**
     * 文件名
     */
    @JsonIgnore
    private String fileName;

    /**
     * 上传者
     */
    private String userId;

    /**
     * 上传人姓名
     */
    private String userName;

    /**
     * 上传时间
     */
    private Date uploadTime;

    /**
     * 所属系统
     */
    private String nodeName;

    /**
     * 磁盘路径
     */
    private String diskPath;

    /**
     * 下载码
     */
    private String downloadCode;

    /**
     * 别名
     */
    private String alias;


    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public String getDiskPath() {
        return diskPath;
    }

    public void setDiskPath(String diskPath) {
        this.diskPath = diskPath;
    }

    public String getDownloadCode() {
        return downloadCode;
    }

    public void setDownloadCode(String downloadCode) {
        this.downloadCode = downloadCode;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }
}
