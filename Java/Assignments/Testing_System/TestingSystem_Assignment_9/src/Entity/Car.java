package Entity;

public class Car {
    private String Name;
    private String Type;

    public class Engine{
        private String engineType;

        public String getEngineType() {
            return engineType;
        }

        public void setEngineType(String engineType) {
            this.engineType = engineType;
        }

        public Engine(String engineType) {
            this.engineType = engineType;
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "Name='" + Name + '\'' +
                ", Type='" + Type + '\'' +
                '}';
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public Car(String name, String type) {
        Name = name;
        Type = type;
    }
}
