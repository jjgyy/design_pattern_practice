package builder_pattern;

import builder_pattern.builder.Builder;
import builder_pattern.builder.BuilderA;
import builder_pattern.director.Director;

public class Main {

    public static void main(String[] args) {

        Director director = new Director();
        Builder builder = new BuilderA();
        director.conduct(builder);

        System.out.println(builder.getComputer().toString());

    }

}
