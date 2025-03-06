package command;

interface Command {
    void execute();
}


class Light {
    void turnOn() {
        System.out.println("command.Light is ON");
    }
    void turnOff() {
        System.out.println("command.Light is OFF");
    }
}

class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }
}

class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }
}

class Button {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }
}


public class Main {
    public static void main(String[] args) {
        Light livingRoomLight = new Light();

        Command lightOn = new LightOnCommand(livingRoomLight);
        Command lightOff = new LightOffCommand(livingRoomLight);

        Button btn = new Button();

        btn.setCommand(lightOn);
        btn.pressButton();  // Output: command.Light is ON

        btn.setCommand(lightOff);
        btn.pressButton();  // Output: command.Light is OFF
    }
}
