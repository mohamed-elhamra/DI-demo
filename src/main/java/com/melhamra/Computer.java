package com.melhamra;

public class Computer {

    //Now we can work with any type of hard disk
    private HardDisk hardDisk;

    public Computer(HardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }

    public Computer() {}

    public HardDisk getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(HardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }
}
