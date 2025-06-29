package common;

import core.Engine;
import core.Style;
import type.TypeAEngine;
import type.TypeAStyle;
import type.TypeBEngine;
import type.TypeBStyle;

public class TypeBFactory extends MotorHomesAbstractFactory{
    @Override
    public Style createStyle() {
        return new TypeBStyle();
    }

    @Override
    public Engine createEngine() {
        return new TypeBEngine();
    }
}
