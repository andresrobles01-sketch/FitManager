import java.util.ArrayList;
import java.util.List;

public class Member {

    private int idUser;
    private String name;
    private int age;
    private double wight ;
    private double height ;
    private String email;
    private String gender;
    private double IMC;

    private static  List<Member> membersList = new ArrayList<>();




    // Constructor
    public Member(int idUser, String name, int age, double wight, double height, String email, String gender,
            double iMC) {
        this.idUser = idUser;
        this.name = name;
        this.age = age;
        this.wight = wight;
        this.height = height;
        this.email = email;
        this.gender = gender;
        this.IMC = iMC;
    }

    // Getters and Setters
    public int getIdUser() {
        return idUser;
    }
    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public double getWight() {
        return wight;
    }
    public void setWight(double wight) {
        this.wight = wight;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public double getIMC() {
        return IMC;
    }
    public void setIMC(double iMC) {
        IMC = iMC;
    }

    

    // Metodo para registrar un nuevo miembro en la lista de miembros

    public static void registerMember(int idUser, String name, int age, double wight, double height, String email, String gender,
            double iMC) {
                //logica para registrar un miembro en la lista de miembros'


                // Crear un nuevo miembro con los datos proporcionados
                Member newMember = new Member(idUser, name, age,
                     wight, height, email, gender, iMC);

                // Agregar el nuevo miembro a la lista de miembros
                membersList.add(newMember);
                System.out.println("Miembro: " + name + " registrado exitosamente.");
    }


    // metodo para mostrar la lista de miembros registrados
    public List<Member> getMembersList() {
        return membersList;
    }
    
@Override 
public String toString(){
    return "Member{" +
            "idUser=" + idUser +
            ", name='" + name + '\'' +
            ", age=" + age +
            ", wight=" + wight +
            ", height=" + height +
            ", email='" + email + '\'' +
            ", gender='" + gender + '\'' +
            ", IMC=" + IMC +
            '}';
    }

}
