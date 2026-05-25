import java.util.ArrayList;
import java.util.List;

public class Exercise {

    private int idRoutine;
    private String name;
    private String description;
    private String muscularGroup;

    private static List<Exercise> exerciseList = new ArrayList<>();

    // constructor
    public Exercise(int idRoutine, String name, String description, String muscularGroup) {
        this.idRoutine = idRoutine;
        this.name = name;
        this.description = description;
        this.muscularGroup = muscularGroup;
    }

    //metodos get y set
    public int getIdRoutine() {
        return idRoutine;
    }
    public void setIdRoutine(int idRoutine) {
        this.idRoutine = idRoutine;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getMuscularGroup() {
        return muscularGroup;
    }
    public void setMuscularGroup(String muscularGroup) {
        this.muscularGroup = muscularGroup;
    }

    //Metodo para crear un nuevo ejercicio

    public static void createExercise(int idRoutine, String name,
         String description, String muscularGroup) {

        //logica para crear un nuevo ejercicio con los datos proporcionados

        Exercise newExercise = new Exercise(idRoutine, name, 
            description, muscularGroup);
        exerciseList.add(newExercise);
    }

  
    //metodo para obtener la lista de ejercicios
    public List<Exercise> getExerciseList() {
        return exerciseList;
    }

    @Override
    public String toString() {
        return "Exercise{" +
                "idRoutine=" + idRoutine +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", muscularGroup='" + muscularGroup + '\'' +
                '}';    
    }

        

       


    
    
    
}
