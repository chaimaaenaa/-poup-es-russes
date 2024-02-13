import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

class PoupeeRusse extends Poupee {

    private PoupeeRusse dansPoupee;
    public PoupeeRusse(int taille) {

        super(taille);
        dansPoupee= null;
    }

    @Override
    public void open() {
        if (!getOpening()) {
            setOpen(true);
            System.out.println("Doll is opened.");
        }
    }

    @Override
    public void close() {
        if (getOpening()) {
            setOpen(false);
            System.out.println("Doll is closed.");
        }
    }

    @Override
    public void placeIn(Poupee pot) {
        if (!pot.getOpening() && dansPoupee != null &&
              pot.getTaille() < this.getTaille()) {
            System.out.println("Je suis sûr et certain il y a un problème");
        }
        else {
            setDansPoupee((PoupeeRusse) pot);
            System.out.println("PLacer in succesfly.");
        }
    }

    @Override
    public void getOutOf(Poupee pog) {
        if (pog.getOpening() && dansPoupee !=null   )  {
            setDansPoupee(null);
            System.out.println("Doll is got out of.");
        }
        else{
            System.out.println("Je suis sûr et certain il y a un problème");
        }
    }
    public PoupeeRusse getDansPoupee() {
        return dansPoupee;
    }

    public void setDansPoupee(PoupeeRusse dansPoupee) {
        this.dansPoupee = dansPoupee;
    }
}