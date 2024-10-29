package no.hvl.dat100.oppgave3;

import no.hvl.dat100.oppgave1.Innlegg;

public class Blogg {

    private Innlegg[] innleggtabell; // Tabell som lagrer innlegg
    private int nesteledig; // Antall innlegg lagret, dvs. neste ledige posisjon

    // a) Standard konstruktør med startstørrelse på 20
    public Blogg() {
        this.innleggtabell = new Innlegg[20];
        this.nesteledig = 0;
    }

    // b) Konstruktør som tar inn lengden på tabellen som parameter
    public Blogg(int lengde) {
        this.innleggtabell = new Innlegg[lengde];
        this.nesteledig = 0;
    }

    // c) Metode for å returnere antall innlegg i tabellen
    public int getAntall() {
        return nesteledig;
    }

    // d) Metode som returnerer tabellen av innlegg
    public Innlegg[] getSamling() {
        return innleggtabell;
    }

    // e) Finn indeks for et innlegg basert på ID
    public int finnInnlegg(Innlegg innlegg) {
        for (int i = 0; i < nesteledig; i++) {
            if (innleggtabell[i].erLik(innlegg)) {
                return i;
            }
        }
        return -1; // Ikke funnet
    }

    // f) Sjekk om et innlegg allerede finnes i tabellen
    public boolean finnes(Innlegg innlegg) {
        return finnInnlegg(innlegg) != -1;
    }

    // g) Sjekk om det er ledig plass i tabellen
    public boolean ledigPlass() {
        return nesteledig < innleggtabell.length;
    }

    // h) Legg til et innlegg dersom det ikke allerede finnes
    public boolean leggTil(Innlegg innlegg) {
        if (!finnes(innlegg) && ledigPlass()) {
            innleggtabell[nesteledig] = innlegg;
            nesteledig++;
            return true;
        }
        return false;
    }

    // i) Returner alle innlegg som en streng med antall innlegg øverst
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(nesteledig).append("\n");
        for (int i = 0; i < nesteledig; i++) {
            sb.append(innleggtabell[i].toString());
        }
        return sb.toString();
    }

}
