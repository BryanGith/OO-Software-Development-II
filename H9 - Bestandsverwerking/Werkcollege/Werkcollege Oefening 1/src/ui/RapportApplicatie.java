package ui;

import domein.OrderRecord;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class RapportApplicatie
{

    public static final String INNAAM = "orders.txt";
    public static final String UITNAAM = "korting.txt";
    public static final int MINAANTAL = 11;
    private Scanner input;
    private Formatter output;

    public static void main(String args[])
    {
        RapportApplicatie app = new RapportApplicatie();
        app.openFiles();
        app.kopieerKlantenMetKorting();
        app.closeFiles();
    }

    public void openFiles() 
    {
        try
        {
            input = new Scanner(Files.newInputStream(Paths.get(INNAAM)));
        } catch (InvalidPathException ie)
        {
            System.err.printf("Fout: kan <%s> niet vinden.%n", INNAAM);
            System.exit(1);
        } catch (IOException fe)
        {
            System.err.printf("Fout: kan <%s> niet openen.%n", INNAAM);
            System.exit(1);
        }
        try
        {
           output = new Formatter(Files.newOutputStream(Paths.get(UITNAAM)));
        } catch (InvalidPathException ie)
        {
            System.err.printf("Fout: kan <%s> niet vinden.%n", UITNAAM);
            System.exit(1);
        } catch (IOException fe)
        {
            System.err.printf("Fout: kan <%s> niet openen.%n", UITNAAM);
            System.exit(1);
        }
    }

    public void kopieerKlantenMetKorting()
    {
        OrderRecord record = new OrderRecord();
        try
        {
            while (input.hasNext())
            {
                record.setNaam(input.next());
                record.setProduct(input.next());
                record.setAantal(input.nextInt());
                record.setPrijs(input.nextDouble());
                if (record.getAantal() >= MINAANTAL)
                {
                    output.format("%-15s%20s%8d%10.2f%n",
                            record.getNaam(), record.getProduct(),
                            record.getAantal(), record.getPrijs() * 0.95);
                }
            }
        } catch (InputMismatchException ie)
        {
            System.err.printf("Fout:<%s> bevat ongeldige gegevens.%n",
                    INNAAM);
            closeFiles();
            System.exit(1);
        } catch (NoSuchElementException ee)
        {
            System.err.printf("Fout: er ontbreken gegevens in <%s>.%n",
                    INNAAM);
            closeFiles();
            System.exit(1);
        } catch (FormatterClosedException fe)
        {
            System.err.printf("Fout: bij schrijven naar <%s>%n", UITNAAM);
            System.exit(1);
        } catch (IllegalStateException se)
        {
            System.err.printf("Fout:bij lezen van <%s>.%n", INNAAM);
            System.exit(1);
        }
    }

    public void closeFiles()
    {
        if (input != null)
        {
            input.close();
        }
        if (output != null)
        {
            output.close();
        }
    }
}
