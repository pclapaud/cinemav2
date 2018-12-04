package fr.laerce.model;

public class Role {
    private String role;
    private Film film;
    private Personne acteur;
    private Integer ordre;
    public Role(String role,Film film, Personne acteur, Integer ordre){
        this.role = role;
        this.film = film;
        this.acteur = acteur;
        this.ordre = ordre;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public Personne getActeur() {
        return acteur;
    }

    public void setActeur(Personne acteur) {
        this.acteur = acteur;
    }

    public Integer getOrdre() {
        return ordre;
    }

    public void setOrdre(Integer ordre) {
        this.ordre = ordre;
    }

    @Override
    public String toString() {
        return "Role{" +
                "role='" + role + '\'' +
                ", film=" + film +
                ", acteur=" + acteur +
                ", ordre=" + ordre +
                '}';
    }
}
