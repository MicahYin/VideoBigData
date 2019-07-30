package com.guet.domain;

/**
 * @author MicahYin
 * @date 2019/7/28 16:19
 */
public class FaceSearchResult {
    private String personAppearTime;
    private String taskIp;
    private String taskName;
    private String dataType;
    private String genderCode;
    private String glassCode;
    private String ageGroups;
    private String bigPicUrl;
    private String picUrl;

    public String getPersonAppearTime() {
        return personAppearTime;
    }

    public void setPersonAppearTime(String personAppearTime) {
        this.personAppearTime = personAppearTime;
    }

    public String getTaskIp() {
        return taskIp;
    }

    public void setTaskIp(String taskIp) {
        this.taskIp = taskIp;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public String getGenderCode() {
        return genderCode;
    }

    public void setGenderCode(String genderCode) {
        this.genderCode = genderCode;
    }

    public String getGlassCode() {
        return glassCode;
    }

    public void setGlassCode(String glassCode) {
        this.glassCode = glassCode;
    }

    public String getAgeGroups() {
        return ageGroups;
    }

    public void setAgeGroups(String ageGroups) {
        this.ageGroups = ageGroups;
    }

    public String getBigPicUrl() {
        return bigPicUrl;
    }

    public void setBigPicUrl(String bigPicUrl) {
        this.bigPicUrl = bigPicUrl;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    @Override
    public String toString() {
        return "FaceSearchResult{" +
                "personAppearTime='" + personAppearTime + '\'' +
                ", taskIp='" + taskIp + '\'' +
                ", taskName='" + taskName + '\'' +
                ", dataType='" + dataType + '\'' +
                ", genderCode='" + genderCode + '\'' +
                ", glassCode='" + glassCode + '\'' +
                ", ageGroups='" + ageGroups + '\'' +
                ", bigPicUrl='" + bigPicUrl + '\'' +
                ", picUrl='" + picUrl + '\'' +
                '}';
    }
}
