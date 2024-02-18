package model;

public enum Role {
    ASSISTENTE("assistente"),
    ESTAGIARIO("estagiario"),
    ADVOGADO("advogado");

    private String role;

    Role(String role) {
        this.role = role;
    }

    public String getRole() {
        return this.role;
    }
}
