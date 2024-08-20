package de.heimbrodt.sten.models;

import java.util.List;

public class SensorRead {
    private String sensorName;
    private List<PlantDataPoint> plants;
    private String timestamp;

    public SensorRead() {
        this.timestamp = java.time.Instant.now().toString();
    }
    public SensorRead(String sensorName, List<PlantDataPoint> plants, String timestamp) {
        this.timestamp = timestamp;
        this.sensorName = sensorName;
        this.plants = plants;
    }

    public String getSensorName() {
        return sensorName;
    }
    public List<PlantDataPoint> getPlantDataPoints() {
        return plants;
    }

    public void setSensorName(String sensorName) {
        this.sensorName = sensorName;
    }
    public void setPlantDataPoints(List<PlantDataPoint> plantDataPoints) {
        this.plants = plantDataPoints;
    }
    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(java.lang.String timestamp) {
        this.timestamp = timestamp;
    }
}
