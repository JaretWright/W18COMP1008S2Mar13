package w18comp1008s2mar13;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author JWright
 */
public class Phone
{
    private String make, model;
    private double resolution;
    private int memory;

    public Phone(String make, String model, double resolution, int memory)
    {
        setMake(make);
        setModel(model);
        setResolution(resolution);
        setMemory(memory);
    }

    public String getMake()
    {
        return make;
    }

    public void setMake(String make)
    {
        String[] validBrands = {"Apple","Samsung","Blackberry","HTC","Sony","Google", "LG"};
        List brandList= Arrays.asList(validBrands);
        if (brandList.contains(make))
            this.make = make;
        else
            throw new IllegalArgumentException("Valid makes are: Apple, Samsung, etc...");
    }

    public String getModel()
    {
        return model;
    }

    public void setModel(String model)
    {
        if (!model.isEmpty())
            this.model = model;
        else
            throw new IllegalArgumentException("Model cannot be empty");
    }

    public double getResolution()
    {
        return resolution;
    }

    public void setResolution(double resolution)
    {
        if (resolution>=0 && resolution <=24)
            this.resolution = resolution;
        else
            throw new IllegalArgumentException("Resolution must be 0-24");
    }

    public int getMemory()
    {
        return memory;
    }

    public void setMemory(int memory)
    {
        if (memory >=4 && memory <=256)
            this.memory = memory;
        else
            throw new IllegalArgumentException("Memory must be in the range 4-256");
    }
    
    public String toString()
    {
        return String.format("%s %s with %d gigs of memory", getMake(),
                                    getModel(), getMemory());
    }
    
    
    
}
