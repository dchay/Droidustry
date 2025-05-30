package mindustry.graphics.g3d;

import arc.graphics.*;
import arc.math.geom.*;

/** Defines color and height for a planet mesh. */
public interface HexMesher{

    float getHeight(Vec3 position);
    Color getColor(Vec3 position);

    default Color getEmissiveColor(Vec3 position){
        return Color.clear;
    }

    default boolean hasEmissive(){
        return false;
    }

    default boolean skip(Vec3 position){
        return false;
    }
}
