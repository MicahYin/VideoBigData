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
        if (this.ageRange!=null){
            switch (ageRange){
                case "不限":
                    this.ageRange=null;break;
                case "儿童":
                    this.ageRange="0";break;
                case "少年":
                    this.ageRange="1";break;
                case "青年":
                    this.ageRange="2";break;
                case "中年":
                    this.ageRange="3";break;
                case "老年":
                    this.ageRange="4";break;
                default:
                    this.ageRange=null;break;
            }
        }
    }

    public String getGenderCode() {
        return genderCode;
    }

    public void setGenderCode(String genderCode) {
        this.genderCode = genderCode;
        if (genderCode!=null){
            switch (genderCode){
                case "不限":
                    this.genderCode=null;break;
                case "男":
                    this.genderCode="1";break;
                case "女":
                    this.genderCode="0";break;
                default:
                    this.genderCode=null;break;
            }
        }
    }

    public String getGlassCode() {
        return glassCode;
    }

    public void setGlassCode(String glassCode) {
        this.glassCode = glassCode;
        if (glassCode!=null){
            switch (glassCode){
                case "不限":
                    this.glassCode=null;break;
                case "是":
                    this.glassCode="1";break;
                case "否":
                    this.glassCode="0";break;
                default:
                    this.glassCode=null;break;
            }
        }
    }

    @Override
    public String toString() {
        return "CarSearchInfo{" +
                "startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                ", ageRange='" + ageRange + '\'' +
                ", genderCode='" + genderCode + '\'' +
                ", glassCode='" + glassCode + '\'' +
                '}';
    }
}
