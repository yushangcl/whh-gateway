package cn.itbat.whh.gateway.config;

import com.baidu.disconf.client.common.annotations.DisconfFile;
import com.baidu.disconf.client.common.annotations.DisconfFileItem;
import org.springframework.context.annotation.Scope;

/**
 * @author huahui.wu.
 * Created on 2018/3/27.
 */
@Scope("singleton")
@DisconfFile(filename = "web-config.properties")
public class WebConfig {
    private String fileWebPath;
    private String fileHttpsPath;
    private String imageTypes;
    private String imageExts;
    private String fileTypes;
    private String fileExts;
    private String videoTypes;
    private String videoExts;


    private String dubboVersion;
    private String dubboApplicationName;
    private String dubboApplicationOwner;
    private String dubboApplicationOrganization;
    private String dubboRegistryAddress;
    private String dubboApplicationProtocol;
    private String dubboApplicationTimeout;

    @DisconfFileItem(name = "file_web_path", associateField = "fileWebPath")
    public String getFileWebPath() {
        return fileWebPath;
    }

    public void setFileWebPath(String fileWebPath) {
        this.fileWebPath = fileWebPath;
    }

    @DisconfFileItem(name = "file_https_path", associateField = "fileHttpsPath")
    public String getFileHttpsPath() {
        return fileHttpsPath;
    }

    public void setFileHttpsPath(String fileHttpsPath) {
        this.fileHttpsPath = fileHttpsPath;
    }

    @DisconfFileItem(name = "upload.type.image", associateField = "imageTypes")
    public String getImageTypes() {
        return imageTypes;
    }

    public void setImageTypes(String imageTypes) {
        this.imageTypes = imageTypes;
    }

    @DisconfFileItem(name = "upload.type.image.ext", associateField = "imageExts")
    public String getImageExts() {
        return imageExts;
    }

    public void setImageExts(String imageExts) {
        this.imageExts = imageExts;
    }

    @DisconfFileItem(name = "upload.type.file", associateField = "fileTypes")
    public String getFileTypes() {
        return fileTypes;
    }

    public void setFileTypes(String fileTypes) {
        this.fileTypes = fileTypes;
    }

    @DisconfFileItem(name = "upload.type.file.ext", associateField = "fileExts")
    public String getFileExts() {
        return fileExts;
    }

    public void setFileExts(String fileExts) {
        this.fileExts = fileExts;
    }

    @DisconfFileItem(name = "upload.type.video", associateField = "fileHttpsPath")
    public String getVideoTypes() {
        return videoTypes;
    }

    public void setVideoTypes(String videoTypes) {
        this.videoTypes = videoTypes;
    }

    @DisconfFileItem(name = "upload.type.video.ext", associateField = "videoExts")
    public String getVideoExts() {
        return videoExts;
    }

    public void setVideoExts(String videoExts) {
        this.videoExts = videoExts;
    }

    @DisconfFileItem(name = "dubbo.version.surfix", associateField = "dubboVersion")
    public String getDubboVersion() {
        return dubboVersion;
    }

    public void setDubboVersion(String dubboVersion) {
        this.dubboVersion = dubboVersion;
    }

    @DisconfFileItem(name = "dubbo.application.name", associateField = "dubboApplicationName")
    public String getDubboApplicationName() {
        return dubboApplicationName;
    }

    public void setDubboApplicationName(String dubboApplicationName) {
        this.dubboApplicationName = dubboApplicationName;
    }

    @DisconfFileItem(name = "dubbo.application.owner", associateField = "dubboApplicationOwner")
    public String getDubboApplicationOwner() {
        return dubboApplicationOwner;
    }

    public void setDubboApplicationOwner(String dubboApplicationOwner) {
        this.dubboApplicationOwner = dubboApplicationOwner;
    }

    @DisconfFileItem(name = "dubbo.application.organization", associateField = "dubboApplicationOrganization")
    public String getDubboApplicationOrganization() {
        return dubboApplicationOrganization;
    }

    public void setDubboApplicationOrganization(String dubboApplicationOrganization) {
        this.dubboApplicationOrganization = dubboApplicationOrganization;
    }

    @DisconfFileItem(name = "dubbo.registry.address", associateField = "dubboRegistryAddress")
    public String getDubboRegistryAddress() {
        return dubboRegistryAddress;
    }

    public void setDubboRegistryAddress(String dubboRegistryAddress) {
        this.dubboRegistryAddress = dubboRegistryAddress;
    }

    @DisconfFileItem(name = "dubbo.application.protocol", associateField = "dubboApplicationProtocol")
    public String getDubboApplicationProtocol() {
        return dubboApplicationProtocol;
    }

    public void setDubboApplicationProtocol(String dubboApplicationProtocol) {
        this.dubboApplicationProtocol = dubboApplicationProtocol;
    }
    @DisconfFileItem(name = "dubbo.application.timeout", associateField = "dubboApplicationTimeout")
    public String getDubboApplicationTimeout() {
        return dubboApplicationTimeout;
    }

    public void setDubboApplicationTimeout(String dubboApplicationTimeout) {
        this.dubboApplicationTimeout = dubboApplicationTimeout;
    }
}
