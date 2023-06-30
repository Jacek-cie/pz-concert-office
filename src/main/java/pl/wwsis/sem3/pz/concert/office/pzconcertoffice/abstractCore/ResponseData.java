package pl.wwsis.sem3.pz.concert.office.pzconcertoffice.abstractCore;

class ResponseData <DTO>{
    public String status;
    public DTO data;
    public String exception;

    // Konstruktory, gettery, settery

    public ResponseData(String status, DTO data) {
        this.status = status;
        this.data = data;
    }
    public ResponseData() {

    }


}