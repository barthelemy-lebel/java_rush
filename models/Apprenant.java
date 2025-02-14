import java.util.List;

public class Apprenant {
    private String promotion;
    private String nom;
    private String prenom;
    private String email;
    private String telephone;
    private int absences;
    private List<String> roles;

    public Apprenant() {
        // Constructeur vide
    }

    // Constructeur complet
    public Apprenant(String promotion, String nom, String prenom, String email, String telephone, int absences, List<String> roles) {
        this.promotion = promotion;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.telephone = telephone;
        this.absences = absences;
        this.roles = roles;
    }

    // Getters et setters
    public String getPromotion() {
        return promotion;
    }

    public void setPromotion(String promotion) {
        this.promotion = promotion;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public int getAbsences() {
        return absences;
    }

    public void setAbsences(int absences) {
        this.absences = absences;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "Apprenant{" +
                "promotion='" + promotion + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", email='" + email + '\'' +
                ", telephone='" + telephone + '\'' +
                ", absences=" + absences +
                ", roles=" + roles +
                '}';
    }
}
