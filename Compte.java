public class Compte{
    private int solde=0;

    public Compte(){

    }
    public Compte( int solde){

        this.setSolde(solde);
        

        }

        public int getSolde(){
            return solde;
        } 

    public void setSolde(int id){
            this.solde=solde;
        }
        public void depot(int montant){
            solde +=montant;
        }
        

}