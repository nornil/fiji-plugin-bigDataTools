package de.embl.cba.bigDataTools.dataStreamingTools;

import javafx.geometry.Point3D;

/**
 * Created by n norlin on 26/02/18.
 */
public class ShearingSettings {

    public boolean useObliqueAngle=true;
    public double shearingFactorX = 0.0, shearingFactorY = 0.0;
    public double cameraPixelsize = 6.5;
    public boolean viewLeft=false,backwardStackAcquisition=false;
    public double magnification = 40;
    public double stepSize= 1;
    public double objectiveAngle=45;
    public boolean useYshear=false;
    public javafx.geometry.Point3D offset= new Point3D(0,0,0);  //NN !

}
