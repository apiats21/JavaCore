package main.java.com.apiats21.javacore.practicepatterns.structual.flyweight;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlyWeightDemo {
    public static void main(String[] args) {
        Factory areaFactory = new Factory();

        List<Area> areas = new ArrayList<>();

        areas.add(areaFactory.getArea("square"));
        areas.add(areaFactory.getArea("circle"));
        areas.add(areaFactory.getArea("rectangle"));


        for(Area shapeArea:areas){
            shapeArea.calculateArea(2,9);
        }
    }
}

interface Area{
    void calculateArea(float x, int y);
}
class Square implements Area{
    @Override
    public void calculateArea(float x, int y) {
        System.out.println("Square area = " + x * y);
    }
}
class Circle implements Area{
    @Override
    public void calculateArea(float x, int y) {
        System.out.println("Circle area = "  + (3.14 * x * x));
    }
}

class Rectangle implements Area{
    @Override
    public void calculateArea(float x, int y) {
        System.out.println("Rectangle area = " + x * x);
    }
}

class Factory{
    private static final Map<String, Area> areas = new HashMap<>();
    public Area getArea(String shapeName) {

        Area area = areas.get(shapeName);
        if(area == null) {
            switch (shapeName){
                case "square":
                    area = new Square();
                    break;
                case "circle":
                    area = new Circle();
                    break;
                case "rectangle":
                    area = new Rectangle();
                    break;
            }
            areas.put(shapeName, area);
        }
        return area;
    }
}
