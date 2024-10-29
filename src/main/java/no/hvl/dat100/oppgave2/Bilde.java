package no.hvl.dat100.oppgave2;

public class Bilde extends Tekst {

    private String url;

    // Konstruktør med fem parametere
    public Bilde(int id, String bruker, String dato, String tekst, String url) {
        super(id, bruker, dato, tekst);
        this.url = url;
    }

    // Konstruktør med seks parametere
    public Bilde(int id, String bruker, String dato, int likes, String tekst, String url) {
        super(id, bruker, dato, likes, tekst);
        this.url = url;
    }

    // Getter for URL
    public String getUrl() {
        return url;
    }

    // Setter for URL
    public void setUrl(String url) {
        this.url = url;
    }

    // toString-metode for Bilde
    @Override
    public String toString() {
        return "BILDE\n" + super.toString() + url + "\n";
    }

    // Valgfri toHTML-metode (hvis nødvendig for oppgave 6)
    public String toHTML() {
        return "<html><body><h2>" + getBruker() + "</h2><p>Dato: " + getDato() + "</p><p>Likes: " + getLikes() + "</p><p>Tekst: " + getTekst() + "</p><img src=\"" + url + "\"/></body></html>";
    }
}
