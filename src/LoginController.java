import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LoginController {

    public void signupButtonHandler(ActionEvent event) {
        try {
            Parent signupRoot = FXMLLoader.load(getClass().getResource("SignupPage.fxml"));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(signupRoot, 1000, 600));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}