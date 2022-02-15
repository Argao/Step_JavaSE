import MODEL.User;
import SERVICES.UserController;
import VIEW.Menu;

public class Main {
    public static void main(String[] args) {
        User userLogado = new User();
        Menu.inicio(userLogado);
    }
}
