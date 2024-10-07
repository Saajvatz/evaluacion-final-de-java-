import controller.TareasController;
import model.Tarea;
import services.DataTarea;
import view.EliminarTareaView;
import view.NuevaTareaView;
import view.TareaView;
import view.TareasView;


public class Main {
    public static void main(String[] args) {

        //CONTROLLER
        TareasController Con = new TareasController();

        //MODEL
        Tarea Mod = new Tarea();

        //SERVICES
        DataTarea  Ser = new DataTarea();

        //VIEW
        EliminarTareaView Vie1 = new EliminarTareaView();
        NuevaTareaView Vie2 = new NuevaTareaView();
        TareasView Vie3 = new TareasView();
        TareaView Vie4 = new TareaView();

    }
}