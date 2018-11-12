package 创建模式.builder_pattern.director;

import 创建模式.builder_pattern.builder.Builder;

public class Director {

    public void conduct(Builder builder) {
        builder.addCPU();
        builder.addGPU();
        builder.addDisplay();
    }

}
