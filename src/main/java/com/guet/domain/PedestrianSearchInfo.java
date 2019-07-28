package com.guet.domain;

/**
 * @author MicahYin
 * @date 2019/7/28 10:40
 * 行人检索的条件
 */
public class PedestrianSearchInfo {
    private String startTime;
    private String endTime;
    private String riderCode;
    private String genderCode;
    private String direction;
    private String speed;
    private String coatCol;

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

    public String getRiderCode() {
        return riderCode;
    }

    public void setRiderCode(String riderCode) {
        this.riderCode = riderCode;
    }

    public String getGenderCode() {
        return genderCode;
    }

    public void setGenderCode(String genderCode) {
        this.genderCode = genderCode;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getCoatCol() {
        return coatCol;
    }

    public void setCoatCol(String coatCol) {
        this.coatCol = coatCol;
    }

    @Override
    public String toString() {
        return "PedestrianSearchInfo{" +
                "startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                ", riderCode='" + riderCode + '\'' +
                ", genderCode='" + genderCode + '\'' +
                ", direction='" + direction + '\'' +
                ", speed='" + speed + '\'' +
                ", coatCol='" + coatCol + '\'' +
                '}';
    }
}
