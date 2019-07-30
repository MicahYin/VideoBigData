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
        switch (riderCode) {
            case "不限":
                riderCode = null;
                break;
            case "是":
                riderCode = "1";
                break;
            case "否":
                riderCode = "2";
                break;
            default:
                riderCode = null;
                break;
        }
        return riderCode;
    }

    public void setRiderCode(String riderCode) {
        this.riderCode = riderCode;
    }

    public String getGenderCode() {
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
        return genderCode;
    }

    public void setGenderCode(String genderCode) {
        this.genderCode = genderCode;
    }

    public String getDirection() {
        switch (direction){
            case "不限":
                direction=null;break;
            case "上":
                direction="1";break;
            case "下":
                direction="2";break;
            case "左":
                direction="3";break;
            case "右":
                direction="4";break;
            default:
                direction=null;break;
        }
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getSpeed() {
        switch (speed){
            case "不限":
                speed=null;break;
            case "慢":
                speed="1";break;
            case "中":
                speed="2";break;
            case "快":
                speed="3";break;
            default:
                speed=null;break;
        }
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getCoatCol() {
        switch (coatCol){
            case "不限":
                coatCol=null;break;
            case "红色":
                coatCol="E";break;
            case "棕色":
                coatCol="I";break;
            case "黄色":
                coatCol="C";break;
            case "绿色":
                coatCol="G";break;
            case "蓝色":
                coatCol="H";break;
            case "紫色":
                coatCol="F";break;
            case "黑色":
                coatCol="J";break;
            case "白色":
                coatCol="A";break;
            default:
                coatCol=null;break;
        }
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
