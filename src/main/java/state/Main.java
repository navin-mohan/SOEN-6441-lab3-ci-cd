package state;

// State Interface
interface TrafficLightState {
    void changeLight(TrafficLightContext context);
    void displayLight();
}

// Concrete State: Red Light
class RedLight implements TrafficLightState {
    public void changeLight(TrafficLightContext context) {
        System.out.println("Changing from RED to GREEN...");
        context.setState(new GreenLight());
    }

    public void displayLight() {
        System.out.println("RED Light - STOP!");
    }
}

// Concrete State: Green Light
class GreenLight implements TrafficLightState {
    public void changeLight(TrafficLightContext context) {
        System.out.println("Changing from GREEN to YELLOW...");
        context.setState(new YellowLight());
    }

    public void displayLight() {
        System.out.println("GREEN Light - GO!");
    }
}

// Concrete State: Yellow Light
class YellowLight implements TrafficLightState {
    public void changeLight(TrafficLightContext context) {
        System.out.println("Changing from YELLOW to RED...");
        context.setState(new RedLight());
    }

    public void displayLight() {
        System.out.println("YELLOW Light - SLOW DOWN!");
    }
}

// Context Class
class TrafficLightContext {
    private TrafficLightState currentState;

    public TrafficLightContext() {
        // Initial State
        currentState = new RedLight();
    }

    public void setState(TrafficLightState state) {
        currentState = state;
    }

    public void changeLight() {
        currentState.changeLight(this);
    }

    public void showLight() {
        currentState.displayLight();
    }
}


public class Main {
    public static void main(String[] args) {
        TrafficLightContext trafficLight = new TrafficLightContext();

        // Simulate traffic light changes
        for (int i = 0; i < 6; i++) {
            trafficLight.showLight();
            trafficLight.changeLight();
            System.out.println("-------------------------");
        }
    }
}