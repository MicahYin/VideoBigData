package com.guet.domain;

/**
 * @author MicahYin
 * @date 2019/7/28 10:33
 * 人脸检索的条件
 */
public class FaceSearchInfo {
    private String startTime;
    private String endTime;
    private String ageRange;
    private String genderCode;
    private String glassCode;

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getAgeRange() {
        return ageRange;
    }

    public void setAgeRange(String ageRange) {
        this.ageRange = ageRange;
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

    @Override
    public String toString() {
        return "FaceSearchInfo{" +
                "startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                ", ageRange='" + ageRange + '\'' +
                ", genderCode='" + genderCode + '\'' +
                ", glassCode='" + glassCode + '\'' +
                '}';
    }
}
