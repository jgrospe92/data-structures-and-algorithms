package common;

import core.Engine;
import core.Style;

public abstract class MotorHomesAbstractFactory {

    public abstract Style createStyle();
    public abstract Engine createEngine();
}
