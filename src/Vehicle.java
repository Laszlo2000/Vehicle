import java.util.Objects;

public class Vehicle {

    private VehicleStatus status;
    private int numberOfWheels;
    private String id;

    public Vehicle(String id) {
        this.id = id;
    }

    public Vehicle(int numberOfWheels, String id) {
        this.numberOfWheels = numberOfWheels;
        this.id = id;
    }

    public void setMove() {
        status = VehicleStatus.MOVE;
    }

    public void setStop() {
        status = VehicleStatus.STOP;
    }

    public void setPark() {
        status = VehicleStatus.PARK;
    }

    public VehicleStatus getStatus() {
        return status;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Vehicle [status=");
        builder.append(status);
        builder.append(", NumberOfWheels=");
        builder.append(numberOfWheels);
        builder.append(", id=");
        builder.append(id);
        builder.append("]");
        return builder.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        //if (!(obj instanceof Vehicle))
        if (o == null || getClass() != o.getClass())
            return false;
        Vehicle vehicle = (Vehicle) o;
        return numberOfWheels == vehicle.numberOfWheels && status == vehicle.status && Objects.equals(id, vehicle.id);
    }
}