package packetinfoexplorer;

import gearth.Main;
import gearth.extensions.ExtensionForm;
import gearth.extensions.ExtensionFormCreator;
import gearth.ui.GEarthController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class PacketInfoExplorerLauncher extends ExtensionFormCreator {

    @Override
    public ExtensionForm createForm(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(PacketInfoExplorer.class.getResource("PacketInfoExplorer.fxml"));
        Parent root = loader.load();

        primaryStage.setTitle("Packet info explorer");
        primaryStage.setScene(new Scene(root));
        primaryStage.setMinWidth(430);
        primaryStage.setMinHeight(260);
        primaryStage.getScene().getStylesheets().add(GEarthController.class.getResource("/gearth/ui/bootstrap3.css").toExternalForm());
        primaryStage.getIcons().add(new Image(Main.class.getResourceAsStream("G-EarthLogoSmaller.png")));

        return loader.getController();
    }

    public static void main(String[] args) {
        runExtensionForm(args, PacketInfoExplorerLauncher.class);
    }
}
