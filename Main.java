import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) 
    {
        int i;
        ArrayList<Cittadino> Cittadini = new ArrayList<>();
        Cittadini.add(new Cittadino("Mario", "Rossi", 35, "RSSMRA90A01H501U"));
        Cittadini.add(new Cittadino("Luigi", "Bianchi", 15, "BNCLGU83C15F205Z"));
        Cittadini.add(new Cittadino("Giulia", "Verdi", 28, "VRDGLL97E42L219K"));
        Cittadini.add(new Cittadino("Anna", "Neri", 51, "NRENNA72M60G273P"));
        for(i=0;i<Cittadini.size();i++)
        {
            System.err.println(i+1 + ": " + Cittadini.get(i).getNome() + " " + Cittadini.get(i).getCognome() );

        }
        try
        {
        System.err.println("Inserisci il numero della riga per vedere i dettagli completi");
        Scanner input = new Scanner(System.in);
        int riga1= input.nextInt();
        riga1=riga1-1;
        if(Cittadini.get(riga1).getEta()< 18)
        {
            throw new CittadinoMinorenneException();
        }
        System.err.println(Cittadini.get(riga1).getNome() + " " + Cittadini.get(riga1).getCognome() + " " + Cittadini.get(riga1).getEta() + " " +  Cittadini.get(riga1).getCodiceFiscale());
        }
        catch(InputMismatchException e)
        {
            System.err.println("Devi inserire un numero intero!");

        }
        catch(IndexOutOfBoundsException e)
        {
            System.err.println("Numero fuori dalla riga");
        }
        catch(CittadinoMinorenneException e)
        {
            System.out.println(e.getMessage());
        }   
    }
      
}