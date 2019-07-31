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
        if (ageRange!=null){
            switch (ageRange){
                case "不限":
                    ageRange=null;break;
                case"儿童":
                    ageRange="0";break;
                case"少年":
                    ageRange="1";break;
                case"青年":
                    ageRange="2";break;
                case"中年":
                    ageRange="3";break;
                case"老年":
                    ageRange="4";break;
                default:
                    ageRange=null;break;
            }
        }
        return ageRange;
    }

    public void setAgeRange(String ageRange) {
        this.ageRange = ageRange;
    }

    public String getGenderCode() {
        if (genderCode!=null){
            switch (genderCode){
                case "不限":
                    genderCode=null;break;
                case "男":
                    genderCode="1";break;
                case "女":
                    genderCode="0";break;
                default:
                    genderCode=null;break;
            }
        }
        return genderCode;
    }

    public void setGenderCode(String genderCode) {
        this.genderCode = genderCode;
    }

    public String getGlassCode() {
        if (glassCode!=null){
            switch (glassCode){
                case "不限":
                    glassCode=null;break;
                case "是":
                    glassCode="1";break;
                case "否":
                    glassCode="0";break;
                default:
                    glassCode=null;break;
            }
        }
        return glassCode;
    }

    public void setGlassCode(String glassCode) {
        this.glassCode = glassCode;
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
