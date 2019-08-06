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
        if (riderCode!=null){
            switch (riderCode) {
                case "不限":
                    this.riderCode = null;
                    break;
                case "是":
                    this.riderCode = "1";
                    break;
                case "否":
                    this.riderCode = "2";
                    break;
                default:
                    this.riderCode = null;
                    break;
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

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
        if (direction!=null){
            switch (direction){
                case "不限":
                    this.direction=null;break;
                case "上":
                    this.direction="1";break;
                case "下":
                    this.direction="2";break;
                case "左":
                    this.direction="3";break;
                case "右":
                    this.direction="4";break;
                default:
                    this.direction=null;break;
            }
        }
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
        if (speed!=null){
            switch (speed){
                case "不限":
                    this.speed=null;break;
                case "慢":
                    this.speed="1";break;
                case "中":
                    this.speed="2";break;
                case "快":
                    this.speed="3";break;
                default:
                    this.speed=null;break;
            }
        }
    }

    public String getCoatCol() {
        return coatCol;
    }

    public void setCoatCol(String coatCol) {
        this.coatCol = coatCol;
        if (coatCol!=null){
            switch (coatCol){
                case "不限":
                    this.coatCol=null;break;
                case "红色":
                    this.coatCol="E";break;
                case "棕色":
                    this.coatCol="I";break;
                case "黄色":
                    this.coatCol="C";break;
                case "绿色":
                    this.coatCol="G";break;
                case "蓝色":
                    this.coatCol="H";break;
                case "紫色":
                    this.coatCol="F";break;
                case "黑色":
                    this.coatCol="J";break;
                case "白色":
                    this.coatCol="A";break;
                default:
                    this.coatCol=null;break;
            }
        }
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
