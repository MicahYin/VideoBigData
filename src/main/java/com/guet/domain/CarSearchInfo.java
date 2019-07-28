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
    }

    public String getVehicleBrand() {
        return vehicleBrand;
    }

    public void setVehicleBrand(String vehicleBrand) {
        this.vehicleBrand = vehicleBrand;
    }

    public String getVehicleColor() {
        return vehicleColor;
    }

    public void setVehicleColor(String vehicleColor) {
        this.vehicleColor = vehicleColor;
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
