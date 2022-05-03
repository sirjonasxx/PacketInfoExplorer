package packetinfoexplorer;


import gearth.extensions.ThemedExtensionFormCreator;

import java.net.URL;

public class PacketInfoExplorerLauncher extends ThemedExtensionFormCreator {

    public static void main(String[] args) {
        runExtensionForm(args, PacketInfoExplorerLauncher.class);
    }

    @Override
    protected String getTitle() {
        return "Packet info explorer";
    }

    @Override
    protected URL getFormResource() {
        return PacketInfoExplorer.class.getResource("PacketInfoExplorer.fxml");
    }
}
