package packetinfoexplorer;


import gearth.extensions.ThemedExtensionFormCreator;

import java.net.URL;

public class PacketInfoExplorerLauncher extends ThemedExtensionFormCreator {

//    @Override
//    public ExtensionForm createForm(Stage primaryStage) throws Exception {
//        FXMLLoader loader = new FXMLLoader(PacketInfoExplorer.class.getResource("PacketInfoExplorer.fxml"));
//        Parent root = loader.load();
//
//        primaryStage.setTitle("Packet info explorer");
//        primaryStage.setScene(new Scene(root));
//        primaryStage.setMinWidth(430);
//        primaryStage.setMinHeight(260);
//        primaryStage.getScene().getStylesheets().add(GEarthController.class.getResource("/gearth/ui/bootstrap3.css").toExternalForm());
//        primaryStage.getIcons().add(new Image(Main.class.getResourceAsStream("G-EarthLogoSmaller.png")));
//
//        return loader.getController();
//    }

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
