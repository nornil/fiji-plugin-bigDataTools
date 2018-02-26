package de.embl.cba.bigDataTools.utils;

import de.embl.cba.bigDataTools.dataStreamingTools.ShearingSettings;

/**
 * Created by tischi on 14/06/17.
 */
public class ImageDataInfo {

    public int nC;
    public int nT;
    public int nZ;
    public int nX;
    public int nY;
    public int bitDepth;
    public String fileType;
    public String h5DataSetName;
    public String[] channelFolders;
    public String[][][] ctzFileList;
    public ShearingSettings shearingSettings;
}
