import java.util.Random;

public class Когтевранец extends ХогвартсСтудент {
    //умны, мудры, остроумны и полны творчества
    private int ум;
    private int мудрость;
    private int остроумие;
    private int творчество;

    public Когтевранец(String имя, int силаМагии, int расстояниеТрансгресии,
                       int ум, int мудрость, int остроумие, int творчество) {
        super(имя, силаМагии, расстояниеТрансгресии);
        this.ум = ум;
        this.мудрость = мудрость;
        this.остроумие = остроумие;
        this.творчество = творчество;
    }
    final static Random RANDOM=new Random();
    public Когтевранец(String имя) {  //второй конструктор, задающий способности случайно
        this(имя, RANDOM.nextInt(100), RANDOM.nextInt(100), RANDOM.nextInt(100),
                RANDOM.nextInt(100),RANDOM.nextInt(100),RANDOM.nextInt(100));
    }

    public int getУм() {
        return ум;
    }

    public int getМудрость() {
        return мудрость;
    }

    public int getОстроумие() {
        return остроумие;
    }

    public int getТворчество() {
        return творчество;
    }

    public void setУм(int ум) {
        this.ум = ум;
    }

    public void setМудрость(int мудрость) {
        this.мудрость = мудрость;
    }

    public void setОстроумие(int остроумие) {
        this.остроумие = остроумие;
    }

    public void setТворчество(int творчество) {
        this.творчество = творчество;
    }

    @Override
    public final String имяПоФакультету() {  //переопределяет в ХогвартсСтудент
        return "Когтевранец";
    }
    @Override
    public final int способностиПоФакультету() {  //переопределяет в ХогвартсСтудент
        return ум + мудрость + остроумие + творчество;
    }
    @Override
    public final String описаниеСпособностей() {  //переопределяет в ХогвартсСтудент
        return "ум: "+ум+", мудрость: "+мудрость + ", остроумие: "+остроумие + ", творчество: " + творчество;
    }
}