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
        if (vehicleClass!=null){
            switch (vehicleClass){
                case "不限":
                    vehicleClass=null;break;
                case "面包车":
                    vehicleClass="K40";break;
                case "轿车":
                    vehicleClass="K33";break;
                case "客车":
                    vehicleClass="K11";break;
                default:
                    vehicleClass=null;break;
            }
        }
        return vehicleClass;
    }

    public void setVehicleClass(String vehicleClass) {
        this.vehicleClass = vehicleClass;
    }

    public String getVehicleBrand() {
        if(vehicleBrand!=null){
            switch (vehicleBrand){
                case "不限":
                    vehicleBrand=null;break;
                case "GMC":
                    vehicleBrand="1";break;
                case "MG":
                    vehicleBrand="2";break;
                case "MINI":
                    vehicleBrand="3";break;
                case "安凯":
                    vehicleBrand="4";break;
                case "奥驰":
                    vehicleBrand="5";break;
                default:
                    vehicleBrand=null;
                    break;
            }
        }
        return vehicleBrand;
    }

    public void setVehicleBrand(String vehicleBrand) {
        this.vehicleBrand = vehicleBrand;
    }

    public String getVehicleColor() {
        if (vehicleColor!=null){
            switch (vehicleColor){
                case "不限":
                    vehicleColor=null;break;
                case "红色":
                    vehicleColor="E";break;
                case "棕色":
                    vehicleColor="I";break;
                case "黄色":
                    vehicleColor="C";break;
                case "绿色":
                    vehicleColor="G";break;
                case "蓝色":
                    vehicleColor="H";break;
                case "紫色":
                    vehicleColor="F";break;
                case "黑色":
                    vehicleColor="J";break;
                case "白色":
                    vehicleColor="A";break;
                default:
                    vehicleColor=null;break;
            }
        }
        return vehicleColor;
    }

    public void setVehicleColor(String vehicleColor) {
        this.vehicleColor = vehicleColor;
    }

    public String getDirection() {
        if (direction!=null){
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
        }
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getSpeed() {
        if (speed!=null){
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
        }
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
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
