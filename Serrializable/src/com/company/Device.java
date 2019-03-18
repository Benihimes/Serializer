package com.company;

import java.io.Serializable;

public class Device implements Serializable {
    int id;
    String name;

    CPU cpu;
    int ram;
    int hdd;
    int ssd;
}
