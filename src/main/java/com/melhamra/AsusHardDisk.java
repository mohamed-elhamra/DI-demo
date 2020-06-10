package com.melhamra;

public class AsusHardDisk implements HardDisk{

    private String someData = "some data from asusHardDisk";

    public void setSomeData(String someData) {
        this.someData = someData;
    }

    @Override
    public String returnData() {
        return someData;
    }
}
