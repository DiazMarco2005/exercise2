package exercise2;
class Grade {
    private String curso;
    private int nota;

    public Grade(String curso, int nota) {
        this.curso = curso;
        this.nota = nota;
    }
    public Grade() {

    }

    public String getCurso() {
        return curso;
    }

    // Setter para 'curso'
    public void setCurso(String curso) {
        this.curso = curso;
    }

    // Getter para 'nota'
    public int getNota() {
        return nota;
    }

    // Setter para 'nota'
    public void setNota(int nota) {
        this.nota = nota;
    }

}
