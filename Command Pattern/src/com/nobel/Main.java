package com.nobel;

import com.nobel.fx.Button;
import com.nobel.fx.Command;

public class Main {

    public static void main(String[] args) {
        Light light = new Light();
        Command lightOnCommand = new SwitchOnCommand(light);
        Button lightOnButton = new Button(lightOnCommand);

        lightOnButton.click();
    }
}
