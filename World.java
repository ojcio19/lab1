package agh.cs.lab1;


import java.util.HashMap;
import java.util.Scanner;


public class World {
    public static void main(String[] args) {
        System.out.println("System started..");

        Direction[] dirTable = new Direction[args.length];

        dirTable = changeToEnum(args);

        run(dirTable);
        System.out.println("System turned off!");
    }

    private static Direction[] changeToEnum(String[] args){
        HashMap<String,Direction> hmap = new HashMap<String,Direction>();
        Direction[] deliveredDir = new Direction[args.length];

        hmap.put("f",Direction.FORWARD);
        hmap.put("b",Direction.BACKWARD);
        hmap.put("r",Direction.RIGHT);
        hmap.put("l",Direction.LEFT);

        for(int i=0; i < args.length;i++){
            deliveredDir[i] = hmap.get(args[i]);
        }
        return deliveredDir;
    }

    public static void run(Direction[] args){

        for(Direction argument : args) {

            switch (argument) {
                case FORWARD:
                    System.out.println("zwierze idzie do przodu!");
                    break;
                case BACKWARD:
                    System.out.println("zwierze idzie do tylu");
                    break;
                case RIGHT:
                    System.out.println("zwierze idzie w prawo!");
                    break;
                case LEFT:
                    System.out.println("zwierze idzie w lewo");
                    break;
                default:
                    break;
            }
        }
    }
}
