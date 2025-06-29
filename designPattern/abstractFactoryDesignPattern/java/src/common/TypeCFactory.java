package common;

import core.Engine;
import core.Style;
import type.TypeCEngine;
import type.TypeCStyle;

public class TypeCFactory extends MotorHomesAbstractFactory {
    @Override
    public Style createStyle() {
        return new TypeCStyle();
    }

    @Override
    public Engine createEngine() {
        return new TypeCEngine();
    }
}
