package persistentie;

import domein.Passagier;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class PassagierMapper {

    private List<Passagier> passagiers = new ArrayList<>();

    public List<Passagier> geefPassagiers() {
        Path path = Path.of("AmourJavaFX/src/bestanden/passagiers.txt");
        passagiers = leesTekstBestand(path.toAbsolutePath().toString());
        return passagiers;
    }

    public List<Passagier> leesTekstBestand(String naamBestand) {
        try (
                Scanner input = new Scanner(Files.newInputStream(Paths.get(naamBestand)))) {
            // input.useDelimiter(Pattern.compile("(\\n)|, "));
            while (input.hasNext()) {
                // maakPassagierAan(input);
                String passagier = input.nextLine();
                String[] passagierFields = passagier.split(", ");
                passagiers.add(new Passagier(passagierFields[0], Double.parseDouble(passagierFields[2]), Integer.parseInt(passagierFields[1])));
            }
        } catch (InvalidPathException ie) {
            System.err.println("Error finding file.");
            System.exit(1);
        } catch (NoSuchElementException e) {
            System.err.println("Er ontbreken gegevens!");
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        } catch (IOException io) {
            System.err.println("Error opening file.");
            io.printStackTrace();
            System.exit(1);
        }

        return passagiers;
    }

    private void maakPassagierAan(Scanner input) {
        String naam;
        double aantalKgBaggage;
        int nummer;

        try {
            naam = input.next();
            nummer = input.nextInt();
            aantalKgBaggage = Double.parseDouble(input.next());
            voegPassagierToe(naam, aantalKgBaggage, nummer, passagiers);
        } catch (InputMismatchException e) {
            e.getMessage();
        } finally {
            input.nextLine();
        }
    }

    public static void voegPassagierToe(String naam, double aantalKgBaggage, int nummer, List<Passagier> passagiers) {
        passagiers.add(new Passagier(naam, aantalKgBaggage, nummer));
    }
}
