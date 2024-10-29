package no.hvl.dat100.oppgave1;

public abstract class Innlegg {
    
    // Deklarering av objektvariablene
    private int id;
    private String bruker;
    private String dato;
    private int likes;

    // Standard konstruktør uten parametere
    public Innlegg() {
        // Ingen implementasjon nødvendig her hvis vi ikke trenger standard verdier
    }

    // Konstruktør med tre parametere, setter likes til 0
    public Innlegg(int id, String bruker, String dato) {
        this.id = id;
        this.bruker = bruker;
        this.dato = dato;
        this.likes = 0;
    }

    // Konstruktør med fire parametere
    public Innlegg(int id, String bruker, String dato, int likes) {
        this.id = id;
        this.bruker = bruker;
        this.dato = dato;
        this.likes = likes;
    }
    
    // Get- og set-metoder
    public String getBruker() {
        return bruker;
    }

    public void setBruker(String bruker) {
        this.bruker = bruker;
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public int getId() {
        return id;
    }

    public int getLikes() {
        return likes;
    }
    
    // Øk antall likes med 1
    public void doLike() {
        likes++;
    }
    
    // Sjekker om to innlegg er like basert på id
    public boolean erLik(Innlegg innlegg) {
        return this.id == innlegg.getId();
    }
    
    // toString metode
    @Override
    public String toString() {
        return id + "\n" + bruker + "\n" + dato + "\n" + likes + "\n";
    }
    
    // toHTML metode (valgfri oppgave 6, implementer hvis nødvendig)
    public String toHTML() {
        return "<html><body><h2>" + bruker + "</h2><p>Dato: " + dato + "</p><p>Likes: " + likes + "</p></body></html>";
    }
}
