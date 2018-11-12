package 创建模式.builder_pattern.builder;

import java.util.ArrayList;

public abstract class Builder {

    public abstract void addCPU();

    public abstract void addGPU();

    public abstract void addDisplay();

    public abstract ArrayList<String> getComputer();

}
