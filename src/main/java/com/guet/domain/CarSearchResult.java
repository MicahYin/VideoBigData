package com.guet.domain;

/**
 * @author MicahYin
 * @date 2019/7/28 16:19
 */
public class CarSearchResult {
    private String appearTime;
    private String taskIp;
    private String taskName;
    private String vehicleClass;
    private String vehicleBrand;
    private String vehicleModel;
    private String vehicleColor;
    private String speed;
    private String direction;
    private String plateNo;
    private String storageUrl1;
    private String storageUrl2;

    public String getAppearTime() {
        return appearTime;
    }

    public void setAppearTime(String appearTime) {
        this.appearTime = appearTime;
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

    public String getVehicleModel() {
        return vehicleModel;
    }

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    public String getVehicleColor() {
        return vehicleColor;
    }

    public void setVehicleColor(String vehicleColor) {
        this.vehicleColor = vehicleColor;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getPlateNo() {
        return plateNo;
    }

    public void setPlateNo(String plateNo) {
        this.plateNo = plateNo;
    }

    public String getStorageUrl1() {
        return storageUrl1;
    }

    public void setStorageUrl1(String storageUrl1) {
        this.storageUrl1 = storageUrl1;
    }

    public String getStorageUrl2() {
        return storageUrl2;
    }

    public void setStorageUrl2(String storageUrl2) {
        this.storageUrl2 = storageUrl2;
    }

    @Override
    public String toString() {
        return "CarSearchResult{" +
                "appearTime='" + appearTime + '\'' +
                ", taskIp='" + taskIp + '\'' +
                ", taskName='" + taskName + '\'' +
                ", vehicleClass='" + vehicleClass + '\'' +
                ", vehicleBrand='" + vehicleBrand + '\'' +
                ", vehicleModel='" + vehicleModel + '\'' +
                ", vehicleColor='" + vehicleColor + '\'' +
                ", speed='" + speed + '\'' +
                ", direction='" + direction + '\'' +
                ", plateNo='" + plateNo + '\'' +
                ", storageUrl1='" + storageUrl1 + '\'' +
                ", storageUrl2='" + storageUrl2 + '\'' +
                '}';
    }
}
