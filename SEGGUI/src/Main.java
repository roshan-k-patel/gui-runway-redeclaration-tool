import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class Main extends Application implements EventHandler {

    protected Button btnCalc;
    protected Button btnBreakdown;
    protected Button btnUserguide;

    private static final Border black = new Border(new BorderStroke(Color.BLACK,
            BorderStrokeStyle.SOLID, new CornerRadii(8), new BorderWidths(2)));

    public static void main(String[] args) {
        launch(args);

    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Runway Re-declaration Tool");

        // create buttons
        btnCalc = new Button();
        btnBreakdown = new Button();
        btnUserguide = new Button();

        // set text
        btnCalc.setText("Calculate");
        btnBreakdown.setText("Calculation Breakdown");
        btnUserguide.setText("Download User Guide");

        // create tab pane
        TabPane tabPane = new TabPane();

        // create tabs
        Tab mainTab = new Tab("Main", new Label("Main runway declaration tool"));
        Tab importTab = new Tab("Import"  , new Label("Window for importing objects and obstacles"));
        Tab settingsTab = new Tab("Settings" , new Label("Settings for app"));


        GridPane home = new GridPane(); // create home pane
        home.setPadding(new Insets(10,10,10,10)); // set padding around edges
        home.setVgap(8);    // set gap in between cells vertically
        home.setHgap(10);    // set gap in between cells horizontally

        Pane pnLog = new Pane();
        GridPane.setConstraints(pnLog,0,0);

        GridPane gpnInVis = new GridPane();
        GridPane.setConstraints(gpnInVis, 1, 0);

        home.getChildren().addAll(pnLog,gpnInVis);

        /////////////////////////////////////////////////////////////////////////////////////////

        GridPane gpnInput = new GridPane();
        GridPane.setConstraints(gpnInput, 0, 1);

        Pane pnVis = new Pane();
        GridPane.setConstraints(pnVis,0,0);

        gpnInVis.getChildren().addAll(gpnInput, pnVis);

        /////////////////////////////////////////////////////////////////////////////////////////

        Pane pnInput = new Pane();
        GridPane.setConstraints(pnInput, 0, 0);

        Pane pnInput2 = new Pane();
        GridPane.setConstraints(pnInput2, 1, 0);

        gpnInput.getChildren().addAll(pnInput,pnInput2);








       /* GridPane mainPanel = new GridPane();
        mainPanel.add(btnCalc, 3, 3 );
        mainPanel.add(btnBreakdown, 3, 4);
        mainTab.setContent(mainPanel);


        mainTab.setContent(mainPanel);
        settingsTab.setContent(btnUserguide);
        settingsTab.setContent(btnUserguide);
*/
        tabPane.getTabs().add(mainTab);
        tabPane.getTabs().add(importTab);
        tabPane.getTabs().add(settingsTab);

        // stores tab pane
        VBox root = new VBox(tabPane);

        // scene with window dimensions
        Scene scene = new Scene(root,1200,800, Color.AZURE);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @Override
    public void handle(Event event) {

    }
}