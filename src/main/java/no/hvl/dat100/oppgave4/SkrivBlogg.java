package no.hvl.dat100.oppgave4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.File;
import java.io.IOException;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave3.*;

public class SkrivBlogg {

    public static boolean skriv(Blogg samling, String mappe, String filnavn) {
        PrintWriter writer = null;
        try {
            // Opprett filen i den angitte mappen
            File fil = new File(mappe, filnavn);
            writer = new PrintWriter(fil);

            // Skriv antall innlegg i samlingen
            writer.println(samling.getAntallInnlegg());

            // Skriv hvert innlegg i samlingen
            for (Innlegg innlegg : samling.getInnlegg()) {
                writer.println(innlegg.toString());
            }

            // Filen ble skrevet vellykket
            return true;

        } catch (FileNotFoundException e) {
            // Håndter filnotfound unntak
            System.err.println("Filen ble ikke funnet: " + e.getMessage());
            return false;

        } catch (IOException e) {
            // Håndter IO unntak
            System.err.println("Feil ved skriving til fil: " + e.getMessage());
            return false;

        } finally {
            // Sørg for å lukke PrintWriter
            if (writer != null) {
                writer.close();
            }
        }
    }
}
