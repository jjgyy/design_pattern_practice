package builder_pattern.director;

import builder_pattern.builder.Builder;
import builder_pattern.product.Product;

public class Director {

    public void conduct(Builder builder) {
        builder.addCPU();
        builder.addGPU();
        builder.addDisplay();
    }

}
