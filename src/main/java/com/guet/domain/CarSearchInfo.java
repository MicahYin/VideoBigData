package com.guet.domain;

/**
 * @author MicahYin
 * @date 2019/7/24 16:23
 * 用于获取车辆搜索条件
 */
public class CarSearchInfo {
    private String startTime;
    private String endTime;
    private String plateNo;
    private String vehicleClass;
    private String vehicleBrand;
    private String vehicleColor;
    private String direction;
    private String speed;

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

    public String getPlateNo() {
        return plateNo;
    }

    public void setPlateNo(String plateNo) {
        this.plateNo = plateNo;
    }

    public String getVehicleClass() {
        return vehicleClass;
    }

    public void setVehicleClass(String vehicleClass) {
        this.vehicleClass = vehicleClass;
        if (vehicleClass!=null){
            switch (vehicleClass){
                case "不限":
                    this.vehicleClass=null;break;
                case "面包车":
                    this.vehicleClass="K40";break;
                case "轿车":
                    this.vehicleClass="K33";break;
                case "客车":
                    this.vehicleClass="K11";break;
                default:
                    this.vehicleClass=null;break;
            }
        }
    }

    public String getVehicleBrand() {
        return vehicleBrand;
    }

    public void setVehicleBrand(String vehicleBrand) {
        this.vehicleBrand = vehicleBrand;
        if(vehicleBrand!=null){
            switch (vehicleBrand){
                case "不限":
                    this.vehicleBrand=null;break;
                case "GMC":
                    this.vehicleBrand="1";break;
                case "MG":
                    this.vehicleBrand="2";break;
                case "MINI":
                    this.vehicleBrand="3";break;
                case "安凯":
                    this.vehicleBrand="4";break;
                case "奥驰":
                    this.vehicleBrand="5";break;
                default:
                    this.vehicleBrand=null;
                    break;
            }
        }
    }

    public String getVehicleColor() {
        return vehicleColor;
    }

    public void setVehicleColor(String vehicleColor) {
        this.vehicleColor = vehicleColor;
        if (vehicleColor!=null){
            switch (vehicleColor){
                case "不限":
                    this.vehicleColor=null;break;
                case "红色":
                    this.vehicleColor="E";break;
                case "棕色":
                    this.vehicleColor="I";break;
                case "黄色":
                    vehicleColor="C";break;
                case "绿色":
                    this.vehicleColor="G";break;
                case "蓝色":
                    this.vehicleColor="H";break;
                case "紫色":
                    this.vehicleColor="F";break;
                case "黑色":
                    this.vehicleColor="J";break;
                case "白色":
                    this.vehicleColor="A";break;
                default:
                    this.vehicleColor=null;break;
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

    @Override
    public String toString() {
        return "CarSearchInfo{" +
                "startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                ", plateNo='" + plateNo + '\'' +
                ", vehicleClass='" + vehicleClass + '\'' +
                ", vehicleBrand='" + vehicleBrand + '\'' +
                ", vehicleColor='" + vehicleColor + '\'' +
                ", direction='" + direction + '\'' +
                ", speed='" + speed + '\'' +
                '}';
    }
}
