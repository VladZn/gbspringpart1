package ru.vlad.lesson2.components;

import org.springframework.stereotype.Component;
import ru.vlad.lesson2.annotation.UnproducableCameraRoll;

@Component("cameraRoll")
@UnproducableCameraRoll(usingCameraRollClass = ColorCameraRoll.class)
public class BlackAndWhiteCameraRoll implements CameraRoll{

    public void processing() {

        System.out.println("-1 черно-белый кадр");

    }
}
