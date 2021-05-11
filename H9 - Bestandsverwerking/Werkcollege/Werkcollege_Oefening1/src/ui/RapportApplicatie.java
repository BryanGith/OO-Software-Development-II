package ui;

import domein.OrderRecord;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class RapportApplicatie
{
    public static final String INNAAM = "order.txt";
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

    private void openFiles()
    {

    }

    private void kopieerKlantenMetKorting()
    {
    	
    }

    private void closeFiles()
    {

    }
}
