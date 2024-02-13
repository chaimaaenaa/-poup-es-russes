public abstract class Poupee {
    private int taille;
    private boolean opening = false;

    public Poupee(int taille) {
        this.taille = taille;
    }

    public int getTaille() {
        return taille;
    }

    public void setTaille(int taille){
        this.taille = taille;
    }

    public boolean getOpening() {

        return opening;
    }

    public void setOpen(boolean opening) {
        this.opening = opening;
    }

    public abstract void open();

    public abstract void close();

    public abstract void  placeIn(Poupee po);

    public abstract void getOutOf(Poupee po);


}