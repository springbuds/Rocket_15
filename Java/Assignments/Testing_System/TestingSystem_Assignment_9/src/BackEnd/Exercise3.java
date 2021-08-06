package BackEnd;

import Entity.CPU;
import Entity.Car;

public class Exercise3 {
    public void Ques1(){
        CPU cpu = new CPU();
        CPU.Processor processor = cpu.new Processor();
        CPU.RAM ram = cpu.new RAM();
        System.out.println(processor.getCache());
        System.out.println(ram.getClockSpeed());
    }

    public void Ques2(){
        Car car = new Car( "Mazda" , "8WD");
        Car.Engine engine = car.new Engine("Crysler");
        System.out.println(car.toString());
        System.out.println("engineType= " + engine.getEngineType());
    }
}
