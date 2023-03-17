import java.util.Random;

public class Пуффендуец extends ХогвартсСтудент {
    private int трудолюбие;
    private int верность;
    private int честность;

    public Пуффендуец(String имя, int силаМагии, int расстояниеТрансгресии, int трудолюбие, int верность, int честность) {
        super(имя, силаМагии, расстояниеТрансгресии);
        this.трудолюбие = трудолюбие;
        this.верность = верность;
        this.честность = честность;
    }
    final static Random RANDOM=new Random();
    public Пуффендуец(String имя) {  //второй конструктор, задающий способности случайно
        this(имя, RANDOM.nextInt(100), RANDOM.nextInt(100),
                RANDOM.nextInt(100),RANDOM.nextInt(100),RANDOM.nextInt(100));
    }

    public int getТрудолюбие() {
        return трудолюбие;
    }

    public int getВерность() {
        return верность;
    }

    public int getЧестность() {
        return честность;
    }

    public void setТрудолюбие(int трудолюбие) {
        this.трудолюбие = трудолюбие;
    }

    public void setВерность(int верность) {
        this.верность = верность;
    }

    public void setЧестность(int честность) {
        this.честность = честность;
    }
    @Override
    public final String имяПоФакультету() {  //переопределяет в ХогвартсСтудент
        return "Пуффендуец";
    }
    @Override
    public final int способностиПоФакультету() {  //переопределяет в ХогвартсСтудент
        return трудолюбие + верность + честность;
    }
    @Override
    public final String описаниеСпособностей() {  //переопределяет в ХогвартсСтудент
        return "трудолюбие: "+трудолюбие+", верность: "+верность + ", честность: "+честность;
    }
}

