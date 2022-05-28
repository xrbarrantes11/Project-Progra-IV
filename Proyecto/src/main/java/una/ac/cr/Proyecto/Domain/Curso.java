package una.ac.cr.Proyecto.Domain;

public class Curso {
    private int idAsignatura;
    private String nombre;
    private String descripcion;
    private String grado;

    public Curso() {
    }

    public Curso(String nombre, String descripcion, String grado) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.grado = grado;
    }

    public Curso(int idAsignatura, String nombre, String descripcion, String grado) {
        this.idAsignatura = idAsignatura;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.grado = grado;
    }

    public int getIdAsignatura() {
        return idAsignatura;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getGrado() {
        return grado;
    }

    public void setIdAsignatura(int idAsignatura) {
        this.idAsignatura = idAsignatura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }
    
    
    
}
