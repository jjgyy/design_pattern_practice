package builder_pattern.builder;

import java.util.ArrayList;

public class BuilderA extends Builder {

    private ArrayList<String> computer = new ArrayList<>();

    @Override
    public void addCPU() {
        this.computer.add("CPU256M");
    }

    @Override
    public void addGPU() {
        this.computer.add("GPU1080");
    }

    @Override
    public void addDisplay() {
        this.computer.add("Sony Display");
    }

    @Override
    public ArrayList<String> getComputer() {
        return this.computer;
    }
}
