package model;

public enum Status {
    INICIADO("iniciado"),
    EM_ANDAMENTO("em andamento"),
    FINALIZADO("finalizado");


    private String status;

    Status(String status) {
        this.status = status;
    }
}
