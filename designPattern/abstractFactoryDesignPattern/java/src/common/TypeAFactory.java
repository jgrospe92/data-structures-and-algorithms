package common;

import core.Engine;
import core.Style;
import type.TypeAEngine;
import type.TypeAStyle;

public class TypeAFactory extends MotorHomesAbstractFactory{
    @Override
    public Style createStyle() {
        return new TypeAStyle();
    }

    @Override
    public Engine createEngine() {
        return new TypeAEngine();
    }
}
