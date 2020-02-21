package com.education_wired_.work1;

import java.util.Arrays;

public class Runner {
    public void run( ) throws CloneNotSupportedException{
        Shape[] shapes = createShapes();
        infoShapes(shapes);
        System.out.printf("total area = %.2f%n",areaShapes(shapes));
        System.out.printf("area Triangle = %.2f%n", areaShapes(shapes, "Triangle"));
        System.out.printf("area Triangle = %.2f%n", areaShapes(shapes, Triangle.class));
        System.out.printf("area Circle = %.2f%n", areaShapes(shapes, "Circle"));
        System.out.printf("area Rectangle = %.2f%n", areaShapes(shapes, "Rectangle"));
        double[] areas = areaShapesByObj(shapes);
        printAllAreasByObj(areas);
        System.out.println("---Comparable---");
        Arrays.sort(shapes);
        infoShapes(shapes);
        System.out.println("---Comparator by color---");
        Arrays.sort(shapes, new MyComparatorColor());
        infoShapes(shapes);
        System.out.println("---Clone---");
        System.out.println(shapes[0].clone());

    }

    public  Shape[] createShapes(){
        return new Shape[] {
                new Triangle("red",2,3,4),
                new Triangle("silver",5,3,5),
                new Circle("orange",23),
                new Circle("green",4),
                new Circle("blue",35),
                new Rectangle("white", 23, 34),
                new Rectangle("yellow", 3, 64),
                new Rectangle("black", 2, 74),
                new Rectangle( "gray",3, 77),
        };
    }

    public  void infoShapes(Shape[] shapes){
        for (Shape shape: shapes){
            shape.draw();

        }
    }

    public   double areaShapes( Shape[] shapes){
        double area = 0;
        for (Shape shape: shapes){
            area += shape.calcArea();
        }
        return area;
    }

    public   double areaShapes( Shape[] shapes, String shapeName){
        double area = 0;

        for (Shape shape: shapes){
            if (shapeName.equals(shape.getClass().getSimpleName())) area += shape.calcArea();
        }
        return area;
    }

    public   double areaShapes( Shape[] shapes, Class shapeName){
        double area = 0;

        for (Shape shape: shapes){
            if (shape.getClass() == shapeName) area += shape.calcArea();
        }
        return area;
    }

    public  double[] areaShapesByObj (Shape[] shapes){
        double[] areas = new double [3];
        for (Shape shape: shapes){
            if (shape instanceof Circle) areas[0] += shape.calcArea();
            else if (shape instanceof Triangle) areas[1] += shape.calcArea();
            else if (shape instanceof Rectangle) areas[2] += shape.calcArea();
        }
        return areas;
    }

    public  void printAllAreasByObj (double[] areas){
        System.out.println("area Circle = " + areas[0]);
        System.out.println("area Triangle = " + areas[1]);
        System.out.println("area Rectangle = " + areas[2]);
    }



}
