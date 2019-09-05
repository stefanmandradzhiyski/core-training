package com.snmi.equal;

public class ProgramEqual {

    public static void main(String[] args) {
        Flight firstFlight = new Flight("StefanAIR", 25);
        Flight secondFlight = new Flight("MandradzhiyskiAIR", 25);

        System.out.println(firstFlight.equals(secondFlight));
    }

}
