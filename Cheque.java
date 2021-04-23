public class Cheque extends Compte{
    private int frais;

    public Cheque(){
        super();
    }

    public Cheque(int solde){
        super(solde);

    }
 public Cheque(int solde,int frais){
        super(solde);
        this.frais=frais;
    }
    
    public void depot(int montant){
        solde +=montant;
    }
    public void retrait(int montant){
        solde -=montant;
    }
    public void virement(int montant, destinataire){
        this.retrait(montant);
        destinataire.depot(montant);
    }
    
 
 
   


    }