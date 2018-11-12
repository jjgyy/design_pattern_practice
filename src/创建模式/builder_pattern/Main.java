package 创建模式.builder_pattern;

import 创建模式.builder_pattern.builder.Builder;
import 创建模式.builder_pattern.builder.BuilderA;
import 创建模式.builder_pattern.director.Director;

public class Main {

    public static void main(String[] args) {

        Director director = new Director();
        Builder builder = new BuilderA();
        director.conduct(builder);

        System.out.println(builder.getComputer().toString());

    }

}
