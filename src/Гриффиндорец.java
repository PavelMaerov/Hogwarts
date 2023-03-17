import java.util.Random;

public class Гриффиндорец extends ХогвартсСтудент {
    private int благородство;
    private int честь;
    private int храбрость;

    public Гриффиндорец(String имя, int силаМагии, int расстояниеТрансгресии, int благородство, int честь, int храбрость) {
        super(имя, силаМагии, расстояниеТрансгресии);
        this.благородство = благородство;
        this.честь = честь;
        this.храбрость = храбрость;
    }
    final static Random RANDOM=new Random();
    public Гриффиндорец(String имя) {  //второй конструктор, задающий способности случайно
        this(имя, RANDOM.nextInt(100), RANDOM.nextInt(100),
                RANDOM.nextInt(100),RANDOM.nextInt(100),RANDOM.nextInt(100));
    }

    public int getБлагородство() {
        return благородство;
    }

    public int getЧесть() {
        return честь;
    }

    public int getХрабрость() {
        return храбрость;
    }

    public void setБлагородство(int благородство) {
        this.благородство = благородство;
    }

    public void setЧесть(int честь) {
        this.честь = честь;
    }

    public void setХрабрость(int храбрость) {
        this.храбрость = храбрость;
    }
    @Override
    public final String имяПоФакультету() {  //переопределяет в ХогвартсСтудент
        return "Гриффиндорец";  //.getClass() возвращает то же самое
    }
    @Override
    public final int способностиПоФакультету() {  //переопределяет в ХогвартсСтудент
        return благородство + честь + храбрость;
    }
    @Override
    public final String описаниеСпособностей() {  //переопределяет в ХогвартсСтудент
        return "благородство: "+благородство+", честь: "+честь + ", храбрость: "+храбрость;
    }
}
