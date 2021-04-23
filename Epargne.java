public class Epargne extends Compte{
    private int taux;


    public Cheque(){
        super();
    }

    public Epargne(int solde){
        super(solde);

    }
    public Epargne(int solde,int taux){
        super(solde);
        this.taux=taux;
    }
    
    public void depot(int montant){
        solde +=montant;
    }
    
    
   
 
    }