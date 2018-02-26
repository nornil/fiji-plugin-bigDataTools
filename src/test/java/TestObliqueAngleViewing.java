import de.embl.cba.bigDataTools.dataStreamingTools.DataStreamingTools;
import de.embl.cba.bigDataTools.dataStreamingTools.DataStreamingToolsGUI;
import ij.IJ;

/**
 * Created by norlin on 26/02/18.
 */
public class TestObliqueAngleViewing {

    public static void main(String[] args)
    {
        final net.imagej.ImageJ ij = new net.imagej.ImageJ();
        ij.ui().showUI();

        final DataStreamingTools dataStreamingTools = new DataStreamingTools();
        Thread t1 = new Thread(new Runnable() {
            public void run()
            {
                final String directory ="/Users/norlin/forskning/Programmering/Java/fiji-plugin-bigDataTools/src/test/data";
                dataStreamingTools.openFromDirectory(
                        directory,
                        "None",
                        ".*",
                        "Data",
                        null,
                        10,
                        true,
                        false);
            }
        }); t1.start();

        IJ.wait(1000);

        DataStreamingToolsGUI dataStreamingToolsGUI = new DataStreamingToolsGUI();
        dataStreamingToolsGUI.showDialog();

    }

}
